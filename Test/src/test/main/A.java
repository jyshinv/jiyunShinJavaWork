package test.main;

public class A {
	
	public int a;
	public static int b;
	
	public void print() {
		System.out.println(a); //(1.o)
		System.out.println(b); //(2.o)
	}
	
	public static void print2() {
		System.out.println(a);//(2.x)
		System.out.println(b);//(4.o)
		
	}

}
