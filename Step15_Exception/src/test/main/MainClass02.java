package test.main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("나눌 수 입력:");
		String inputNum1=scan.nextLine();
		System.out.println("나누어지는 수 입력:");
		String inputNum2=scan.nextLine();
		
		try {
			//입력한 숫자형식의 문자열을 실제 정수로 바꾸기
			int num1=Integer.parseInt(inputNum1);
			int num2=Integer.parseInt(inputNum2);
			
			//정수를 정수로 나누면 소수점은 짤리고 정수만 남는다.(나눈 몫이 구해진다)
			int result=num2/num1;
			int result2=num2%num1; //나머지 연산자를 이용해서 나눈 나머지값을 구한다.
			
			System.out.println(num2+ "을(를) " +num1+"으로 나눈 몫은 " + result);
			System.out.println(num2+ "을(를) " +num1+"으로 나눈 나머지는 " + result2);
			
		}catch(ArithmeticException a) {
			System.out.println("0을 나눌 수는 없습니다!");
		}catch(NumberFormatException nfd) {
			System.out.println("숫자 형식에 맞게 입력하세요!");
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
