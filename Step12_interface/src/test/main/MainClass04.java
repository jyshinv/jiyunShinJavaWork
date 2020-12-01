package test.main;

import test.mypac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		매번 인터페이스를 구현한 클래스를 만들기 귀찮으니 
		익명클래스를 이용하자!
		*/
		
		
		//new Remocon()은 인터페이스 이기때문에 자체적으로 객체 생성이 불가능하다.
		//이때 new Remocon(){} 까지 써주면 빨간줄이 뜨고 그 빨간줄에 커서를 갖다댄 후 'add unimplemented method'를 해주면
		//재정의할 수 있는 메소드가 뜨며 빨간줄이 사라진다. --> 자동완성되니 걱정하지말자! 
		//이런 클래스를 익명 클래스 라고 한다.
		//new Remocon()까지는 생성자 호출, {}는 하나의 클래스! 라고 생각하자.(이것도 역시 Heap영역에 생성된다.)
		Remocon r1 = new Remocon() {

			@Override
			public void up() {
				System.out.println("볼륨을 내려요");
			}

			@Override
			public void down() {
				System.out.println("볼륨을 내려요");
			}
		};
		
		//r1지역변수에 담긴값을 3번 사용해보기
		useRemocon(r1);
		useRemocon(r1);
		useRemocon(r1);
		
		//위의 코드를 한번에 적기 
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("볼륨을 내려요");
				
			}
			
			@Override
			public void down() {
				System.out.println("볼륨을 내려요");
				
			}
		});
		
		
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}

}
