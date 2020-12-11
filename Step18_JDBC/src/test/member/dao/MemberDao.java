package test.member.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import test.member.dto.MemberDto;
import test.util.DBConnection;

/*
회원정보(member 테이블)의 내용을
select
insert
update
delete
작업을 할 객체를 생성할 클래스 설계하기

-필요한 객체를 담을 지역변수를 선언하는 위치도 중요하다.
-필요한 객체를 생성하는 위치도 중요하다.

Data Access Object(DAO)

-DB에 INSERT, UPDATE, DELETE, SELECT 작업을 수행하는 객체
-Table 마다 하나의 DAO 혹은 주체(카테고리) 마다 하나의 DAO를 작성하게 된다.
-DAO를 만들기 위해서는 DTO클래스를 미리 설계를 하고 만들어야 한다.
-주제(카테고리)에 관련된 DAO는 여러개의 Table의 join이 일어날수도 있다.
따라서 하나의 Table당 하나의 DAO는 아닌것이다.
예를들어 사원정보를 출력한다고 가정을 해보면
emp, dept, salgrade 3개의 테이블의 join이 일어날수도 있다. 


MemberDao dao=new MemberDao() 
dao.~해서 select, insert, update, delete의 기능을 쓸 수 있게끔 만들어보자!
*/
public class MemberDao {
	
	//0_1.모든 회원의 정보를 SELECT 해서 리턴하는 메소드 
	public List<MemberDto> selectAll(){
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<MemberDto> list=new ArrayList<MemberDto>();
		try {
			conn=new DBConnection().getConn();
			String sql="SELECT * FROM member ORDER BY num ASC";
			pstmt=conn.prepareStatement(sql);
			//?에 바인딩 할게 있으면 하고 아님 말고
			rs=pstmt.executeQuery();
			while(rs.next()) {
				MemberDto dto=new MemberDto();
				dto.setNum(rs.getInt("num"));
				dto.setAddr(rs.getString("addr"));
				dto.setName(rs.getString("name"));
				list.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(rs!=null) rs.close();
					if(rs!=null) pstmt.close();
					if(rs!=null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		return list;
		
	}
	
	//0_2.회원 한명의 정보를 SELECT해서 리턴하는 메소드
	public MemberDto select(int num) {
		//필요한 객체의 참조값을 담을 지역변수 만들기
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		MemberDto dto=null;
		try {
			conn=new DBConnection().getConn();
			String sql="SELECT name, addr FROM member"
					+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			//?에 값 바인딩 하기 
			pstmt.setInt(1, num);
			
			//SELECT문 수행하고 결과를 ResultSet으로 받기
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				dto=new MemberDto();
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(rs!=null) rs.close();
					if(rs!=null) pstmt.close();
					if(rs!=null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		
		return dto; 
	}

	// 1.회원 한명의 정보를 저장하는 메소드를 만들어보세요
	// 메소드명 : insert
	// 리턴 type : 알아서
	// 메소드에 전달하는 인자의 type : MemberDto
	public boolean insert(MemberDto dto) {
		// 필요한 참조갑을 담을 지역 변수 미리 만들고 초기화 하기
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			// Connection 객체의 참조값 얻어오기
			conn = new DBConnection().getConn();

			// 실행할 sql문의 뼈대 준비하기
			String sql = "INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL,?,?)";

			// prepareStatement에 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);

			// ?에 값 바인딩하기
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());

			// sql문 실행하고 반환된 row의 개수 리턴받기
			flag = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 마무리작업
			try {	
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// flag엔 update한 row개수가 들어있음!
		if (flag > 0) { // 1개 이상 update했다면
			return true;
		} else {
			return false;
		}

	}

	// 2.회원 한명의 정보를 수정하는 메소드를 만들어보세요
	// 메소드명 : update
	// 리턴 type : 알아서
	// 메소드에 전달하는 인자의 type : MemberDto
	public boolean update(MemberDto dto) {
		// 필요한 참조갑을 담을 지역 변수 미리 만들고 초기화 하기
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			// Connection 객체의 참조값 얻어오기
			conn = new DBConnection().getConn();

			// 실행할 sql문의 뼈대 준비하기
			String sql = "UPDATE member SET name=?, addr=? WHERE num=?";

			// prepareStatement에 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);

			// ?에 값 바인딩하기
			pstmt.setString(1, dto.getAddr());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getNum());

			// sql문 실행하고 반환된 row의 개수 리턴받기
			flag = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 마무리작업
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// flag엔 update한 row개수가 들어있음!
		if (flag > 0) { // 1개 이상 update했다면
			return true;
		} else {
			return false;
		}

	}

	// 3.회원 한명의 정보를 삭제하는 메소드(회원번호가 ~인 회원정보를 삭제해라!)
	// 따라서 회원번호를 인자로 보내주어야한다.
	public boolean delete(int num) {
		// 필요한 참조갑을 담을 지역 변수 미리 만들고 초기화 하기
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			// Connection 객체의 참조값 얻어오기
			conn = new DBConnection().getConn();

			// 실행할 sql문의 뼈대 준비하기
			String sql = "DELETE FROM member WHERE num=?";

			// prepareStatement에 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);

			// ?에 값 바인딩하기
			pstmt.setInt(1, num);

			// sql문 실행하고 반환된 row의 개수 리턴받기
			flag = pstmt.executeUpdate();

			System.out.println("삭제를 완료하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 마무리작업
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// flag엔 update한 row개수가 들어있음!
		if (flag > 0) { // 1개 이상 update했다면
			return true;
		} else {
			return false;
		}

	}

}
