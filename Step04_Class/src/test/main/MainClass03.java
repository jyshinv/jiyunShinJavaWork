package test.main;

import test.mypac.MyUtil;

public class MainClass03 {
	public static void main(String[] args) {
		//class 에 static이 붙지 않은 필드, 메소드는 클래스명.~ 으로의 접근이 불가능(new로만 접근할 수 있다.)
		//class 에 static이 붙은 필드, 메소드는 클래스명.~으로의 접근 가능!
		//MyUtil클래스에 정의된 static 메소드 호출하기
		MyUtil.playMusic();
		MyUtil.owner = "김구라";

	}
}
