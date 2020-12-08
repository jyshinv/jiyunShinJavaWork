package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import test.mypac.DownloadTask;
import test.mypac.SubThread;

public class MainFrame05 extends JFrame implements ActionListener{
	//생성자
	public MainFrame05(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn=new JButton("알림 띄우기");
		btn.addActionListener(this);
		
		add(btn, BorderLayout.NORTH);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(this, "알림 입니다.!!!");

		//DownloadTask는 Runnable을 implements 했으므로 Runnable타입 변수에 넣어준다.
		//Runnable인터페이스 type의 참조값을 얻어서
		Runnable downTask=new DownloadTask();
		//해당클래스로 생성한 객체의 참조값을 Thread객체를 생성하면서 생성자의 인자로 전달한다.
		//Thread클래스에는 실제로 Runnable type을 인자로 받는 생성자가 있다. 그림참고
		Thread t=new Thread(downTask);
		t.start();
		
		
		
		System.out.println("actionPerformed() 메소드가 리턴 합니다.");
	}
	
	public static void main(String[] args) {
		MainFrame05 f=new MainFrame05("메인 프레임05");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}






