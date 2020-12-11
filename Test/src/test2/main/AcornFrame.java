package test2.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class AcornFrame extends JFrame {

	public AcornFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		
	}
	
	public static void main(String[] args) {
		AcornFrame f=new AcornFrame("acorn");
		f.setBounds(100, 100, 400, 400);
		f.setVisible(true);
	}
}
