/*블로그 ok*/
/*
[메인메소드 속 지역변수 특징]
1. 변수 선언만 해주고 값 대입을 해주지 않으면 만들어지지 않는다.
2. 또한 변수 선언을 먼저 해주고 나중에 값 대입을 해준다면 그 대입해주는 시점에 변수가 생성된다.
지역변수(local variable) : 메소드 or 생성자 안에서 선언된 변수 
지역변수는 좀더 좁은 범위의 지역변수도 존재한다. 
좁은 범위란 생성자 혹은 메소드 보다 더 좁은 범위를 의미한다. 
{} 중괄호 안에서 선언된 지역변수는 실행순서가 {}를 벗어나면 해당 지역변수는 없어진다.  


[형변환 배우기 전 알아두기]
1. 같은 데이터 타입끼리 연산하면 그 데이터 타입의 결과값이 나온다.
ex) 5/3 = 1, 5.0/3.0 = 1.6666666666666667
2. 자주 하는 실수
5/3의 실수값을 얻고싶다?
(float)(5/3) 이렇게 형변환 해주면 결과로 1.0 이 나와버림!
5/3.0 혹은 5.0/3 혹은 5.0/3.0 혹은 (실수형)5/3 혹은 5/(실수형) 으로 써주어야한다!

[자동 형변환]
1. 바이트 크기가 작은 자료형에서 큰 자료형으로 대입하는 경우 (큰그릇에는 작은그릇의 내용을 넣을 수 있다!)
2. 덜 정밀한 자료형에서 더 정밀한 자료형으로 대입하는경우(정수 자료형보다 실수 자료형이 더 정밀함!)
3. 연산 중에 자동 변환되는 경우 
(ex1) 정수와 실수를 연산하면 실수가 나옴, ex2)int와 float을 연산하면 float형 결과값이 나오고 그 값을 double에 대입하면 double로 바뀜 )   
--> 이렇게 자동형변환이 되지 않은 경우이면 빨간줄이 뜨며 에러가 난다, 또한 명시적 형변환을 해주어야한다.

[명시적 형변환]
1. 바이트 크기가 큰 자료형에서 작은 자료형으로 대입하는 경우. (ex) byte bNum = (byte)10; --> 자료 손실이 발생한다.)
2. 더 정밀한 자료형에서 덜 밀한 자료형으로 대입하는 경우 (ex)int iNum2 = (int)3.14; --> 3이 int에 들어간다.)


결론)
표현 가능한 범위가 더 넓은 변수에 담긴 내용을 대입하려면
프로그래머가 대입을 해도 문제가 없다는 것을 확인하고
명시적으로 casting 하면 대입이 가능하다.
(myInt 안에 있는 숫자는 byte 범위를 절대 넘어가지 않아!)
*/
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
		
	}
}
