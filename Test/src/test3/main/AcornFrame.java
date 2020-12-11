package test3.main;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AcornFrame extends JFrame {

	public AcornFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn=new JButton("전송");
		add(btn, BorderLayout.NORTH);
		
		
	}
	
	public static void main(String[] args) {
		AcornFrame f=new AcornFrame("acorn");
		f.setBounds(100, 100, 400, 400);
		f.setVisible(true);
	}
}
