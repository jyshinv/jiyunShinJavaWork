package test.main;

import test.mypac.Remocon;
import test.mypac.MyRemocon;

public interface MainClass01 {
	public static void main(String[] args) {
		
		//인터페이스로는 단독 객체생성이 불가능
		//Remocon r1 = new Remocon();
		
		//인터페이스를 구현한 자식클래스로 객체 생성 가능
		Remocon r1 = new MyRemocon();
		r1.up();
		r1.down();
		
		//Remocon 인터페이스에 정의된 static final 상수 참조하기
		System.out.println(Remocon.COMPANY);
		//Remocon.COMPANY="상수"; --> COMPANY는 final로 선언되었기 때문에 즉, 상수이기 때문에 이런식으로 수정이 불가능! 
		
	}
}
