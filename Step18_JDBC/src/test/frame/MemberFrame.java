package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MemberFrame extends JFrame implements ActionListener, PropertyChangeListener {
	//필드
	JTextField text_name;
	JTextField text_addr;
	MemberDao dao = new MemberDao();
	DefaultTableModel model;
	JTable table;

	// 생성자
	public MemberFrame(String title) {
		super(title);
		//프레임의 레이아웃 법칙 지정하기
		setLayout(new BorderLayout());
		//상단 페널
		JPanel topPanel=new JPanel();
		topPanel.setBackground(Color.YELLOW);
		//페널을 상단에 배치하기 
		add(topPanel, BorderLayout.NORTH);
		//페널에 추가할 UI 객체를 생성해서 
		JLabel label_name=new JLabel("이름");
		JLabel label_addr=new JLabel("주소");
		text_name=new JTextField(10);
		text_addr=new JTextField(10);
		JButton btn_add=new JButton("추가");
		//페널에 순서대로 추가하기
		topPanel.add(label_name);
		topPanel.add(text_name);
		topPanel.add(label_addr);
		topPanel.add(text_addr);
		topPanel.add(btn_add);
		//버튼에 Action command 지정
		btn_add.setActionCommand("add");
		
		// 버튼에 리스너 등록
		btn_add.addActionListener(this);
		
		//회원 목록을 출력할 테이블
		table=new JTable();
		
		//칼럼명을 String[]에 순서대로 준비하기
		String[] colNames= {"번호","이름","주소"};
		
		//테이블에 연결할 기본 모델 객체
		model=new DefaultTableModel(colNames, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				//0번째 열인 번호만 수정 불가능하게 하려면 어떻게 해야할까?
				if(column == 0) { // 0번째 컬럼은 수정불가하게
					return false;
				}else { //나머지 칼럼은
					return true; //수정가능하게 
				}
			}
		};

		
		//모델을 테이블에 연결하기
		table.setModel(model);
		
		//테이블의 내용이 scroll 될 수 있도록 스크롤 페널로 감싼다.
		JScrollPane scPane=new JScrollPane(table);
		
		//스크롤 패널을 프래임의 중앙에 배치하기
		add(scPane, BorderLayout.CENTER);

		//회원 목록을 테이블에 출력하기
		printMember();
		
		//삭제버튼
		JButton btn_delete=new JButton("삭제");
		btn_delete.addActionListener(this);
		btn_delete.setActionCommand("delete");
		
		//삭제버튼을 상단 패널에 추가하기
		topPanel.add(btn_delete);
		
		//회원목록을 주기적으로 업데이트해주는 스레드 시작 시키기
		new UpdateThread().start(); //스레드의 run()메소드를 호출해준다. 
		
		//테이블에 특정 이벤트가 발생할때까지 기다리는 리스너 등록(포커스를 줄때까지 기다리고있다)
		table.addPropertyChangeListener(this);
		
		
		
	}

	// 메인 메소드
	public static void main(String[] args) {
		MemberFrame f = new MemberFrame("회원정보 관리");
		f.setBounds(100, 100, 800, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 눌러진 버튼의 action command 를 읽어온다.
		String command = e.getActionCommand();
		if (command.equals("add")) { // 추가 버튼을 눌렀을때
			addMember();
		} else if (command.equals("delete")) { // 삭제 버튼을 눌렀을 때
			deleteMember();
		}
	}
	
	//회원정보를 삭제하는 메소드
	public void deleteMember() {
		// 선택된 row의 인덱스를 읽어온다.
		int selectedIndex = table.getSelectedRow();
		if (selectedIndex == -1) {
			JOptionPane.showMessageDialog(this, "삭제할 row를 선택해라");
			return; // 메소드를 여기서 끝내라
		}
		
		// 선택한 row의 0번 칼럼의 값(번호)를 읽어와서 int로 casting하기
		int num = (int) table.getValueAt(selectedIndex, 0);
		
		//삭제하기전에 한번 확인하기 
		int result=JOptionPane.showConfirmDialog(this, num+"번 회원을 삭제할래?");
		
		//만일 yes를 눌렀을 때
		if(result==JOptionPane.YES_OPTION) {
			// MemberDto 객체를 이용해서 삭제하기
			new MemberDao().delete(num);
			// UI업데이트(목록 다시 출려하기)
			printMember();
			
		}
		
		
	}

	// 회원정보를 추가하는 메소드
	public void addMember() {

		// 1. 입력한 이름과 주소를 읽어와서
		String name = text_name.getText();
		String addr = text_addr.getText();
		// 2. MemberDto 객체에 담고
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		// 3. MemberDao 객체를 이용해서 DB 에 저장
		MemberDao dao = new MemberDao();
		// 작업의 성공여부를 isSuccess 에 담기
		boolean isSuccess = dao.insert(dto);
		// 실제 저장되었는지 확인해 보세요.
		if (isSuccess) {
			JOptionPane.showMessageDialog(this, name + " 의 정보 추가성공");
			// 테이블에 다시 목록 불러오기
			printMember();
		} else {
			JOptionPane.showMessageDialog(this, "추가 실패!");
		}
		
		text_name.setText(null);
		text_addr.setText(null);
	}

	//회원정보를 테이블에 출력하는 메소드 
	public void printMember() {

		// 모델의 메소드 확인해보기 --> 아래 setRowCount(0) 코드가 있어 실제로 테이블에 나타나지 않지만
		//addRow의 사용법을 알기 위해 아래 코드를 공부해보자.
		//addRow는 Object[] 타입과, Vector타입을 인자로 받는다. 
		Object[] row1 = { 1, "김구라", "노량진" };
		Object[] row2 = { 2, "해골", "행신동" };
		model.addRow(row1);
		model.addRow(row2);

		// Vector는 약간 무거운 ArrayList 라고 생각하고 쓰면 된다.(성능이 추가됨)
		// Vector은 List인터페이스를 구현하였으므로 아래와 같이 업캐스팅하여 쓸 수 있다.
		List<Object> vec1 = new Vector<Object>();
		vec1.add(3);
		vec1.add("원숭이");
		vec1.add("상도동");
		model.addRow((Vector) vec1); // addRow()메소드는 Vector타입을 인자로 받는다.(다운캐스팅 해주어야한다.)

		Vector<Object> vec2 = new Vector<Object>();
		vec1.add(4);
		vec1.add("원숭이2");
		vec1.add("상도동2");
		model.addRow(vec2);

		// 데이터베이스의 내용을 테이블에 표시해보기
		List<MemberDto> list = dao.selectAll();

		// 기존에 출력된 내용 초기화
		// 초기화 해주지 않으면 아래 쌓인다.
		model.setRowCount(0); // 0 개의 row 로 강제로 초기화 하고
		
		for (MemberDto dl : list) {
			Object[] row = { dl.getNum(), dl.getName(), dl.getAddr() };
			model.addRow(row);
		}

		// 위의 for문은 아래와같이 쓸 수 있다. (Vector로구현)
//		for(MemberDto tmp:list) {
//			Vector<Object> row=new Vector<>();
//			row.add(tmp.getNum());
//			row.add(tmp.getName());
//			row.add(tmp.getAddr());
//	
//			model.addRow(row);
//		}

	}
	
	//화면을 주기적으로 update해주는 스레드
	class UpdateThread extends Thread{
		@Override
		public void run() {
			//바깥에 싸고 있는 클래스의 멤버 메소드 printMember() 메소드를
			//5초마다 한번씩 주기적으로 호출하기
			while(true) {
				try {
					//30초 
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				printMember();
			}
		}
	}

	//table 칼럼이 수정중인지 여부
	boolean isEditing=false;
	
	//PropertyChangeListener인터페이스를 구현하였기 때문에 오버라이딩
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("change!");
		//evt.getPropertyName() --> 이벤트가 발생할 때마다 호출된다. tableCellEditor를 반환한다.
		//propertyChangeListner를 테이블에 등록하면
		//테이블에 포커스를 줄때(클릭했을때), 클릭 후 내용을 수정하고 엔터를 쳤을 때 2번 발생된다.
		
		//만일 table 칼럼에서 발생한 이벤트라면 
		if(evt.getPropertyName().equals("tableCellEditor")) {
			if(isEditing) {
				//수정중인 테이블 row값을 읽어와서 DB에 수정 반영하고 
				int selectedIndex=table.getSelectedRow();
				int num=(int)model.getValueAt(selectedIndex, 0);
				String name=(String)model.getValueAt(selectedIndex, 1);
				String addr=(String)model.getValueAt(selectedIndex, 2);
				MemberDto dto=new MemberDto(num, name, addr);
				dao.update(dto);
				
			}
			//isEditing 의 값을 반대로 바꿔준다. true => false, false => true
			isEditing=!isEditing;  
			
		}
		
	}
}//end of class
