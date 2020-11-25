package test.main;

import test.mypac.*;

public class MainClass03 {
	public static void main(String[] args) {
		
		//HandPhone 객체를 생성해서 참조값을 부모 type 지역변수에 대입
		Object p1 = new HandPhone();
		
		//대입연산자의 우측을 Phone type으로 casting(형변환)해서
		//p1안에 있는 참조값을 Phone type변수  p2에 대입 
		Phone p2 = (Phone)p1; //p1은 Object타입(부모)이라 형변환이 필요함!
		p2.call();
		
		//p1에 있는 값을 HandPhone type으로 casting해서 
		//HandPhone type 변수 p3에 대입
		HandPhone p3 = (HandPhone)p1; //p1는 Object타입(부모)이라 형변환이 필요함!
		p3.call();
		p3.takePicture();
		
		
		
		/*
		자식클래스 객체를 생성해서 부모타입 변수에 넣어놓고 
		형변환을 통해
		부모 클래스에서 자식클래스의 필드나 메소드에 접근할 수 있다.
		
		[형변환]
		부모 타입 변수= 자식 은 바로 가능
		자식 타입 변수= 부모 는 형변환 해주어야함
		*/
	
	}
}
