package test.main;

import java.util.Random;

/*
프로그래머가 직접 예외 클래스를 정의하고
필요한 시점에 예외를 발생 시킬수도 있을까? --> 가능하고! 꽤 많이 쓴다. 

Exception or RuntimeException 클래스를 상속받으면 가능하다!
Exception를 상속받으면 try/catch로 꼭 묶어줘야하는 상황이 올 수 있음 (Exception은 RuntimeException을 상속받지 않음!)
RuntimeException을 상속받으면 try/catch를 선택적으로 할 수 있음

*/
public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		
		Random ran=new Random();
		int ranNum=ran.nextInt(3);
		System.out.println(ranNum);
		if(ranNum==0) { //우연히 0 나오면
			//HeadacheException 발생시키기
			throw new HeadacheException("으악 머리아파!!");
		}
	}
	
	//머리 아픈 Exception 클래스 만들어보기 
	//내부 클래스에 한해서 메인메소드가 static이기 때문에 static자원을 쓰려면
	//class에도 static을 붙여주어야 한다.
	static class HeadacheException extends RuntimeException{
		//디포트 생성자
		public HeadacheException() {
		}
		
		//매개변수가 1개 있는 생성자 
		//예외 메세지를 String type으로 전달받는 생성자
		public HeadacheException(String msg) {
			//부모 생성자에 전달해야한다.
			//RuntimeException에는 실제로 String type을 매개변수로 하는 생성자가 있다. 그림참고
			super(msg); 
		}
	}

}
