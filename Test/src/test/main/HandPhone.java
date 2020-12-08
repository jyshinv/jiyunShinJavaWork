package test.main;

public class HandPhone extends Phone{
	public int ha;
	public String s="HandPhone";
	
	//디포트 생성자
	public HandPhone() {
		System.out.println("HandPhone 생성자를 호출");
	}
	
	//오버라이딩
	@Override
	public void call() {
		System.out.println("이동중에 HandPhone으로 전화를 걸어요~");
	}
	
	//HandPhone의 takePicture() 메소드 
	public void takePicture() {
		System.out.println("사진을 찍어요.");
	}
	
	//HandPhone의 test()메소드
	public void test() {
		
		//부모클래스에 접근
		
		//(1)super.~ 키워드로 부모클래스의 필드와 메소드에 접근가능.
		int ha = super.pa; //super.~을 통해 부모의 필드에 접근가능
		super.reDial(); //super.~을 통해 부모의 메소드에 접근 가능 
		
		//(2)또한 super키워드는 생략 가능하다.
		int ha2 = pa;
		reDial();
		
		
		//자기자신의 필드에는 this로 접근가능
		
		//(3)자기자신에 접근 
		this.ha=3;
		
		//(4)this는 생략가능하다. 
		ha=5;

		//(5)단, 부모클래스와, 자식클래스에 동일한 이름의 필드가 있을 때 String s가 부모, 자식에 둘다 존재함.
		//자식클래스에서 this,super을 생략하면 자식클래스 필드를 의미한다. 
		System.out.println(this.s); //HandPhone
		System.out.println(super.s); //Phone
		System.out.println(s); //HandPhone
	}
	
	
	
	
	
}