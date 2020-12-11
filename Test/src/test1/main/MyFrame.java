package test1.main;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame(String a) {
		super(a);
		setBounds(100,100,300,400);

	}
	
	public static void main(String[] args) {
		JFrame myFrame=new JFrame("Monkey");
		//myFrame.setBounds(100, 100, 300, 400);
        //myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        myFrame.setVisible(true);
	}
}


