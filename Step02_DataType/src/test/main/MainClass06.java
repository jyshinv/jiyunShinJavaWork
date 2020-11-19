package test.main;
/*
 * [Java 기본 데이터 type]
 * 
 * 2. 문자형(char)
 * 
 * -65536 가지의 코드값을 가질 수 있다.
 * -사용하는 모든 문자 1글자를 표현할 수 있다.
 * -single quotation을 이용해서 만든다.
 * 
 * 지금까지 배운 자바 데이터 타입 8가지
 * byte 
 * short 
 * int
 * long
 * float 
 * double
 * boolean
 * char
 * 
 */
public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		//char type 변수 선언과 동시에 값 대입하기
		//char형은 single따옴표로 표현한다.
		//한글자를 나타낼 때 사용한다.
		char ch1 = 'a';
		char ch2 = 'b';
		char ch3 = '가';
		char ch4 = '나';
		char ch5 = '@';
		
		//정수 값이 1:1 대응되는 char 값이 존재한다.
		int code1 = ch1; //소문자 a는 97
		int code2 = ch2; //소문자 b는 98
		int code3 = ch3; //한글 가는 44032
		int code4 = ch4; //한글 나는 45208
		int code5 = ch5; //특수문자 @는 64
		
		char result = 96;
		char result2 = 97;
		char result3 = 98;
		
		
		

	}

}
