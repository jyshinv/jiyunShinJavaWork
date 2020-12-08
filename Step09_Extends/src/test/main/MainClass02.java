/*블로그 ok*/
package test.main;

/*
[다형성]

-객체는 여러가지 type을 가질 수 있다.
-상속 관계에 따라서 여러가지 type이 된다.
-아래의 HandPhone 객체는 3가지 type을 가진다.(HandPhone 타입, Phone 타입, Object타입..)
*/


import test.mypac.Phone;
import test.mypac.HandPhone;

public class MainClass02 {
	public static void main(String[] args) {
		//객체를 다양한 타입의 변수에 대입해보자!
		
		//방법1.생성한 객체와 같은 타입의 변수에 대입
		//1가지)HandPhone객체를 생성해서 참조값을 HandPhone type변수에 담기
		HandPhone p1 = new HandPhone(); 
		
		System.out.println("------------------");
		
		//방법2.생성한 객체와 다른 타입의 변수에 대입
		//2가지)HandPhone객체를 생성해서 참조값을 Phone type에 담기
		Phone p2 = new HandPhone(); 
		System.out.println("------------------");
		//3가지)HandPhone객체를 생성해서 참조값을 Object type에 담기
		Object p3 = new HandPhone(); 
		System.out.println("------------------");
		
		
		//방법2의 경우
		//new로 생성한 클래스의 참조값을 담은 변수가 구리다(?) 라고 생각하기. 
		//혹은 담고있는 설명서가 구리다! 라고 생각하기
		//따라서 아래 방법2로 쓴 애들은
		//담긴 변수의 데이터 타입(클래스)내 메소드와 필드 밖에 사용 못한다. 
		//구린 설명서대로밖에 사용못한다.
	}
}
