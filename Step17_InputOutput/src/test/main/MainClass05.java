/*12월3일 첫작성*/
package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		//콘솔창에 출력할 수 있는 객체의 참조값을 ps라는 지역 변수에 담기 
		//out System클래스의 static필드이며, PrintStream타입이다.
		PrintStream ps=System.out;
		
		//학습을 위해서 PrintStream 객체를 부모 type OutputStream 변수에 담기 
		OutputStream os=ps;
		
		//2byte 처리
		OutputStreamWriter osw=new OutputStreamWriter(os);
		
		//osw.write()는 강제로 try~catch해주어야함
		try {
			//os.write()는 개행을 해주지 않음
			osw.write("안녕하세요!");
			osw.write("\r\n"); //개행을 넣어주어야 개행이 된다.
			osw.write("어쩌구...");
			osw.write("\r\n"); //개행을 넣어주어야 개행이 된다.
			osw.write("저쩌구");
			osw.flush();
			//\r,\n 둘다 개행기호이며 둘다 써주면 
			//모든 운영체제, 편집기에서 개행이 된다. (어떤데는 \n을 개행으로, 어떤데는 \r을 개행을 취급하기 때문!) 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
