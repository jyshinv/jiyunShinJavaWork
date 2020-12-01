package test.main;

import test.mypac.Drill;

public class MainClass05 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 3개 뚫어요");
				
			}
		});
		
		//위 코드는 useDrill()함수의 인자로 동작을 전달한다. '메소드()에  전달-> 동작을{}'
		//따라서 아래 코드와 같이 쓸 수 있다.  

		//아래 코드를 쓰려면 useDrill() 내 메소드가 단, 1개여야 한다.
		//() -> {동작서술} : 이 자체로 참조값을 의미한다./메소드를 재정의 해주는 기능 
		useDrill(()-> {
			System.out.println("천장에 구멍을 2개 뚫어요");
		});
		
		//위의 코드를 풀어쓰면
		Drill d1 =()->{
			System.out.println("아무데나 구멍을 뚫어요");
		};
		useDrill(d1);
		
		//자바스크립트 let a = function(){}; 와 비슷한 느낌!
	}
	
	
	public static void useDrill(Drill d) {
		d.hole();
	}

}
