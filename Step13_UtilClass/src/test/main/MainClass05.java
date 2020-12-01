package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		1. 문자열을 저장할 수 있는 ArrayList 객체를 생성하고 
		2.Scanner객체를 이용해서 친구 이름을 반복문 돌면서 5개 입력받아서
		위에서 생성한 ArrayList 객체에 순서대로 저장을 하세요.
		3.ArrayList객체에 저장된 내용을 반복문 돌면서 순서대로 아래와 같은 형식으로 콘솔창에 출력해보세요.
		
		0번째 친구 이름 : 김구라
		1번째 친구 이름 : 해골
		2번째 친구 이름 : 원숭이..
		*/
		
		Scanner scan = new Scanner(System.in);
		List<String> names = new ArrayList<String>();
		
		for(int i=0; i<5; i++) {
			System.out.print("이름입력 :");
			String name = scan.nextLine();
			names.add(name);
			//names.add(i,name); 매개변수가 2개인 ArrayList의 add() 함수도 있다.
		}
		
		for(int i=0; i<names.size(); i++) {
			System.out.println(i+"번째 친구 이름 : "+names.get(i));
		}
		
		

		
	}
}
