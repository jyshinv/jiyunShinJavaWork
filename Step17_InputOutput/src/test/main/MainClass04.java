/*12월3일 첫작성*/
package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		//콘솔창에 출력할 수 있는 객체의 참조값을 ps라는 지역 변수에 담기 
		//out은 System클래스의 static필드이며, PrintStream타입이다.
		PrintStream ps=System.out;
		
		//학습을 위해서 PrintStream 객체를 부모 type OutputStream 변수에 담기 
		OutputStream os=ps;
		
		//os.write()는 강제로 try~catch 해주어야함
		try {
			//os.write()는 개행을 해주지 않음
			os.write(65);
			os.write(66);
			os.write(67);
			os.flush(); //.flush() 하는 시점에 출력된다. 실제로 System.out.println에는 flush기능이 있다. 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
