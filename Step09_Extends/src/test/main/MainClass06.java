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
		
		//실행결과?
		//전화를 걸어요!
		//이동중에 전화를 걸어요
		//이동중에 전화를 걸어요
		
	}
	
	//Phone type을 인자로 전달받는 static 메소드
	public static void usePhone(Phone p) {
		//인자로 전달되는 참조값을 이용해서 메소드 호출하기
		p.call();
	}

}
