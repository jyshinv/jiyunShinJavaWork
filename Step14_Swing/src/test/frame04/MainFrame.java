package test.frame04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame implements ActionListener, KeyListener {
	// 필드
	JTextField inputText;
	JLabel label1;

	// 생성자
	public MainFrame(String title) {
		super(title);

		// 부모클래스의 메소드를 사용가능
		// 레이아웃 매니저 설정
		setLayout(new BorderLayout());

		// 텍스트 필드와 버튼 객체를 만들어서
		this.inputText = new JTextField(10);// this생략 가능, 참조값을 필드에 저장한다.
		JButton sendBtn = new JButton("전송");
		inputText.setActionCommand("inputText");

		// 패널 객체 생성한 다음
		JPanel topPanel = new JPanel();

		// 패널에 텍스트 필드와 버튼을 추가하고
		topPanel.add(inputText);
		topPanel.add(sendBtn);

		// 패널의 배경색 지정
		topPanel.setBackground(Color.blue);

		// 패널의 배경색 지정
		topPanel.setBackground(Color.YELLOW);

		// 패널채로 프레임의 북쪽에 배치하기
		add(topPanel, BorderLayout.NORTH);

		// 버튼에 리스너 등록
		sendBtn.addActionListener(this);

		// 레이블을 만들어서
		label1 = new JLabel();

		// 패널에 추가하기
		topPanel.add(label1);

		// addKeyListener도 implement해야 아래처럼 사용가능하다.
		inputText.addKeyListener(this);

	}

	// run했을 때 실행순서가 시작되는 main 메소드
	public static void main(String[] args) {
		MainFrame f = new MainFrame("메인프레인");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	// Action listener 인터페이스 메소드 강제로 재정의
	@Override
	public void actionPerformed(ActionEvent e) {
		// 1.JTextField에 입력한 문자열을 읽어와서
		String msg = this.inputText.getText();

		// 2.레이블에 출력한다.
		label1.setText(msg);
	}

	// KeyListener 인터페이스 implelment로 인한 메소드 강제로 재정의
	@Override
	public void keyPressed(KeyEvent e) {
		// 눌러진 키의 코드값 읽어오기
		int code = e.getKeyCode();

//		System.out.println(code); //enter의 code는 10
//		if(code==10) {
//			//1.JTextField에 입력한 문자열을 읽어와서
//			String msg=this.inputText.getText();
//			
//			//2.레이블에 출력한다.
//			label1.setText(msg);
//			
//			//3.입력창 초기화
//			inputText.setText("");
//		}

		// 위의 코드는 미리 정의된 상수를 통해서 구현 가능하다.
		if (code == KeyEvent.VK_ENTER) {
			// 1.JTextField에 입력한 문자열을 읽어와서
			String msg = this.inputText.getText();

			// 2.레이블에 출력한다.
			label1.setText(msg);

			// 3.입력창 초기화
			inputText.setText("");
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("release");

	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("typed");

	}

}
