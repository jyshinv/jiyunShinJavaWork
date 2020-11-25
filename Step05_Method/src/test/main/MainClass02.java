package test.main;
import test.mypac.House;
public class MainClass02 {
	public static void main(String[] args) {
		 //House 클래스를 이용해서 여러분들이 집에서 편안하게 3번 쉬어보세요.
		House h1 = new House();
		String name = "신지윤";
		h1.relax(name);
	
		
		//집에서 100번 쉬어보세요.
		for(int i=0; i<100; i++) {
			h1.relax(name);
		}
		
	}
}
