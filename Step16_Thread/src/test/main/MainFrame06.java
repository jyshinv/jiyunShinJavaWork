package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import test.mypac.DownloadTask;


public class MainFrame06 extends JFrame implements ActionListener{
	//생성자
	public MainFrame06(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn=new JButton("알림 띄우기");
		btn.addActionListener(this);
		
		add(btn, BorderLayout.NORTH);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(this, "알림 입니다.!!!");

		//DownloadTask.java -> 꼭 이 클래스를 만들어서 구현해야할까?
//		//DownloadTask는 Runnable을 implements 했으므로 Runnable타입 변수에 넣어준다.
//		//Runnable인터페이스 type의 참조값을 얻어서
//		Runnable downTask=new DownloadTask();
//		//해당클래스로 생성한 객체의 참조값을 Thread객체를 생성하면서 생성자의 인자로 전달한다.
//		Thread t=new Thread(downTask);
//		t.start();
		
		//위의 코드는 아래코드와 같이 표현가능하다.
		//아래 코드는 굳이 DownloadTask를 만드는 수고를 덜어준다. 
		Runnable downTask=new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("다운로드를 시작 합니다...");
				try {
					for(int i=1; i<=100; i++) {
						System.out.println(i+" % ");
						Thread.sleep(100);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("다운로드를 종료 합니다...");
				
			}
		};
		Thread t=new Thread(downTask);
		t.start();
		
		
		
		
		System.out.println("actionPerformed() 메소드가 리턴 합니다.");
	}
	
	public static void main(String[] args) {
		MainFrame06 f=new MainFrame06("메인 프레임06");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}






