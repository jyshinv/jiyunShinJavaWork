package test.main;

public class Phone{
	
	public String s="Phone";
	public int pa;
	
	//디포트 생성자
	public Phone() {
		System.out.println("Phone 디포트 생성자 호출");
	}
	
	//call()메소드 
	public void call() {
		System.out.println("집에서 전화를 Phone으로 걸어요");
	}
	
	
	//reDial() 메소드 
	public void reDial() {
		System.out.println("방금 걸었던 전화를 다시 걸어요.");
	}
	
	
}
