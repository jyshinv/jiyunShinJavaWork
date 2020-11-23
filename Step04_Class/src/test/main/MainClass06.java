package test.main;

import test.mypac.MemberDTO;

public class MainClass06 {
	public static void main(String[] args) {
		
		//MemberDTO 객체 생성해서 참조값을 dto1이라는 이름의 지역변수에 담기
		//new MemberDTO(~)가 의미하는 바! 1.참조값을 의미 2.생성자를 호출해준다.
		MemberDTO dto1 = new MemberDTO(1,"김구라","연남동");
		MemberDTO dto2 = new MemberDTO(2,"해골","행신동");
		
		
		//getter, setter메소드 사용하기 
		//num이 DTO클래스에서 private num으로 선언되어있다.
		//dto1.num으로 접근하지 못한다.
		//dto1.num=3 //오류남
		//dto1.num; //오류남
		//따라서 num값에 대입하거나, num값을 불러오고 싶을 때는 getter, setter 메소드를 사용한다.
		dto1.getNum(); 
		dto1.setNum(3);
		
		//디포트 생성자가 있기 때문에 이런식으로도 객체 생성이 가능하다.
		MemberDTO dto3 = new MemberDTO();
		dto3.setNum(1);
		dto3.setName("김구라");
		dto3.setAddr("신사동");
		
	}
}
