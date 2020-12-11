package test.main;

import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		//850번 회원의 정보를 삭제하고자 한다.
		
		//이미 만들어진 클래스로 객체를 생성해서
		MemberDao dao=new MemberDao();
		
		//delete메소드를 사용
		boolean isSuccess=dao.delete(1929);
		
		//delete메소드의 delete 성공 여부를 출력해주는 if문
		if(isSuccess) {
			System.out.println("삭제 성공!");
		}else {
			System.out.println("삭제 실패!");
		}

		System.out.println("메인 메소드가 종료됩니다.");
		
	}

}
