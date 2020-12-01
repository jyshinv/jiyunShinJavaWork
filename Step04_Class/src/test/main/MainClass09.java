/*블로그ok*/
package test.main;

import test.mart.Computer;
import test.mart.Cpu;
import test.mart.HardDisk;
import test.mart.Memory;

public class MainClass09 {
	
	public static void main(String[] args) {
		
		/*
	프로그래밍의 목적
	test.mart 패키지 안에 있는 클래스를 활용해서...
	1. 게임을 한다.
	2. oli999@naver.com으로 이메일을 보낸다.
		 */
		String addr = "oli999@naver.com";
		
		
		//cpu, hardDisk, memory 객체 생성
		Cpu cpu = new Cpu();
		HardDisk hardDisk = new HardDisk();
		Memory memory = new Memory();
		
		//cpu, hardDisk, memory객체를 인자로 하는 Computer객체 생성 
		//Computer 클래스에는 매개변수가 있는 생성자가 이미 선언되어있어 디포트 생성자를 명시적으로 써주지 않는이상 디포트 생성자가 호출되지 않는다.
		//즉, Computer c1 = new Computer()로는 객체 생성을 하지 못한다. 무조건 인자를 넘겨주어야함 
		Computer c1 = new Computer(cpu, memory, hardDisk);
		c1.playGame();
		c1.sendEmail(addr);
		
		//위의 3줄은 아래와 같이 표현할 수도 있다.
		Computer c2 = new Computer(new Cpu(), new Memory(), new HardDisk());
		c2.playGame();
		c2.sendEmail(addr);
		
		
	}
	

}
