package test.mypac;
/*
static 자원을 포함하는 용도로 사용해보기
*/
public class MyUtil {
	
	//static은 딱 한번만 static영역에 생긴다.
	//singleton의 의미를 가진다.
	public static String owner;
	
	public static void playMusic() {
		System.out.println("음악을 틀어요!");
	}
}


