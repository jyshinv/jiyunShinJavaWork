/*블로그 ok*/
package test.main;

/*
 * 2. 증감 연산자 테스트
 * 변수에 있는 숫자값을 1씩 증가 혹은 1씩 감소 시킬 때 사용한다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num=0;
		num++;
		num++;
		num++; //num이 최종적으로 3이 된다.
		
		int num2=0;
		num2--;
		num2--;
		num2--; //num2는 최종적으로 -3이 된다.
		
		int num3=0;
		int result=++num3;//result1은 1 num3은 1
		
		int num4=0;
		//이 경우 연산의 우선순위가 증감연산자 보다 대입연산자가 더 빠르다.
		int result2=num4++; //0이 대입되고 그 다음에 num4를 증가시킨다.
		System.out.println(result2);
		System.out.println(num4);
		
		
		//연산 후 num, num2, result3엔 무엇이 들어있는 지 확인
		num=0;
		num2=0;
		int result3 = num-- + ++num2; //1이 들어있다.
		
		System.out.println("메인 메소드가 종료 됩니다.");
		

	}

}
