package test.mypac;

public class SmartPhone extends HandPhone{

	//SmartPhone이 정의한 메소드 
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	//HandPhone으로 부터 메소드 상속을 받긴 하겠지만
	//어떤 메소드는 내가 재정의를 하겠다!
	//이 메소드는 재정의한 메소드라고 표시해주는 어노테이션(@)
	//특별한 기능을 하는 것은 아니고 단지 재정의한 메소드라고 표시해주는 기능만 있다.
	@Override
	public void takePicture() {
		super.takePicture();//부모 메소드를 호출해준다. super은 부모 클래스의 참조값을 가리킨다. 
		System.out.println("1000만 화소의 사진을 찍어요");
	}
		
}
