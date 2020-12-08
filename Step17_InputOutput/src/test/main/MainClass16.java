package test.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass16 {
	public static void main(String[] args) {
		/*
		FileInputStream 객체를 이용해서
		c:/myFolder/1.jpg 에서 byte 데이터를 읽어들인다음

		FileOutputStream 객체를 이용해서
		c:/myFolder/copied.jpg 파일에 출력하기 
		*/
		
		//FileInputStream type 참조값을 담을 지역변수 미리 만들기
		FileInputStream fis=null;
		//FileOutputStream type 참조값을 담을 지역변수 미리 만들기 
		FileOutputStream fos=null;
		
		try {
			//new FileInputStream, new FileOutputStream을 단독사용하면 빨간줄! 커서 갖다대고 - Surround try/catch 하기
			//파일로부터 byte알갱이를 읽어들일 수 있는 객체 생성
			fis=new FileInputStream(new File("c:/myFolder/1.jpg"));
			//파일에 byte 알갱이를 출력할 수 있는 객체 생성
			fos=new FileOutputStream(new File("c:/myFolder/copied.jpg"));

			//파일을 1바이트씩 읽어들이다가 더이상 읽을 데이터가 없어 -1을 반환하면 탈출하기 
			while(true) {				
				//fis.read()는 1바이트를 읽어들인다. 
				int data=fis.read();//단독사용하면 빨간줄! 커서 갖다대고 add catch clause to surrounding try 클릭
				System.out.println(data); //콘솔에 출력해보기 
				if(data == -1) {//더이상 읽을 데이터가 없으면
					break; //반복문 탈출
				}
				fos.write(data); //출력할 준비
				fos.flush();//방출(실제 출력되는 시점)
			}
			System.out.println("파일을 성공적으로 복사했습니다.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { //예외가 발생하던 안하던 실행이 보장되는 블럭
			//마무리 작업(새로 open 한 스트림은 닫아 주어야한다.)
			//마무리 작업은 필수적인 작업이므로 finally 블럭에 담아주어야한다.
			//fis.close(), fos.close()는 단독사용하면 빨간 줄 뜬다. -> 커서대고 Surround with try/catch클릭
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
