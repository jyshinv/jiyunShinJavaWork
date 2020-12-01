/*선생님 코드랑 비교 끝*/
package test.mypac;

import test.auto.Car;
import test.auto.Engine;
/*
import시 주의할 점
클래스 이름이 달라도 패키지명이 다르면 다른 클래스이다!
ex) test.auto.Car 과 test.passive.Car 이라면 Car은 다른 클래스임!
*/

public class SuperCar extends Car{

	//Engine type을 전달받는 생성자. 
	//Car에 default생성자가 없기 때문에  Car을 상속받은 SuperCar도 메인메소드에서 new SuperCar()로는 객체 생성을 못한다. 
	//따라서 애초에 publid class SuperCar extends Car 을 적어줄 때 빨간색 오류가 뜬다.
	//그때 빨간줄에 커서를 갖다대 addConstructor을 통해 인자를 넘겨주어야하는 코드를 작성해주어야한다.
	public SuperCar(Engine engine) {
		//부모 생성자에 필요한 값을 전달해 주는 문법 super()
		//부모 생성자를 호출하는 예약어 super()
		//super()은 부모 생성자를 호출해주고, 부모 생성자에 필요한 값을 전달해주는 문법이다!
		super(engine);
	}
	
	//빨리 달리는 메소드
	public void driveFast() {
		if(this.engine == null) {
			System.out.println("Engine객체가 없어서 달릴수가 없어요!");
			return; //메소드 끝내기
		}
		System.out.println("엄청 빨리 달려요!");
		
	}
	

	

}
