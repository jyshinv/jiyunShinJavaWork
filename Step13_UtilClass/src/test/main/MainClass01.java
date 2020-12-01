package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		키보드로부터 문자열을 입력받기 위한 Scanner 객체를 생성한다.
		생성자의 인자로는 키보드로부터 입력받을 수 있는 InputStream type
		객체를 전달해주어야한다.
		해당객체는 System 클래스에 static final 상수 in이라는 필드에
		참조값이 미리 준비되어 있으므로 그 값을 생성자에 전달하면 된다. 
		
		입출력에 관여하는 객체들
		Scanner
		System
		inputStream 객체
		printStream 객체 
	
		*/
		Scanner scan = new Scanner(System.in);
		//콘솔창을 여는(out) 용도로 문자열을 한줄 출력해준다.
		System.out.print("문자열 입력:");

		//콘솔로 부터 문자열 한 줄 입력받기
		//아래 코드에서 1줄에서 return 되지않고 머물러 있는다. enter을 치면 return하며 메소드가 종료된다.(블로킹되어있다.)
		String line = scan.nextLine(); 
		
		System.out.println("입력한 내용:" +line);
		System.out.println("main 메소드가 종료됩니다.");
		
		
		
		
		
		
	}

}
