package test.main;

/*
[기본 데이터 type에 대응되는 참조 data type]

byte 	: Byte
short 	: Short
int 	: Integer
long 	: Long

float 	: Float
double 	: Double

char 	: Character
boolean : Boolean

[참조 데이터 타입의 특징]
1. 참조 데이터 타입은 대응되는 기본 데이터 타입을 wrapped하고 있다.
2. 그동안의 객체 선언 String a = new String("안녕") 과는 다르게 String a = "안녕"; 으로 써도 된다.

[참고]
해당 참조 데이터 타입에 커서를 갖다 댄 후 shift+f2를 누르면 api로 이동한다. 

*/

public class MainClass01 {
	public static void main(String[] args) {
		//기본 데이터 type
		//기본 데이터 타입이기때문에 num. ~ 으로 기능 사용 불가능
		int num1=10;
		//참조 데이터 type
		Integer num2=10;
		
		//참조 데이터 type이지만 기본 데이터 type과 동일하게 사용 가능 하다.
		int result1 = num2+1;
		int result2 = result1+num2;
		Integer result3 = num1+num2;
		
		//Integer type의 메소드를 이용해 10을 문자열 "10"으로 만들기
		String result4 = num2.toString();
		
		//Integer 클래스의 static 메소드를 이용해서 "999"를 999 정수로 바꾸기
		//Integer 클래스의 static 메소드 이므로 클래스명.~ 으로 접근한다!
		int result5 = Integer.parseInt("999");
		
		
				
		
		
		
		
	}
}
