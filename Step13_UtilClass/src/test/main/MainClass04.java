package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass04 {
	public static void main(String[] args) {
		/*ArrayList 클래스는 List 인터페이스를 구현한 클래스이다.
		따라서 
		ArrayList<type> a=new ArrayList<type>();
		으로도 쓰지만
		List<type> l=new ArrayList<type>(); 으로 다형성을 구현할 수 있다.
		*/

		//정수를 저장할 ArrayList 객체를 생성해서 참조값을 nums 라는 지역변수에 담아보셈
		//뒤에 있는 <Integer>은 생략해도 된다. 
		//List와 ArrayList클래스를 사용하므로 반드시 java.util.~를 import해와야한다.
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		//실수를 저장할 ArrayList객체를 생성하여 참조값을 num2라는 지역변수에 담아보셈
		List<Double> nums2 = new ArrayList<>();
		nums2.add(10.1);
		nums2.add(10.2);
		nums2.add(10.3);
		
		
		
		
	}
}
