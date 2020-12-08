package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
선생님 오라클 db(원격지) 에 있는 member 테이블에서

num 이 804번인 회원의

addr을 노량진으로 수정하는 코드를 작성해보세요.
*/
public class MainClass04 {
	public static void main(String[] args) {
		String num = "804";
		String addr = "노량진";

		// DB 연결 객체를 담을 지역변수
		Connection conn = null;
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 1.접속할 DB정보
			// -선생님 Oracle
			String url = "jdbc:oracle:thin:@14.63.164.99:1521:xe";

			// -Local Oracle
			// String url="jdbc:oracle:thin:@localhost:1521:xe";

			// 2. 접속하고 Connection 객체의 참조값 얻어오기
			// -선생님 Oracle
			conn = DriverManager.getConnection(url, "acorn01", "tiger01");

			// -Local Oracle
			// conn=DriverManager.getConnection(url,"scott","tiger");

			System.out.println("Oracle DB 접속 성공");

		} catch (Exception e) {
			e.printStackTrace();
		}

		// sql문을 대신 수행해주는 객체의 참조값을 담을 지역변수
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			// 미완성의 insert문
			String sql = "UPDATE member SET addr=? WHERE num=?";

			//prepareStatement에 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);

			// ?에 순서대로 값을 바인딩 하기
			pstmt.setString(1, addr); // 미완성된 sql문의 첫번째 물음표에 addr
			pstmt.setString(2, num); // 미완성된 두번째 물음표에 num
			
			//INSERT, UPDATE, DELECT한다면 executeUpdate()메소드를 쓴다. update한 row개수를 반환해줌
			//완성된 sql문을 수행하고 변화된 row의 개수를 리턴받는다. 
			flag = pstmt.executeUpdate(); 

			System.out.println("회원 정보를 수정했습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//flag엔 update한 row개수가 들어있음!
		if (flag > 0) { //1개 이상 update했다면 
			System.out.println("작업(INSERT) 성공");
		} else {
			System.out.println("작업(INSERT) 실패");
		}
	}

}
