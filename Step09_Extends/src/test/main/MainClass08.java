package test.main;

import test.mypac.*;

public class MainClass08 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		Phone p1 = null;
		Phone p2 = new Phone();
		
		MainClass08.usePhone(p1);
		MainClass08.usePhone(p2);
		
		System.out.println("메인메소드가 종료됩니다.");
		
	}
	
	public static void usePhone(Phone p) {
		//여기에서 NullPointerException을 방지하는 방법이 있을까요?
		if(p != null) {
			p.call();
		}
	}

}
