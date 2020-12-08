package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import test.mypac.SubThread;

public class MainFrame04 extends JFrame implements ActionListener{
	//생성자
	public MainFrame04(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn=new JButton("알림 띄우기");
		btn.addActionListener(this);
		
		add(btn, BorderLayout.NORTH);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(this, "알림 입니다.!!!");
//		//MainFrame02.java와 비교해보기 
//		//Thread클래스
//		Thread t=new Thread() { // 익명의 local inner class를 이용해서 Thread객체의 참조값을 생성해서 t에 담는다 
//			//run 메소드는 추상메소드가 아니기 때문에 오버라이드가 강제되지 않는다.
//			//상속받은 메소드를 선택적으로 오버라이드 해서 사용할 수 있다.
//			@Override
//			public void run() {
//				try {
//					System.out.println("무언가 10초(오랜시간)이 걸리는 작업을 합니다.");
//					Thread.sleep(10000);
//					System.out.println("시간이 오래 걸리는 작업이 끝났습니다.");
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		};
//		
//		//t.start() 하면 객체의 run()메소드를 호출시킨다.
//		t.start();
		
		//위의 코드는 아래와 같이 구현 가능하다. MainFrame03과 비교
		new Thread() { //익명의 local inner class를 이용해서 Thread객체를 생성한다. 
			@Override
			public void run() {
				try {
					System.out.println("무언가 10초(오랜시간)이 걸리는 작업을 합니다.");
					Thread.sleep(10000);
					System.out.println("시간이 오래 걸리는 작업이 끝났습니다.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		
		System.out.println("actionPerformed() 메소드가 리턴 합니다.");
	}
	
	public static void main(String[] args) {
		MainFrame04 f=new MainFrame04("메인 프레임04");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}






