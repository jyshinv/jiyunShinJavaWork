package test.main;

import test.mypac.*;
import test.mypac.Zoo.Cat;
import test.mypac.Zoo.Monkey; //Zoo 클래스의 내부 클래스 Monkey import
import test.mypac.MyUtil.User;

public class MainClass01 {
	
	/*여기는 inner class영역*/
	public static void main(String[] args) {
		/*여기는 local inner class영역*/
		/*
		Zoo 클래스에 있는 getMonkey() 메소드를 호출해서
		리턴되는 참조값을 m1이라는 지역변수에 담아보세요.
		*/
		Zoo z1 = new Zoo();
		Monkey m1 = z1.getMonkey(); //패키지명.*로 import 했다 하더라도 별도로 테스트명.Zoo.Monkey를 import 해주어야 에러가 나지 않는다.
		m1.say();

		//이런 모양도 있다.
		Cat c = new Zoo().getCat(); //getCat()함수의 return값을 Cat c에 대입
		c.say();
		
		//MyUtil
		MyUtil.User my = new MyUtil().new User();
		my.doSomething();
		
		
	}
}
