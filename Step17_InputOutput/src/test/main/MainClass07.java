package test.main;

import java.io.File;

public class MainClass07 {
	public static void main(String[] args) {
		//c:/에 access할 수 있는 File 객체 생성해서 참조값을 myFile에 담기
		File myFile=new File("c:/");
		
		//c:/ 하위의 폴더명 혹은 파일명을 문자열 배열로 얻어내기  
		String[] names=myFile.list(); //myFile.list()의 리턴타입은 String[]
		
		//출력해보기--> 내 c드라이브에 있는 파일명이 출력된다. 
		for(int i=0; i<names.length; i++) {
			String tmp=names[i];
			System.out.println(tmp);
		}
		System.out.println("------향상된 for문으로-------");
		for(String tmp:names) {
			System.out.println(tmp);
		}
				
	}
}
