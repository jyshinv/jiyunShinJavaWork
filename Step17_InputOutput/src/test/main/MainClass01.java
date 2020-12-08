package test.main;

import java.io.IOException;
import java.io.InputStream;

public class MainClass01 {
	public static void main(String[] args) {
		//InputStream 과 OutPutStream - 1byte씩 처리하는 Stream
		//키보드로부터 입력 받을 수 있는 객체의 참조값을 kbd라는 이름의 지역변수에 담기
		System.out.println("메인메소드가 시작됩니다.");
		InputStream kbd=System.in;
		
		//kbd.read()은 반드시 try~catch처리해야함
		try {
			System.out.print("문자 1개 입력:");//print는 개행이 없음
			int code=kbd.read(); //int type으로 반환한다. 
			
			//코드에 대응되는 문자 1개 얻어내는 방법
			char ch=(char)code; //한글은 안먹음 
			System.out.println("입력한 문자 : "+ch);
			
			System.out.println("code: "+code);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인메소드가 종료됩니다.");
		
	}
}
