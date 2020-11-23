package test.mypac;
/*
static 자원을 포함하는 용도로 사용해보기
*/
public class MyUtil {
	
	//non-static 핃드
	public int version;
	
	//static은 딱 한번만 static영역에 생긴다.
	//singleton의 의미를 가진다.
	public static String owner;
	
	//static메소드 안에서는 static자원만 접근할 수 있다.
	//또한 this는 객체 생성과 관련이 있어 객체 생성이 되면 그 객체를 가리키는 역할을 하는데
	//static 변수의 경우 객체생성을 안하기 때문에 this를 사용할 수 없다. 
	public static void playMusic() {
		System.out.println("음악을 틀어요!");
		//int a = this.version; --> 에러남!
		//int b = MyUtil.version; --> 에러남!
	}
}


