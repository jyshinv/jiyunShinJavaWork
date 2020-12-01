package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame03 extends JFrame {

	// 필드에 ActionListener
	// 리스너 객체 1개만 만들어서 각 버튼에 등록해보기 
	ActionListener listener = new ActionListener() {
		
		//인자로 전달되는 ActionEvent 객체에는 눌러진 버튼의 정보가 들어있다.
		//ActionEvent e 에서 e에 .을 찍어 확인해보자.
		@Override
		public void actionPerformed(ActionEvent e) {
			//이벤트가 일어난 UI(Button)의 ActionCommand 값을 읽어온다.
			String command=e.getActionCommand();
			//문자열(String)의 내용을 비교할 때는 ==를 사용하지 말고 .equals() 메소드를 이용해야한다.
			if(command.equals("send")) {
				JOptionPane.showMessageDialog(MainFrame03.this, "전송완료");
			}else if(command.equals("update")) {
				JOptionPane.showMessageDialog(MainFrame03.this, "수정완료");
			}else if(command.equals("delete")) {
				JOptionPane.showMessageDialog(MainFrame03.this, "삭제완료");
				
			}

		}
	};


	// 생성자
	public MainFrame03(String title) {
		super(title); // 부모생성자에 전달하기

		// 레이아웃 매니저 지정하기
		// JFrame이 부모클래스, 부모클래스의 메소드 맘껏 사용가능
		setLayout(new FlowLayout()); // 물 흐르듯이 배치되는 레이아웃

		// 버튼
		JButton sendBtn = new JButton("전송");
		JButton updateBtn = new JButton("수정");
		JButton deleteBtn = new JButton("삭제");

		// 버튼을 프레임에 배치하기
		// JFrame이 부모클래스, 부모클래스의 메소드 맘껏 사용가능
		add(sendBtn);
		add(updateBtn);
		add(deleteBtn);

		// 버튼에 리스너 등록하기
		sendBtn.addActionListener(listener); //this.listenerSend도 가능 this는 생략가능하다.
		updateBtn.addActionListener(listener); //this생략
		deleteBtn.addActionListener(listener); //this생략
		
		//버튼에 ActionCommand를 원하는대로 지정할 수 있다. 
		sendBtn.setActionCommand("send");
		updateBtn.setActionCommand("update");
		deleteBtn.setActionCommand("delete");

	}

	// main 메소드
	public static void main(String[] args) {
		MainFrame03 f = new MainFrame03("메인프레임");
		// 위치와 크기 지정
		f.setBounds(100, 100, 500, 300);

		// 프레임을 닫으면 프로세스가 종료되도록 (앱이 종료되도록)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 화면상에 실제 보이게 한다.
		f.setVisible(true);
	}

}
