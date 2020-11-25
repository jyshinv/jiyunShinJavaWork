/*블로그 ok*/
package test.main;

public class MainClass10 {
	public static void main(String[] args) {
		
		//기본 데이터 type
		int num1=10;
		double num2=10.1;
		char ch1='a';
		
		//참조 데이터 type, str변수 안에는 참조값이 들어있다.
		//str.을 통해 여러 기능들을 사용할 수 있다.
		//str.을 통해 사용하는 기능들을 '메소드'라고 한다.
		String str = "abcde12345";
		int size = str.length();
		char ch = str.charAt(5);
		String result = str.toUpperCase(); //소문자를 모두 대문자로 변환한 문자열 얻어내기
		
		System.out.println(str);
		System.out.println(ch);
		System.out.println(size);
		System.out.println(result);
		
		//result에도 '참조값'이 들어가있어 .(dot)을 통한 기능 사용이 가능하다.
		System.out.println(result.charAt(0)); 
		
	
		
		
		

	}
}
