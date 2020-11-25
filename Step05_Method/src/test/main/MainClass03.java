package test.main;

import test.mypac.*;
public class MainClass03 {
	public static void main(String[] args) {
		//MyObject 객체를 생성해서 m1이라는 이름의 지역변수에 대입해보세요.
		MyObject m1 = new MyObject();
		String name = "신지윤";
		
		//m1에 있는 참조값을 이용해서 House 객체의 참조값을 얻어와서 myHome이라는
		//이름의 지역변수에 담아보세요.
		House myHome =  m1.getHouse();
		
		//myHome 안에 있는 참조값을 이용해서 집에서 3번 쉬어보세요.
		myHome.relax(name);
		myHome.relax(name);
		myHome.relax(name);
		
		

	}
}
