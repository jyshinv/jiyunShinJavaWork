package test.mypac;

import test.auto.Car;
import test.auto.Engine;

public class SuperCar extends Car{

	//Engine type을 전달받는 생성자. 
	//Car에 default생성자가 없기 때문에  Car을 상속받은 SuperCar도 메인메소드에서 new SuperCar()로는 객체 생성을 못한다. 
	//따라서 addConstructor을 통해 인자를 넘겨주어야하는 코드를 작성해주어야한다.
	public SuperCar(Engine engine) {
		//부모 생성자에 필요한 값을 전달해 주는 문법 super()
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
