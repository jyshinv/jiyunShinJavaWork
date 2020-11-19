package test.main;
/*

4. 논리 연산자

-논리 값 boolean 을 연산할 때 사용하는 연산자이다.
||, &&, !
 
*/

public class MainClass04 {
	public static void main(String[] args) {
		
		//메소드 안에서 생성하는 변수를 'local variable(지역변수)' 라고 한다.
		//datatype identifier = value; -> 지역변수 생성방법과 각 용어
		//자바에서는 타입이 맞지 않으면 값이 들어가지지 않는다.
		//boolean result1 = 10.1(x)
		
		// or 연산 
		boolean result1 = false || false; //false
		boolean result2 = false || true; //true
		boolean result3 = true || false; //true
		boolean result4 = true || true; //true
		// and 연산
		boolean result5 = false && false; //false
		boolean result6 = false && true; //false
		boolean result7 = true && false; //false
		boolean result8 = true && true; //true
		// not 연산
		boolean result9 = !true; //false
		boolean result19 = !false; //true
		
		//boolean타입의 변수는 is~ 로 짓는것이 좋다. -> 가독성이 좋아진다.
		boolean isRun=false;
		
		//만일 isRun이 true가 아니라면
		if(isRun != true){
			System.out.println("달리지 않아요");
		}
		
		//만일 isRun이 false라면 
		//만일 달리지 않을거라면 
		if(!isRun){
			System.out.println("달리지 않아요2");
		}

	}
}
