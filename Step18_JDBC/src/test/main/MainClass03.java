package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
executeUpdate()

-만일 sql문이 DELETE문이라면
String sql="DELETE FROM member WHERE num=?"
pstmt.setInt(1,100); //첫번째 물음표에 100을 넣는다.삭제할 회원의 번호를 입력하면 된다. 
flag=pstmt.executeUpdate();

-만일 sql문이 UPDATE문이라면
String sql="UPDATE member SET name=?, addr=? WHERE num=?";
pstmt.setString(1,"kim");
pstmt.setString(2,"nrg");
pstmt.setInt(3,100);
flag=pstmt.executeUpdate();


*/

public class MainClass03 {
	public static void main(String[] args) {
		
		//아래의 정보를 선생님(원격지) 오라클db 있는 member테이블에 저장하려고 한다.
		String name="톰캣";
		String addr="건물 옥상";
		
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

		//sql문을 대신 수행해주는 객체의 참조값을 담을 지역변수
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			//미완성의 insert문
			String sql="INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL,?,?)";
			
			pstmt=conn.prepareStatement(sql);
			
			// ?에 순서대로 값을 바인딩 하기
			pstmt.setString(1, name); //미완성된 sql문의 첫번째 물음표에 name
			pstmt.setString(2, addr); //미완성된 두번째 물음표에 addr
			
			//INSERT, UPDATE, DELECT한다면 executeUpdate()메소드를 쓴다.update row개수를 반환
			//완성된 sql문을 수행하고 변화된 row의 개수를 리턴 받는다. 
			flag=pstmt.executeUpdate(); 
			
			System.out.println("회원 정보를 저장했습니다.");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(pstmt !=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		//flag엔 update한 row개수가 들어있음!
		if(flag>0) { //1개 이상 update했다면 
			System.out.println("작업(INSERT) 성공");
		}else {
			System.out.println("작업(INSERT) 실패");
		}
	}
}
