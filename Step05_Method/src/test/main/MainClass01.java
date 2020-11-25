package test.main;

import test.mypac.MyObject;
public class MainClass01 {
	public static void main(String[] args) {
		//1. MyObject 객체를 생성해서 참조값을 m1이라는 지역변수에 담아보세요.
		MyObject m1 = new MyObject();
		//2. m1안에 들어있는 참조값을 이용해서 3개의 메소드를 모두 호출해보세요.
		m1.walk();
		m1.getNumber();//m1.getNumber()을 호출하면 그 자리는 return값으로 바뀐다.
		m1.getGreeting();//m1.getGreeting()을 호출하면 그 자리는 return값으로 바뀐다.
		//3. m1안에 들어있는 참조값을 이요해서 getNumber() 메소드를 다시 호출하고
		//리턴되는 값을 a라는 이름의 지역변수에 담아보세요.
		int a = m1.getNumber();//m1.getNumber()을 호출하면 그 자리는 return값으로 바뀐다. 
		//4. m1안에 들어있는 참조값을 이요해서 getGreeting() 메소드를 다시 호출하고
		//리턴되는 값을 b라는 이름의 지역변수에 담아보세요.
		String b = m1.getGreeting();//m1.getGreeting()을 호출하면 그 자리는 return값으로 바뀐다.

	}

}
