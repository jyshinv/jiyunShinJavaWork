package test.main;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("---(6)new Phone()으로 객체 생성---");
		Phone p=new Phone();
		System.out.println("---(7)new HandPhone()으로 객체 생성---");
		HandPhone h=new HandPhone();
		Phone p2=h; //업캐스팅
		HandPhone h2=(HandPhone)p2; //다운캐스팅
		
		System.out.println("---(8)p.call()--");
		p.call();//부모클래스의 메소드가 호출된다.
		System.out.println("---(9)h.call()--");
		h.call();//자식클래스의 오버라이딩 된 메소드가 호출된다.
		System.out.println("---(10)p2.call()--");
		p2.call(); //자식클래스의 오버라이딩 된 메소드가 출력된다.
		System.out.println("---(11)h2.call()--");
		h2.call(); //자식클래스의 오버라이딩 된 메소드가 출력된다.
		
		h.pa=3;
		System.out.println("---(12)h.pa=3대입 후 h.pa출력--");
		System.out.println(h.pa);
		p.pa=5;
		System.out.println("---(13)p.pa=5대입 후 p.pa출력--");
		System.out.println(p.pa);
		System.out.println("---(14)p2.pa를 출력하면 무엇이 출력될까?--");
		System.out.println(p2.pa);


	}
}
