package test.auto;

/*
접근지정자 4가지
1. public - 모두 공개
2. protected - in package or another package + child (다른 패키지더라도 상속관계이면 공개하겠다.)
3. defalut(접근지정자를 적지 않음) - in package
4. private - in object or in class
*/


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
