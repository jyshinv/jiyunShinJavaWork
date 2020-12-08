package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass02 {
	public static void main(String[] args) {
		
		System.out.println("메인메소드가 시작됩니다.");
		
		//키보드로부터 입력받을 수 있는 객체의 참조값을 kbd라는 이름의 지역변수에 담기
		InputStream kbd=System.in;
		InputStreamReader isr=new InputStreamReader(kbd);
		
		//isr.reae()는 강제로 try~catch 해야함
		try {
			System.out.print("1글자 입력(한글가능):");
			int code=isr.read(); //int type으로 반환한다. 
			System.out.println("code:"+code);
			char ch=(char)code;
			System.out.println("입력한 문자는: "+ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인메소드가 종료됩니다.");
		
	}
}
