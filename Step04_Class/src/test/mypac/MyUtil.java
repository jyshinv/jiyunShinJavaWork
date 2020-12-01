package test.mypac;
/*
static 자원을 포함하는 용도로 사용해보기
static 붙은 메소드나, 필드를 static 메소드/필드 라고 말하고
static이 붙지 않은 메소드나, 필드를 non-static 메소드/필드 라고 말한다.
*/
public class MyUtil {
	
	//non-static 핃드
	public String name;
	
	//static은 딱 한번만 static영역에 생긴다.
	//singleton의 의미를 가진다.
	public static String owner;
	
	//non-static 메소드
	public void call() {
		//non-static메소드에서는 static자원 non-static 자원 둘다 사용 가능하다.
		System.out.println(owner + "가" +name +" 을(를) 부릅니다.");
	}
	
	//static 메소드
	//static메소드 안에서는 static자원만 접근할 수 있다.
	//또한 this는 객체 생성과 관련이 있어 객체 생성이 되면 그 객체를 가리키는 역할을 하는데
	//static 변수의 경우 객체생성을 안하기 때문에 this를 사용할 수 없다. 
	public static void playMusic() {
		//static 메소드 안에서의 지역변수 사용가능 
		String a = "님이"; 
		
		//클래스의 필드를 쓰려면 static 자원만 사용가능, static메소드 안에서는 static자원만 접근 가능
		System.out.println(owner + a +"음악을 틀어요!"); 
		
		//owner은 static 자원이므로 클래스명.~ 으로도 사용가능하다. 
		System.out.println(MyUtil.owner + a + "음악을 틀어요!"); 
		
		//int c = this.owner; //--> 에러남!(static필드 사용가능하지만 this를 썼기때문에 에러남)
		//int a = this.version; //--> 에러남!(static자원엔 접근 불가하며, this를 썼기때문에 에러남)
		//int b = MyUtil.version; //--> 에러남!(static 자원이 아니기때문에 에러남) 
	}
}


