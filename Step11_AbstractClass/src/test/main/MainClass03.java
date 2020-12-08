package test.main;

import test.mypac.*;

/*
InnerClass에 한해서!!!!!!!
static 으로 선언된 메인메소드 내에서는 static 자원만 사용할 수 있기 때문에
static을 붙여주어야한다!
+메소드도 마찬가지!
(단, 같은 클래스 공간 내에서!)
*/
public class MainClass03 {
	
	//클래스 안에 정의된 Inner Class (★내부클래스를 static메소드에서 쓰려면 static을 붙여줘야한다. (외부클래스는 붙여주지 않아도 쓸 수 있음!))
	//여기에 static를 적는이유? 
	//static 메소드 에서는 static자원만 사용가능하다.
	//main method가 static으로 선언되어있기 때문에 이 클래스를 메인메소드에서 쓰려면
	//static을 붙여주어야 한다. 따라서 내부 클래스에 한해서 필요하다면 static 예약어를 붙일 수 있다.
	static class AirPlane extends Weapon{

		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("공중에서 공격을 해요");
		}
		
	}
	
	//main
	public static void main(String[] args) {
		
		//Local Inner Class
		//static메소드 내부에 있는 클래스는 static을 붙여주지 않아도 static메소드 내에서 쓸 수 있다.
		class Sword extends Weapon{

			@Override
			public void attack() {
				System.out.println("칼로 공격을 해요!");
			}
		}
		
		//Sword 객체를 생성해서 참조값 Weapon type으로 받기 
		Weapon w1 = new Sword(); //local inner class
		useWeapon(w1);
		
		//AirPane 객체를 생성해서 참조값을 Weapon type으로 받기
		Weapon w2 = new AirPlane(); //inner class
		useWeapon(w2);
		
		//Tank 객체를 생성해서 참조값을 Weapon type으로 받기
		Weapon w3 = new MyStrongWeapon(); //external class
		useWeapon(w3);
	}
	
	//static을 붙이는 이유?
	//static 메소드 에서는 static자원만 사용가능하다.
	//main method가 static으로 선언되어있기 때문에 이 메소드를 메인메소드에서 쓰려면
	//static을 붙여주어야 한다.
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
