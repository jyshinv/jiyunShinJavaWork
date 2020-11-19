package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		//main 메소드 안의 모든 변수는 지역변수이다.
		
		//int type 변수 선언과 동시에 값 대입하기 
		int num1 = 10;
		
		//int type 변수 선언만 하고 (선언만 하면 만들어지지 않는다.)
		//자바 스크립트는 변수 선언만 하면 undefined가 자동으로 대입되어 있었다.
		//하지만 자바에서는 변수 선언만 하고 값을 넣지 않으면 만들어 지지 않는다.
		int num2;
		
		//값은 나중에 대입하기(값이 대입되는 시점에 변수가 만들어진다.)
		num2 = 20;
		
		
		/* 
		 * 정수의 표현 가능한 범위 순서 
		 * byte < short < int < long 
		 */
		
		int myInt = 100;
		byte myByte = 100;
		
		
		//1.
		//int type 변수에 int type 변수에 있는 값 대입 --> 문제 없다.
		int a = myInt;
		
		//2.
		//int type변수에 byte type 변수에 있는 값 대입 --> 문제 없다.
		int b = myByte;
		
		//3.
		//byte type변수에  int type 변수에 있는 값 대입 --> 에러난다.
		//표현 가능한 범위가 큰 데이터타입에 있는 변수에 있는 값을 
		//표현 가능한 범위가 작은 데이터타입에 있는 변수에 넣으면 문제가 발생한다.
		//byte c = myInt;
		
		
		//4.
		//강제로 byte type변수에  int type 변수에 있는 값 대입 --> 강제 형변환 (강제 casting)
		byte e = (byte)myInt;
		
		//5.
		//byte가 표현 가능한 범위를 넘어가는 수인 200을 int type변수에 강제형변환 후 대입 
		//-->에러가 나진 않지만 데이터 손실이 발생한다. 실제로 -56이 f에 대입된다. 
		int myInt2 = 200;
		byte f = (byte)myInt2;
		
		
		/*
		 결론)
		 표현 가능한 범위가 더 넓은 변수에 담긴 내용을 대입하려면
		 프로그래머가 대입을 해도 문제가 없다는 것을 확인하고
		 명시적으로 casting 하면 대입이 가능하다.
		 (myInt 안에 있는 숫자는 byte 범위를 절대 넘어가지 않아!)
		 
		 */
		
		
	}
}
