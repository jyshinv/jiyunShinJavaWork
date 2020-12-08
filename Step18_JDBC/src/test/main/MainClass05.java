package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.util.DBConnection;

/*
member 테이블에서
회원번호가 801번 회원의 정보를 삭제하는 기능을 완성해보기
단, DBConnection 클래스를 사용해보세요.
*/

public class MainClass05 {
	public static void main(String[] args) {
		//삭제할 회원의 번호
		int num=801;
		
		//필요한
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			//Connection 객체의 참조값 얻어오기  
			conn = new DBConnection().getConn();
			
			//실행할 sql문의 뼈대 준비하기
			String sql="DELETE FROM member WHERE num=?";
			
			//prepareStatement에 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			
			//?에 값 바인딩하기
			pstmt.setInt(1, num);
			
			//sql문 실행하고 반환된 row의 개수 리턴받기 
			flag=pstmt.executeUpdate();
			
			System.out.println("삭제를 완료하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
				try {
					if(conn != null) conn.close();
					if(pstmt != null) pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		
		//flag엔 update한 row개수가 들어있음!
		if (flag > 0) { //1개 이상 update했다면 
			System.out.println("작업(DELETE) 성공");
		} else {
			System.out.println("작업(DELETE) 실패");
		}
		
		
			
		
		
	}
}
