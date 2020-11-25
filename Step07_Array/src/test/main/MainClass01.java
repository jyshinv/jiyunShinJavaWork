/*
1. 배열을 어떻게 만드는지?
-배열은 중괄호 {} 열고 닫고 해서 만든다.

2. 배열의 데이터 type은 어떻게 선언하는지
-배열안에 저장된 type + [] 기호를 조합해서 만든다.

3. nums, nums2, truth, names에 저장된 값은 참조값인지? 아닌지?
-참조값이 들어있다.

4.배열이 참조 데이터 type인지? 기본 데이터 type인지?
-배열은 참조 데이터 type이다.  

*/
package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		//int type 5개를 저장하고 있는 배열
		int[] nums = {10, 20, 30, 40, 50};
		
		//double type 5개를 저장하고 있는 배열
		double[] nums2 = {10.1, 10.2, 10.3, 10.4, 10.5};
		
		//boolean type 3개를 저장하고 있는 배열
		boolean[] truth = {true, true, false};
		
		//String type 3개 저장하고 있는 배열
		String[] names= {"김구라","해골","원숭이"};
		
		//배열의 방 개수 5가 참조된다.
		//이때 length는? 필드? 메소드? -> ()가 없으니 필드!
		int size = nums.length;
		
		//배열의 방 개수 3가 참조된다.
		int size2 = names.length;
		
		//배열의 각각의 저장된 아이템을 참조하는 방법
		int num1 = nums[0]; //10
		int num2 = nums[1]; //20
		int num3 = nums[2]; //30
		
		String name1 = names[0]; //김구라
		String name2 = names[1]; //해골
		String name3 = names[2]; //원숭이
	}
}
