package test.main;

public class TestClass {
	
	public static void main(String[] args) {
		Util u = new Util();
		u.doSomething();
		
		Pen p1 = Factory.getPen();
		
		Radio  r1 = new Radio( );
		Radio a = r1.playMusic( );
		
		Pen[] pens = {new Pen(), new Pen()};

		Computer.test();
	}
	

}

//깃테스트
