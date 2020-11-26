package test.mypac;

//SmartPhone 클래스를 종단 클래스로 만드는 final 얘약어 --> fianl은 고자를 만들어버린다.
public final class SmartPhone extends HandPhone{
	
	//디폴트 생성자
	public SmartPhone() {
		System.out.println("SmartPhone()생성자 호출됨");
	}

	//SmartPhone이 정의한 메소드 
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	//SmartPhone메소드에서 부모클래스와 자기자신클래스 메소드 호출하기
	public void callMethod() {
		call(); //SmartPhone클래스엔 call()함수가 없으니 부모의 call()함수가 호출된다.
		mobileCall(); //SmartPhone 클래스엔 mobileCall()함수가 없으니 부모의 mobileCall()함수가 호출된다. 
		super.takePicture(); //SmartPhone클래스엔 takePicture()함수가 있으므로(재정의함) 부모클래스의 takePicture()를 호출하고 싶을땐 super예약어를 이용한다.
		this.takePicture(); //부모클래스의 takePicture()가 아닌 SmartPhone클래스의 takePicture을 호출하고 싶을 땐 this 예약어를 사용한다.
		takePicture(); //위에 1줄에서 this는 생략해도 된다. 이경우 부모클래스에도, 자식클래스에도 takePicture이 존재하므로 자식의 takePicture가 호출된다.
		
	}
	
	//HandPhone으로 부터 메소드 상속을 받긴 하겠지만
	//어떤 메소드는 내가 재정의를 하겠다!
	//이 메소드는 재정의한 메소드라고 표시해주는 어노테이션(@)
	//특별한 기능을 하는 것은 아니고 단지 재정의한 메소드라고 표시해주는 기능만 있다.
	@Override
	public void takePicture() {
		/*
		super 는 부모 객체를 가리키는 예약어이다.
		피 오버라이드된 부모 메소드도 만일 호출하려면 아래와 같이 호출하면 된다.
		super.takePicture();
		부모메소드를 호출해야하는지 아닌지는 그때 그때 클래스에 따라 다르므로
		클래스 사용법을 학습을 해서 선택을 해야한다. 
		*/
		super.takePicture();//부모 메소드를 호출해준다. super은 부모 클래스의 참조값을 가리킨다. 
		System.out.println("1000만 화소의 사진을 찍어요");
	}
		
}
