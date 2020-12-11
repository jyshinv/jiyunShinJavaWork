package test4.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AcornFrame extends JFrame implements ActionListener {

	public AcornFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn=new JButton("전송");
		add(btn, BorderLayout.NORTH);
		btn.addActionListener(this);
		
		
	}
	
	public static void main(String[] args) {
		AcornFrame f=new AcornFrame("acorn");
		f.setBounds(100, 100, 400, 400);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "전송합니다");
		
	}
}
