package test.frame01;

import test.mypac.MyFrame;

//MainClass01을 MyFrame 클래스를 생성하여 구현해보자.
public class MainClass02 {
	public static void main(String[] args) {
		MyFrame mf=new MyFrame();
		mf.setTitle("나의 프레임");
		mf.setSize(500, 300);
		mf.setLocation(100, 100);
		mf.setVisible(true);
	}
}

