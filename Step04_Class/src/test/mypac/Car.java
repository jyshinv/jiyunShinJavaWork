package test.mypac;
/*
[클래스의 용도]

1. 객체의 설계도 역할
	- 객체는 값의 저장소(Field)와 기능(Method)으로 이루어져있다.
	- 객체는 설계도 역할이라는 의미는 해당 클래스로 객체를 생성했을 때 그 
	객체가 어떤 저장소와 어떤 기능을 갖게할지 정할 수 있다라는 의미이다.
2. Data Type의 역할
3. static 자원들을 감싸고 있는 역할

2. 
*/
public class Car {
	//필드(저장소)정의하기
	public int cc; 	//아무것도 넣어주지 않으면? --> 자동으로 0이 들어가진다.
	public String name; //아무것도 넣어주지 않으면? --> 자동으로 null이 들어가진다.
	
	//main method에 변수를 선언해주고 아무것도 넣어주지 않으면 변수 생성이 아예 안됐다.
	//하지만 클래스 내에 필드를 정의해주고 아무것도 넣어주지 않으면 자동으로 0과 null이 들어가진다. 
	
	//달리는 메소드(기능)
	public void drive() {
		System.out.println("달려요!");
	}
	
	//엉덩이를 따뜻하게 하는 메소드(기능)
	public void hotHip() {
		System.out.println("엉덩이가 따뜻해져요");
	}

}
