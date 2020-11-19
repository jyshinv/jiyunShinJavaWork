package test.main;

import test.mypac.Car;

public class MainClass01 {

	public static void main(String[] args) {
		//데이터타입이 Car인 car1변수를 선언하고 null값을 대입
//		Car car1 = null;
//		car1=10; //에러남
//		car1=true; //에러남
//		car1="kim"; //에러남
		//에러나는 이유? 맞지않는 타입의 데이터를 대입했기 때문
		
		String a=null;
//		a=10; //에러남
//		a=true; //에러남
//		a="kim"; //에러나지 않음
		//-->에러나는 이유? 맞지않는 타입의 데이터를 대입했기 때문
		//-->에러나지 않는 이유 String type의 데이터를 String type에  대입했기 때문
		//String type의 데이터는 double 따옴표로 감싸면 생긴다.

		
		//Car type의 참조값을 담을 수 있는 빈 지역 변수 car1 만들기
		Car car1=null;
		
		//Car클래스로 객체를 생성(new)하고 그 생성된 객체의 참조값을 car1에 대입하기 
		car1=new Car(); //new라는 예약어와 함께 넣어준다. -> newCar()은 참조값을 의미함!(주소)
		
		//car1 지역 변수에 있는 참조값을 이용해서 메소드 호출하기
		//.(dot)으로의 접근이 가능하다
		car1.drive();
		car1.hotHip();
		
		//newCar()은 참조값을 의미하므로 이런식으로 쓰는 것도 가능하다!
		new Car().drive();
		new Car().hotHip();
		
		
	}

}
