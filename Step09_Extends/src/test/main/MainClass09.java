package test.main;

import test.auto.Car;
import test.auto.Engine;

public class MainClass09 {
	public static void main(String[] args) {
		//defalut 생성자가 없으므로 아래와 같은 방법으로는 객체 생성 불가.
		//Car car1 = new Car();
		Car car1 = new Car(new Engine());
		car1.drive();
		
	}

}
