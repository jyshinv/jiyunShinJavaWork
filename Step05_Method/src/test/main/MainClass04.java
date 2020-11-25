package test.main;
import test.mypac.*;

public class MainClass04 {
	public static void main(String[] args) {
		//MyObject 클래스에 있는 usePhone() 메소드를 호출해보세요.
		
		//방법1 : 객체 생성 후 전달하기
		MyObject m1 = new MyObject();
		Phone p1 = new Phone(); //객체 생성 후
		m1.usePhone(p1); //전달하기
		
		//방법2 : 객체 생성하면서 전달하기
		MyObject m2 = new MyObject();
		m2.usePhone(new Phone()); //객체 생성하면서 전달하기 

		//방법3 : 한줄로 써보기 
		//객체를 일회용으로 쓸거라면(한번 쓰고 말거라면) 이런식으로 쓰는것도 가능하다. 
		new MyObject().usePhone(new Phone());
	}
}
