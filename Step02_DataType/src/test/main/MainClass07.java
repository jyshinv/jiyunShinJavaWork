package test.main;
/*
 * [자바 참조 데이터 type]
 * 참조 데이터 type은 기본 데이터 type과는 다르게 
 * 변수에 참조값이 들어가고 .(dot)을 통해 여러가지 메소드를 사용할 수 있다.
 * 
 * String type
 * -문자열을 다룰 때 사용하는 데이터 type이다.
 * -참조 데이터 type 변수에는 참조값(id(디버깅모드에서 볼 수 있다.)) 값이 들어있다.
 * -문자열은 결국 char type의 모임이다.
 * -char타입의 글자들이 배열에 들어있는 모양이다.
 * 
 * */
public class MainClass07 {
	public static void main(String[] args) {
		//김구라 라는 String type 참조값을 name이라는 지역변수에 대입
		String name = "김구라";
		//name이라는 참조값을 myName이라는 새로운 변수에 대입
		String myName = name; 
		
		//"원숭이"라는 String Type 참조값을 name에 덮어쓰기(새로 대입)
		name = "원숭이";
		
		//String type 참조값이 들어가 갈수 있는 지역변수 name을 빈상태로 만들기
		//null은 참조 데이터 type이 들어갈 수 있는 빈 공간을 의미한다.
		name = null;

	}

}
