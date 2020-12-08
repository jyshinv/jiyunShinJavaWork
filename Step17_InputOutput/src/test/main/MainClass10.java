package test.main;

import java.io.File;

public class MainClass10 {
	public static void main(String[] args) {
		
		for(int i=0; i<100; i++) {
			File tmp=new File("c:/myFolder/gura"+i);
			tmp.mkdir(); //디렉토리를 만들어라.
		}
		System.out.println("오예~");
		
		
	}

}
