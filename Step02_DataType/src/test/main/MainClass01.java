/*블로그 ok*/
package test.main; //src/test/main (src폴더 내 test 폴더 내 main폴더) 패키지가 만들어진다.

public class MainClass01 {
	//run 했을 때 실행순서가 시작되는 특별한 main 메소드
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		

/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  정수형 datatype의 표현 가능한 범위
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  실수형 datatype의 표현 가능한 범위
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */
		
		//지금 작성하고 있는 프로그램도 하나의 실행 프로그램!
		//실행 한다면 운영체제에서 프로세스를 하나 할당해준다.
		
		//값 확인하는 방법? - 디버깅!!
		//정수형 변수 선언하고 값 대입하기
		byte a = 10;
		short b = 10;
		int c = 10;
		long d = 10l;
		long d1 = 10L;
		
		//long형은 l혹은 L 생략 가능
		long d2 = 10;
		
		//실수형 변수 선언하고 값 대입하기
		float e = 10.1F;
		float e1 = 10.1f;
		double f = 10.1d;
		double f1 = 10.1D;
		
		//단, double형에 한해서 d 혹은 D 생략 가능하다.(float은 생략불가!)
		double g = 10.1;
		
	}
}
