package test.main;

import java.lang.*;
public class C {
	public static void main(String[] args) {
		
		
		Object o="Hello";
		
		//String s = o; --> 에러가 난다. 
		String s = (String)o;
		
	
	}
}
