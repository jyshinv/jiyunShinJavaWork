package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		//추상클래스 단독으로는 객체 생성 불가!
		//Weapon w1 = new Weapon();
		//w1.prepare();
		//w1.attack();
		
		//단독으로 객체 생성은 불가하나 이런식으로 자식클래스의 참조값을 저장하는 변수의 타입역할은 할 수 있다.
		Weapon w1 = new MyWeapon();
		w1.prepare();
		w1.attack();
		
		//이렇게도 생성 가능하다. 
		MyWeapon w2 = new MyWeapon();
		w1.prepare();
		w1.attack();
		
	
		
	}
}
