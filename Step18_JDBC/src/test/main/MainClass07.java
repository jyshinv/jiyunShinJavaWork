package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import test.member.dto.MemberDto;
import test.util.DBConnection;

/*
Scanner 객체를 이용해서 검색할 회원의 번호를 입력받아서 
입력받은 숫자를 이용해서 SELECT문을 수행하고
결과값을 MemberDto 객체를 생성해서 담아보세요.

결과가 없다면 MemberDto 객체를 생성하지 마세요 ( null 인 상태로 두기 )
*/

public class MainClass07 {
	public static void main(String[] args) {
		// 검색할 회원번호 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.print("회원번호를 입력하세요:");
		int num = scan.nextInt();

		//검색된 회원 정보가 담길 MemberDto 객체의 참조값을 담을 지역변수 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDto dto=null;
		int flag = 0;
		try {
			conn = new DBConnection().getConn();
			String sql = "SELECT num, name, addr FROM member WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) { //select된 결과가 있다면
				//MemberDto 객체를 생성해서 
				dto=new MemberDto();
				//ResultSet 객체에 있는 값도 얻어와서 담아준다.
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
			} 

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
				if(rs!=null) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//위의 try~catch~finally 절이 수행된 후에 SELECT 된 결과가 있는지 없는지를
		//여기에서 쉽게 판별할 수 있는 방법이 있나요?
		if(dto == null) {
			System.out.println(num+ "번 회원은 존재하지 않습니다.");
		}else {
			System.out.println("번호 :" + dto.getNum() + ", 이름:" + dto.getName() + ", 주소:" + dto.getAddr());
		}
		
		/*
		1개의 row말고, 여러개의 row를 불러와야한다면 어떻게 해야할까?
		1개의 row라면 -> 1개의 MemberDto
		여러개의 row라면 -> 여러개의 MemberDto => 1개의 MemberDto를 List<MemberDto>에 add.. add.. add..하는 식으로!
		*/
	}

}
