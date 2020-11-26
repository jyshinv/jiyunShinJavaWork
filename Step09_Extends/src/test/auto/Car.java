package test.auto;

/*
 * http://tcpschool.com/java/java_modifier_accessModifier -> 접근지정자 좋은 예시
접근지정자 4가지
1. public - 모두 공개
2. protected - in package or another package + child (같은 패키지라면 공개하겠다 or 다른 패키지더라도 상속관계이면 공개하겠다.)
3. defalut(접근지정자를 적지 않음) - in package
4. private - in object or in class

in object or in class의 의미 
private static String name -> 클래스 안에서만 공개
private String name -> 객체 안에서만 공개 
static 필드는 클래스에 만들어지는 필드
non static 필드는 객체 안에 만들어지는 필드

*class의 접근지정자는 public과 defalut만 쓰며, import 가능여부를 지정해준다. 보통은 public을 쓴다.*



*/


//class의 접근지정자는 import 가능여부를 정해준다.
public class Car {
	//protected 접근 지정자를 가진 필드
	protected Engine engine;
	
	//Engine type을 인자로 전달 받는 생성자
	public Car(Engine engine) {
		this.engine= engine;
	}
	
	//메소드
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine이 없어서 달릴수가 없어요!");
			return; //메소드 끝내기
		}
		System.out.println("달려요!");
	}
	

}
