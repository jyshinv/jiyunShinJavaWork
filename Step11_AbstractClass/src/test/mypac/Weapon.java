package test.mypac;

/*
 *  [ 추상클래스 (Abstract Class) ]
 *  
 *  - class 예약어 앞에 abstract 를 명시해서 클래스를 정의한다.
 *  - 형태만 정의되고 실제 구현은 되지 않은 메소드가 존재할수 
 *    있다.
 *  - 형태만 정의된 메소드를 만들때는 abstract 예약어를 
 *    붙어서 메소드를 정의한다.
 *  - 추상 클래스에 생성자는 존재하지만 단독으로 객체 생성은 불가하다
 *  - 추상클래스 Type 의 id(참고값)가 필요하다면 추상클래스를 상속받은 
 *    자식클래스를 정의해서 객체 생성한다.
 *  - 추상클래스를 상속받은 자식클래스는 부모의 추상메소드를 
 *    모두 오버라이드(재정의) 해야한다. 
 */


//추상메소드는 누군가 만든 것을 import해서 쓰는경우가 많다.
//기반시설은 제공하되 일부 메소드는 추상메소드로 만들어주어 import를 사용해서 쓰는 개발자가 정의해서 쓸 수 있도록 해준다.

//미완성의 메소드를 멤버로 가지고 있으려면 abstract 예약어를 꼭 붙인다. 붙이지 않으면 에러가 난다.
public abstract class Weapon {
	
	//무기 작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	
	//공격하는 메소드
	public abstract void attack(); //미완성의 메소드를 만들 때 abstract 예약어를 붙인다.

}
