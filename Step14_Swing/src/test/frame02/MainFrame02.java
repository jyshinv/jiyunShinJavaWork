package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame02 extends JFrame {

	// 필드
	// 리스너 객체 3개 생성하기
	//new+익명클래스 사용해서 리스너 생성
	ActionListener listenerSend = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(MainFrame02.this, "전송완료");

		}
	};
	//람다식 사용해서 리스너 생성
	ActionListener listenerUpdate = (e)->{
		JOptionPane.showMessageDialog(MainFrame02.this, "수정완료");
	};
	
	//람다식 사용해서 리스너 생성
	ActionListener listenerDelete =(e)->{
		JOptionPane.showMessageDialog(MainFrame02.this, "삭제완료");
	};

	// 생성자
	public MainFrame02(String title) {
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
		sendBtn.addActionListener(this.listenerSend); //listenerSend도 가능 this는 생략가능하다.
		updateBtn.addActionListener(listenerUpdate); //this생략
		deleteBtn.addActionListener(listenerDelete); //this생략

	}

	// main 메소드
	public static void main(String[] args) {
		MainFrame02 f = new MainFrame02("메인프레임");
		// 위치와 크기 지정
		f.setBounds(100, 100, 500, 300);

		// 프레임을 닫으면 프로세스가 종료되도록 (앱이 종료되도록)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 화면상에 실제 보이게 한다.
		f.setVisible(true);
	}

}
