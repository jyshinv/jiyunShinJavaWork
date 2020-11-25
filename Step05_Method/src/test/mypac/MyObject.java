package test.mypac;

/*

[메소드를 만들 때 고려해야 하는것]
1. 접근 지정자  (public, protected, default, private)
2. static or non static
3. 리턴 type (void 는 어떤 type도 리턴하지 않는다는 의미)
4. 메소드명(영문자 소문자로 시작하고 예약어가 아니면 된다)
5. 메소드에 전달하는 인자의 개수와 데이터 type

*/

public class MyObject {
	//어떤값도 리턴하지 않는 메소드 
	public void walk() {
		System.out.println("걸음을 걸어요~");
		
	}
	
	//int type을 리턴하는 메소드 
	public int getNumber() {
		//리턴 type을 void가 아닌 다른 type으로 지정했으면 그 type으로 반드시 리턴해줘야한다. 
		int num=10;
		return num; //return을 만나면 값을 return하고 함수를 종료한다. 
	}
	
	//String type을 리턴하는 메소드
	public String getGreeting() {
		String greet = "안녕하세요";
		return greet;
	}
	
	//House 타입을 리턴하는 메소드
	public House getHouse() {
		House house = new House();
		return house;
	}
	
	//phone type을 전달받는 메소드
	public void usePhone(Phone p) {
		p.call();
	}
	
	//Phone type을 전달받는 static 메소드 
	public static void callPhone(Phone p) {
		p.call();
	}
	
	//House type을 리턴해주는 static 메소드 
	public static House buyHouse() {
		return new House();
	}
	
}
