package test.main;
/*
여러분이 키우는 자녀가 있다고 가정하자
자녀가 현재 사용하는 핸드폰이 인터넷이 안되는 구형 폰이다.
여러분의 자녀가 인터넷을 하고 싶어서 스마트폰이 갖고 싶다고 조른다.
여러분은 어떻게 할 것인가?

1. 스마트폰을 새로 사준다.(만들어서 준다.)
2. 스마트폰의 사용설명서만 가지고 와서 현재 폰의 설명서라고 우기고 그냥 그 폰을 쓰라고 한다. --> 아래 예제는 2번 같은 경우

아래 예제는 MainClass03과 비교해볼 것!

*/
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		
		//아래예제와 같은 상황을 조심할 것!
		Phone p1 = new Phone(); 
		SmartPhone p2 = (SmartPhone)p1; //p1은 Phone 타입(부모) 이므로 형변환 해주어야한다. 그러나 이 코드는 실행해보면 오류가 난다. p1은 원래부터 스마트폰 기능이 없다.(그림으로 이해하기!) 
		p2.doInternet(); 
	}

}
