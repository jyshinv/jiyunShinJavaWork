package test.main;

import test.mypac.*;

public class MainClass07 {
	public static void main(String[] args) {
		MainClass07.usePhone(new Phone());
		MainClass07.usePhone(new HandPhone());  
		MainClass07.usePhone(new SmartPhone()); 
		
		//실행결과?
		//전화를 걸어요!
		//이동중에 전화를 걸어요
		//이동중에 전화를 걸어요
	}
	
	public static void usePhone(Phone p) {
		//인자가 new Phone()이라면  Phone p = new Phone();
		//인자가 new HandPhone()이라면 Phone p = new HandPhone();
		//인자가 new SmartPhone()이라면 Phone p = new SmartPhone();
		
		
		//instanceof 개념 다시 공부하고 다시 정리할 것 
		//만일 p 안에 있는 값이 HandPhone type이 맞다면..
		//p가 HandPhone과 하위클래스 내에 속하나요? 속하면 true, 속하지 않으면 false를 반환
		if(p instanceof HandPhone) { //instanceof 라는 연산자는 true or false로 리턴해준다.
			HandPhone p2 = (HandPhone)p; //p는 HandPhone타입 p2보다 부모타입인 Phone타입 변수이기 때문에 casting 해주어야한다.
			p2.mobileCall();
		}else {
			p.call();
		}
	}

}
