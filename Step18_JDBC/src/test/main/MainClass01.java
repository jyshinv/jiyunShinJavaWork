package test.main;

//모두 java.sql패키지에 있다. 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
Java DataBase Connectivity (JDBC)

- oracle에 연결하기 위해서는 드라이버가 들어 있는 ojdbc6.jar 파일이 필요하다.
- 프로젝트 설정에서 ojdbc6.jar를 사용할 준비를 해야한다.
- 외우지 말것 복붙해서 쓸것임!! 다만, 각각이 무엇이 의미하는지는 알아야함 

*/

public class MainClass01 {
	public static void main(String[] args) {
		//DB 연결 객체를 담을 지역변수
		Connection conn=null;
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//1.접속할 DB정보
			//-선생님 Oracle  
			String url="jdbc:oracle:thin:@14.63.164.99:1521:xe";
			
			//-Local Oracle 
			//String url="jdbc:oracle:thin:@localhost:1521:xe";
			
			//2. 접속하고 Connection 객체의 참조값 얻어오기
			//-선생님 Oracle
			conn=DriverManager.getConnection(url,"acorn01","tiger01");

			//-Local Oracle 
			//conn=DriverManager.getConnection(url,"scott","tiger");
			
			System.out.println("Oracle DB 접속 성공");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//Member 테이블의 내용을 select 해서 console 에 출력해보기
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			String sql="SELECT num, name, addr FROM member ORDER BY num ASC";
			//sql문을 대신 실행해주는 PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);//PreparedStatement가 sql에 담겨있는 SELECT문을 대신 수행해줌 

			//SELECT문 수행하고 결과 row를 ResultSet 객체로 받아오기
			//-->sql이 SELET문이면 결과를 반환하므로 그 결과값을 받아주는 executeQuery() 메소드를 사용해야한다.
			rs=pstmt.executeQuery();
	
			//rs.next()메소드가 false를 리턴할때 까지 while 반복문 돌기 
			while(rs.next()) {
				//현재 커서가 위치한 곳에서 num칼럼의 값을 정수로 얻어내기
				int num=rs.getInt("num");
				//현재 커서가 위치한 곳에서 name 칼럼의 값을 문자로 얻어내기
				String name=rs.getString("name");
				//현재 커서가 위치한 곳에서 name 칼럼의 값을 문자로 얻어내기
				String addr=rs.getString("addr");
				System.out.println(num+"|"+name+"|"+addr);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//sql문에 오타가 발생하거나 문제가 생겨
			//ResertSet rs에 아무 row도 못담아오게 되면 지역변수에서 rs에 null을 넣어놨기 때문에 null이 되버리는데
			//만약 rs가 null이 된채로 rs.close()를 수행하면 nullPointerException이 되버려
			//catch문으로 이동한다. 
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn !=null)conn.close();
			}catch(Exception e) {}
		}
		System.out.println("main메소드가 종료됩니다.");
		
	}
}
