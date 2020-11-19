package test.main;
/*
 * 3. 비교 연산자 테스트
 * -비교 연산의 결과는 boolean type이다.
 * ==, !=, >, >=, <, <=
 * */
public class MainClass03 {
	public static void main(String[] args) {
		boolean result1 = 10==10;//true
		boolean result2 = 10!=10;//false
		boolean result3 = 10>100;//false
		boolean result4 = 10>=10;//true
		boolean result5 = 10<100;//true
		boolean result6 = 10<=10;//true
		
		//String type 변수에 null 대입하기
		//Java에서 null은 참조데이터 type에 담길 수 있는 빈 공간이다!
		//반드시! 참조데이터 타입에 담길 수 있는 빈공간! (기본 데이터 타입의 빈 공간은 아니다 int num =null? 이런거 없음)
		String name=null;
		
		boolean result7=name==null;
	}
}
