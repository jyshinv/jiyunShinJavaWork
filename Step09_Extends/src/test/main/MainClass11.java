package test.main;

import test.mypac.*;

public class MainClass11 {
	public static void main(String[] args) {
		//SmartPhone -> HandPhone -> Phone -> Object
		System.out.println("main 메소드가 시작되었습니다.");
		
		new SmartPhone();//SmartPhone, HandPhone, Phone, Object 객체가 한꺼번에 만들어지고 Heap에 저장되어 한개의 참조값으로 관리된다.
		System.out.println("===");
		Object p1= new SmartPhone();
		System.out.println("===");
		Phone p2 = new SmartPhone();
		/*
코드의 실행결과
main 메소드가 시작되었습니다.
Phone 생성자 호출됨
HandPhone() 생성자 호출됨
SmartPhone()생성자 호출됨
===
Phone 생성자 호출됨
HandPhone() 생성자 호출됨
SmartPhone()생성자 호출됨
===
Phone 생성자 호출됨
HandPhone() 생성자 호출됨
SmartPhone()생성자 호출됨
main 메소드가 종료됩니다.
		
--> 객체가 생성되는 순서를 보자! 자식 클래스로 객체를 생성하면 부모 클래스의 객체부터 자식클래스의 객체순서로 생성된다.
		*/
		
		System.out.println("main 메소드가 종료됩니다.");

	}
}
