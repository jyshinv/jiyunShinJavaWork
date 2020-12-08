package test.main;
/*
Exception 의 종료는 크게 두가지이다
1. RuntimeException 을 상속받아서 만든 실행중에 발생하는 Exception
2. RuntileException 을 상속받지 않아서 만든 컴파일 중에 발생하는 Exception

*/

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main메소드가 시작되었습니다.");
		
		//Thread클래스의 static메소드 sleep
		//이 경우 RunTimeException을 상속받지 않기 때문에
		//컴파일 중에 오류가 발생한다.따라서 try~catch문으로 묶어야 한다.
		//아래 코드를 작성하면 빨간줄이 뜨는데 그 빨간줄에 커서를 대면  Surround with try/catch 버튼이 뜬다.
		//Thread.sleep(5000);  
		
		//try/catch문으로 묶은 Thread.sleep(5000);
		try {
			//스레드(작업단위, Thread)를 5초동안 잡아두기
			//반드시 try~catch블럭으로 예외처리 해야한다. 
			Thread.sleep(5000);// 5000밀리초 즉, 5초 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
 		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
