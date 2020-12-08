/*12월3일 첫작성*/
package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		//콘솔창에 출력할 수 있는 객체의 참조값을 ps라는 지역 변수에 담기 
		//out System클래스의 static필드이며, PrintStream타입이다.
		PrintStream ps=System.out;
		
		//학습을 위해서 PrintStream 객체를 부모 type OutputStream 변수에 담기 
		OutputStream os=ps;
		
		//2byte 처리
		OutputStreamWriter osw=new OutputStreamWriter(os);
		
		//기능을 MainClass05보다 up하기
		BufferedWriter bw=new BufferedWriter(osw);
		
		//bw.write()는 강제로 try~catch해주어야한다. 
		try {
			bw.write("안녕하세요");
			bw.newLine(); //BufferedWriter에는 newLine() 기능이 있다. 
			bw.write("어쩌고...");
			bw.newLine(); //BufferedWriter에는 newLine() 기능이 있다. 
			bw.write("저쩌고~");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
