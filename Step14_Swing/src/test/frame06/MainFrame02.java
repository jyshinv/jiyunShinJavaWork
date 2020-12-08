package test.frame06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame02 extends JFrame implements ActionListener{

	//생성자
	public MainFrame02(String title) {
		super(title);
		//레이아웃 지정
		setLayout(new FlowLayout());
		
		//버튼
		JButton sBtn=new JButton("가위");
		JButton rBtn=new JButton("바위");
		JButton pBtn=new JButton("보");
		sBtn.setActionCommand("가위");
		rBtn.setActionCommand("바위");
		pBtn.setActionCommand("보");
		
		//버튼을 프레임에 추가
		add(rBtn);
		add(sBtn);
		add(pBtn);
		
		//버튼에 리스너 등록
		rBtn.addActionListener(this);
		sBtn.addActionListener(this);
		pBtn.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//랜덤한 값을 얻어내기 위한 객체 생성
		Random ran=new Random();

		//0~3 사이의 랜덤한 정수가 나온다.
		int ranNum=ran.nextInt(3);
		//JOptionPane.showMessageDialog(this, "발생된 랜덤 정수:"+ranNum);
		
		//유저가 낸 가위바위보
		String getrsp=e.getActionCommand();

		//0:가위 1:바위 2:보
		String msg=null;
		if(ranNum==0) { //가위
			if(getrsp.equals("가위")) {
				msg="com:가위, 비겼습니다.";
			}else if(getrsp.equals("바위")) {
				msg="com:가위, 이겼습니다.";
			}else if(getrsp.equals("보")){
				msg="com:가위, 졌습니다.";
			}
			
		}else if(ranNum==1) { //바위
			if(getrsp.equals("가위")) {
				msg="com:바위, 졌습니다..";
			}else if(getrsp.equals("바위")) {
				msg="com:바위, 비겼습니다.";
			}else if(getrsp.equals("보")){
				msg="com:바위, 이겼습니다.";
			}
		}else if(ranNum==2) { //보
			if(getrsp.equals("가위")) {
				msg="com:보, 이겼습니다.";
			}else if(getrsp.equals("바위")) {
				msg="com:보, 졌습니다.";
			}else if(getrsp.equals("보")){
				msg="com:보, 비겼습니다..";
			}
		}
		
		JOptionPane.showMessageDialog(this, msg);
		
	}
	
	public static void main(String[] args) {
		MainFrame02 f=new MainFrame02("메인 프레임");
		f.setBounds(100,100,300,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
