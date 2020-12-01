package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		Weapon 추상클래스를 상속받은 익명의 local inner 클래스를 이용해서
		Weapon type의 참조값을 얻어내서 w1이라는 Weapon type의
		지역변수에 담기!
		
		[추상클래스와 익명클래스!]
		앞서 추상클래스는 객체 생성을 못해 자식 클래스를 생성해 추상메소드를 재정의 한 후 자식 클래스로 객체 생성이 가능하다.
		하지만 매번 이렇게 하기 귀찮으니 익명클래스를 이용하도록 하자!
		*/
		
		
		//new Weapon()은 추상클래스 이기때문에 자체적으로 객체 생성이 불가능하다.
		//이때 new Weapon(){} 까지 써주면 빨간줄이 뜨고 그 빨간줄에 커서를 갖다댄 후 'add unimplemented method'를 해주면
		//재정의할 수 있는 메소드가 뜨며 빨간줄이 사라진다. --> 자동완성되니 걱정하지말자! 
		//이런 클래스를 익명 클래스 라고 한다.
		//new Weapon()까지는 생성자 호출, {}는 하나의 클래스! 라고 생각하자.(이것도 역시 Heap영역에 생성된다.)
//		Weapon w1 = new Weapon() {
//			@Override
//			public void attack() {
//				System.out.println("아무거나 공격해요!");
//			}
//		};
//		
//		useWeapon(w1);
		
		//위의 코드를 1줄로 생성해보기
		//익명클래스를 이용해 1회용 Weapon type의 참조값 얻어내서 메소드 호출하기
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("아무거나 공격해요!");
			}
		});
		
		
		
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
