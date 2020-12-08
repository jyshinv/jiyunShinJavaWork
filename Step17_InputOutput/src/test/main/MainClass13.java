package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass13 {
	public static void main(String[] args) {
		/*
		Maind
		c:/myFolder/memo.txt 파일에 저장된 문자열을 읽어와서
		콘솔창에 출력하는 코드를 작성해 보세요.
		hint -> 방법1 : new FileReader() -->이 객체의 read() 메소느는 한문자만 읽기 가능
		hint -> 방법2 : new BufferedReader() --> 이 객체의 read() 메소드는 개행기호가 나올때까지 읽음, 즉 한줄 읽기 가능
		*/
		
		//1. 파일 객체를 생성한다. 
		File f=new File("c:/myFolder/memo.txt");

		try {
			FileReader fr=new FileReader(f); //-> 단독으로 쓰면 빨간줄 뜬다.커서 대고 surround with try/catch
			
			//step01)
			//아래 3줄의 코드는 '김'만 출력된다. -> while문 안에 넣어보자!
			//또 알아둘 것 fr.read() 단독으로 쓰면 빨간줄 뜬다 
			//이때는 커서 대고 add catch clause to surrounding try 
			//(try/catch문이 새로 생성되는 것이 아닌 catch문만 추가된다.)
//			int code=fr.read(); //한문자만 읽기 가능
//			char ch=(char)code;//개행해주며 출력하기 	
//			System.out.println(ch);//한문자씩 개행해주며 출력하기 	

			
			//step02)
			//위의 3줄을 while문 안에 넣어보자!
			//위의 3줄의 코드를 무한루프로 돌면서 수행하다가
			//read() 메소드가 -1을 리턴하면서 루프를 탈출하게 만들어보자
//			while(true) {
//				int code=fr.read(); //한문자만 읽기 가능,읽을 것이 없으면 -1을 반환한다. 
//				char ch=(char)code;
//				System.out.println(ch);//한문자씩 개행해주며 출력하기 	
			
			
			
			//step03) 최종!
			//if문을 넣어 진짜 탈출시키기
			while(true) {
				int code=fr.read(); //한문자만 읽기 가능,읽을 것이 없으면 -1을 반환한다. 
				//만일 code 가 -1과 같으면 반복문 while을 탈출하세요.
				if(code==-1) {
					System.out.println(code); //-1을 반환함을 알 수 있음
					//break 예약어는 반복문을 탈출하는 예약어이다. 
					break;
					
				}
				char ch=(char)code; 
				System.out.println(ch);//한문자씩 개행해주며 출력하기 (print 로도 해보기)		
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
