package test1.main;

import javax.swing.JFrame;

public class AcornFrame extends JFrame {

	public AcornFrame(String title) {
		super(title);
		
	}
	
	public static void main(String[] args) {
		AcornFrame f=new AcornFrame("acorn");
		f.setBounds(100, 100, 400, 400);
		f.setVisible(true);
	}
}
