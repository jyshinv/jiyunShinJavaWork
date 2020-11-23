package test.main;

import test.mypac.MemberDTO;

public class MainClass07 {
	public static void main(String[] args) {
		//객체 생성과 동시에 필드에 저장할 값 전달하기 
		MemberDTO dto1=new MemberDTO(1, "김구라", "노량진");
		
		//setter로 필드에 저장할 값 전달하기 
		MemberDTO dto2=new MemberDTO();
		dto2.setNum(2);
		dto2.setName("해골");
		dto2.setAddr("행신동");
	}
}
