package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass06 {
	
	public static void main(String[] args) {
		
		
		//usePhone 메소드를 호출하는 코드를 아래에 작성해보세요.
		MainClass06.usePhone(new Phone());
		MainClass06.usePhone(new HandPhone());
		MainClass06.usePhone(new SmartPhone());
		
	}
	
	//Phone type을 인자로 전달받는 static 메소드
	public static void usePhone(Phone p) {
		//인자로 전달되는 참조값을 이용해서 메소드 호출하기
		p.call();
		
		//만일 p앞에 있는 값이 HandPhone type이 맞다면...
		if(p instanceof HandPhone) { //instanceof 라는 연산자는 true or false를 리턴해줌 
			HandPhone p2 = (HandPhone)p;
			p2.mobileCall();
		}
	}

}
