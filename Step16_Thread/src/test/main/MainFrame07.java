package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import test.mypac.DownloadTask;


public class MainFrame07 extends JFrame implements ActionListener{
	//생성자
	public MainFrame07(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn=new JButton("알림 띄우기");
		btn.addActionListener(this);
		
		add(btn, BorderLayout.NORTH);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(this, "알림 입니다.!!!");

		
		//MainFrame06와 비교해보기 
		new Thread(new Runnable() {
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
		}).start();
		
		
		
		System.out.println("actionPerformed() 메소드가 리턴 합니다.");
	}
	
	public static void main(String[] args) {
		MainFrame07 f=new MainFrame07("메인 프레임07");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}






