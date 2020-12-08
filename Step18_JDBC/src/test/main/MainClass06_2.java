package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import test.util.DBConnection;

/*
Scanner 객체를 이용해서 검색할 회원의 번호를 입력 받아서
DB에 SELECT하고 결과 값이 있으면 해당 회원의 정보를 콘솔창에 출력하고
결과 값이 없으면 해당 회원은 존재하지 않습니다. 라고 출력되는 프로그래밍을 해보세요.
DBConnection 클래스를 이용하시오!
hint : String sql = "SELECT num, name, addr FROM member WHERE num=?";

예) 
검색할 회원번호 입력 : 
801
801번 회원은 존재하지 않습니다.
검색할 회원번호 입력 : 
850
번호 : 850, 이름 : 톰캣, 주소 : 건물 옥상 

*/
public class MainClass06_2 {
	public static void main(String[] args) {

		// 검색할 회원번호 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.print("회원번호를 입력하세요:");
		int snum = scan.nextInt();

		// 필요한
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int flag = 0;
		try {
			// Connection 객체의 참조값 얻어오기
			conn = new DBConnection().getConn();

			// 실행할 sql문의 뼈대 준비하기
			String sql = "SELECT num, name, addr FROM member WHERE num=?";

			// prepareStatement에 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);

			// ?에 값 바인딩하기
			pstmt.setInt(1, snum);
			
			rs = pstmt.executeQuery();

			//2번 답 
			//검색해오려는 ResultSet은 어짜피 row한줄 이므로 rs.next()가 false일때까지 while문을 돌릴 필요가 없다.
			if(rs.next()) {
				//select된 row가 존재한다면 커서가 위치한 곳의 데이터 얻어오기 
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				System.out.println("번호:" + num + ", 이름: " + name + ", 주소:" + addr);	
			}else {
				System.out.println(snum+"번 회원은 존재하지 않습니다.");				
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

	}
}
