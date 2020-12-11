package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//JFrame을 직접 extends해서 사용해보자 
public class MainFrame01 extends JFrame {
	//생성자
	public MainFrame01(String title) {
		super(title); //부모생성자에 전달하기
		
		//레이아웃 매니저 지정하기
		//JFrame이 부모클래스, 부모클래스의 메소드 맘껏 사용가능
		setLayout(new FlowLayout()); //물 흐르듯이 배치되는 레이아웃
		
		//버튼
		JButton sendBtn=new JButton("전송");
		JButton updateBtn=new JButton("수정");
		JButton deleteBtn=new JButton("삭제");
		
		//버튼을 프레임에 배치하기
		//JFrame이 부모클래스, 부모클래스의 메소드 맘껏 사용가능
		add(sendBtn);
		add(updateBtn);
		add(deleteBtn);
		
		//버튼에 리스너 등록방법1 (리스너 생성과 동시에 버튼에 등록)
		//버튼에 리스너 객체 new+익명클래스로 등록
		sendBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame01.this, "전송합니다.");
			}
		});
		
		//버튼에 리스너 등록방법2 (리스너 생성과 동시에 버튼에 등록)
		//버튼에 리스너 객체 람다식으로 등록하기 
		updateBtn.addActionListener((e)->{
			JOptionPane.showMessageDialog(MainFrame01.this, "수정완료");
		});
		
		//버튼에 리스너 등록방법2 (리스너 생성과 동시에 버튼에 등록)
		//버튼에 리스너 객체 람다식으로 등록
		deleteBtn.addActionListener((e)->{
			JOptionPane.showMessageDialog(MainFrame01.this, "삭제완료");
		});
		
		
		
	}
	
	//main 메소드
	public static void main(String[] args) {
		MainFrame01 f=new MainFrame01("메인프레임");
		//프레임의 위치와 크기 지정함. 프레임이 뜰 화면에서  100,100 떨어진 곳에 위치하고 크기는 500,300을 가짐
		f.setBounds(100, 100, 500, 300);
		
		//프레임을 닫으면 프로세스가 종료되도록 (앱이 종료되도록)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//화면상에 실제 보이게 한다.
		f.setVisible(true);
	}
	
}
