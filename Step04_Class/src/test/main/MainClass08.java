/*블로그ok*/
package test.main;

import test.war.Marine;
import test.war.Pentagon;

public class MainClass08 {
	public static void main(String[] args) {
		
		/*
		[프로그래밍의 목적]
		Marine과 Pentagon 클래스를 이용하여 아래와 같이 프로그래밍 하시오
		1. 사령부에서 전쟁을 선포하고
		2. 마린을 움직여서
		3. 마린으로 공격하고
		4. 사령부에서 전쟁을 종료
		*/
		
		//Pentagon의 startWar()과 endWar()은 static 메소드 이므로 클래스명.~으로 호출해야한다. 
		Marine m1 = new Marine();
		Pentagon.starWar();
		m1.move();
		m1.attack();
		Pentagon.endWar();
		
		
		
		
		
		
	}
}
