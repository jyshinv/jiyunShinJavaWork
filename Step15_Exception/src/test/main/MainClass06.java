package test.main;

public class MainClass06 {
	public static void main(String[] args) throws InterruptedException {
		
		//1초마다 for문이 돌게 만들기 
		for(int i=0; i<10; i++) {
			System.out.println(i);
			//이 곳으로 오면 1초간 멈춘다. 
			Thread.sleep(1000);
			//위에 Interrupted Exception을 throws해주면 
			//main에서 처리를 해주기 때문에 try/catch를 해주지 않아도 된다. 
			
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
