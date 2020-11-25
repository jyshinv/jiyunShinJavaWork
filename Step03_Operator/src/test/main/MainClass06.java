/*블로그 ok*/
package test.main;
/*
6. 3항 연산자 테스트 
*/
public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait = true;
		
		
		//isWait이 true이면 result에 기다려요 대입, false이면 기다리지 않아요 대입 
		String result = isWait ? "기다려요" : "기다리지 않아요";
		
		String result2 = null;
		if(isWait) {
			result2="기다려요";
		}else {
			result2 ="기다리지 않아요";
		}
		
		System.out.println(result);
		System.out.println(result2);
		
		double result3 = isWait? 10.12 : 99.5; //d는 생략가능
		float result4 = isWait? 10.12f : 99.5f; //float는 생략불가능
		float result5 = isWait? (float)10.12 : (float)99.5; //f를 생략하고싶다면 casting하기 
		

	}
}
