package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		String[] names = {"김구라","해골","원숭이","주뎅이","덩어리"};
		//names 배열에 저장된 문자열을 순서대로 콘솔창에 출력하기
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		//names 배열에 저장된 문자열을 순서대로 콘솔창에 출력하기
		//향상된 for문  arr이 요소 자체가 된다. 
		for(String arr:names) {
			System.out.println(arr);
		}
	}
}
