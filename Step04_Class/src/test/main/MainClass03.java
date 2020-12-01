/*블로그 ok*/
package test.main;

/*
일반 필드와 메소드
static 필드와 메소드 차이점을 꼭 알아두기!
*/

import test.mypac.MyUtil;

public class MainClass03 {
	public static void main(String[] args) {
		//class 에 static이 붙지 않은 필드, 메소드는 new 로 참조값을 생성한 후 접근 가능!
		//class 에 static이 붙은 필드, 메소드는 클래스명.~으로의 접근해야한다!
	
		
		//staic자원 사용해보기1
		//MyUtil클래스에 정의된 static 메소드 호출하기
		MyUtil.playMusic(); //null가 음악을 틀어요!
		
		//static자원 사용해보기2
		//MyUtil 클래스에 정의된 static 필드 참조해서 값 대입하기.
		MyUtil.owner = "김구라";
		MyUtil.playMusic(); //김구라가 음악을 틀어요!
		
		//non-static자원 사용해보기
		MyUtil m = new MyUtil();
		m.name="해골";
		m.call();

	}
}
