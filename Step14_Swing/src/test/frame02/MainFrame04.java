package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//MainFramd03에서 필드 부분에 리스너 인터페이스를 생성하고 재정의했는데
//클래스에서 바로 인터페이스를 implements 해보자.
//implements ActionListener를 클래스선언부분에 작성하자마자 빨간 줄이 뜨며 에러가 난다.
//에러가 나는 이유는? 인터페이스의 메소드를 재정의하지 않았기 때문
//따라서 빨간 줄에 커서를 갖다대면 add unimplelmented method 버튼이 뜨고 그 버튼을 눌러 
//actionPerformed(ActionEvent e) 메소드를 재정의 해보자. 
//또한 implelments했을 때 this가 무엇인지 MainFrame03.java와 비교해보자
public class MainFrame04 extends JFrame implements ActionListener {

	// 생성자
	public MainFrame04(String title) {
		super(title); // 부모생성자에 전달하기
		
		//여기서 this가 무엇인지 생각하기!
		ActionListener a=this;
		JFrame b=this;
		MainFrame04 c=this;
		Object d=this;

		// 레이아웃 매니저 지정하기
		// JFrame이 부모클래스, 부모클래스의 메소드 맘껏 사용가능
		setLayout(new FlowLayout()); // 물 흐르듯이 배치되는 레이아웃

		// 버튼 만들기 
		JButton sendBtn = new JButton("전송");
		JButton updateBtn = new JButton("수정");
		JButton deleteBtn = new JButton("삭제");

		// 버튼을 프레임에 배치하기
		// JFrame이 부모클래스, 부모클래스의 메소드 맘껏 사용가능
		add(sendBtn);
		add(updateBtn);
		add(deleteBtn);

		// 버튼에 리스너 등록하기
		sendBtn.addActionListener(this); //MainFrame03.java와 달라진점 확인 
		updateBtn.addActionListener(this); 
		deleteBtn.addActionListener(this); 
		
		//버튼에 ActionCommand를 원하는대로 지정할 수 있다. 
		sendBtn.setActionCommand("send");
		updateBtn.setActionCommand("update");
		deleteBtn.setActionCommand("delete");

	}

	// main 메소드
	public static void main(String[] args) {
		MainFrame04 f = new MainFrame04("메인프레임");
		// 위치와 크기 지정
		f.setBounds(100, 100, 500, 300);

		// 프레임을 닫으면 프로세스가 종료되도록 (앱이 종료되도록)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 화면상에 실제 보이게 한다.
		f.setVisible(true);
	}

	//MainFrame04 가 implements ActionListener 했으므로 강제 구현된 메소드 actionPerformed()...
	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트가 일어난 UI(Button)의 ActionCommand 값을 읽어온다.
		String command=e.getActionCommand();
		//문자열(String)의 내용을 비교할 때는 ==를 사용하지 말고 .equals() 메소드를 이용해야한다.
		if(command.equals("send")) {
			JOptionPane.showMessageDialog(this, "전송완료");
		}else if(command.equals("update")) {
			JOptionPane.showMessageDialog(this, "수정완료");
		}else if(command.equals("delete")) {
			JOptionPane.showMessageDialog(this, "삭제완료");
			
		}
		
	}

}
