/*블로그ok*/
package test.main;

/*
생성자를 이용해 
필드에 값을 대입하는 방법과

setter을 이용해
필드에 값을 대입하는 방법을 비교해보자!
*/
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
