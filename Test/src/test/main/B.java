package test.main;

public class B {

	class B1{
		public int b1=1;
	}
	
	static public class B2{
		public int b2=1;
	}
	
	public int c;
	public static int d;
	
	public void print3() {
		System.out.println(c); //(5.o)
		System.out.println(d); //(6.o)
	}
	
	public static void print4() {
		System.out.println(c); //(7.x)
		System.out.println(d); //(8.o)
	}
	
	public static void main(String[] args) {

		A ca=new A(); //(9.o)
		int num=ca.a; //(10.o)
		ca.print(); //(11.o)
		
		int num2=A.b; //(12.o)
		A.print2(); //(13.o)
		
		B1 cb1=new B1(); //(14.x)
		int num3=cb1.b1; //(15.x)
		
		B2 cb2=new B2(); //(16.o)
		int num4=cb2.b2; //(17.o)
		
		
		System.out.println(c);//(18.x)
		System.out.println(d);//(18.o)
		
		print3();//(20.x)
		print4();//(21.o)	
		
	}
}
