package test.mypac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{
	
	/*
	버튼 2개를 만들고 
	하나는 지역변수에 ActionListener 객체의 참조값을 저장하고
	하나는 필드에 ActionListner 객체의 참조값을 저장하여
	버튼을 클릭했을 때 팝업창이 뜨도록 만들어보자.  
	*/
	
	//생성자
	public MyFrame() {
		//배치메니저를 사용하지 않겠다(절대 좌표에 절대 크기로 배치하겠다)
		//부모클래스 JFrame을 상속받았으니, 부모클래스의 메소드는 맘껏 사용 가능, this생략가능
		//super도 써보기 
		this.setLayout(null); 
		
		//버튼 객체 생성
		JButton btn=new JButton("눌러보셈");
		
		//버튼 위치 설정 
		btn.setBounds(50, 50, 100, 40);
		
		//프레임에 버튼 넣기 
		this.add(btn); //여기서 this는 생략이 가능하다, super도 써보기 
		
		ActionListener listener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MyFrame.this, "버튼을 눌렀네?");
			}
		};
		
		//지역변수에 저장된 ActionListener 객체 등록하기 
		btn.addActionListener(listener);
		
		//전송버튼 추가
		JButton sendBtn=new JButton("전송");
		
		//위치 설정
		sendBtn.setBounds(200, 50, 200, 40);
		
		//프레임에 버튼 넣기 
		add(sendBtn);
		
		//필드에 있는 ActionListener 등록하기 
		sendBtn.addActionListener(sendListener);
	}//생성자
	
	ActionListener sendListener=new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(MyFrame.this,"전송완료");
		}
	};
	

}
