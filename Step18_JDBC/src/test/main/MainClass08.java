package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.member.dto.MemberDto;
import test.util.DBConnection;

/*
member 테이블에 있는 회원 목록을 SELECT하고
num에 대해서 오름차순 정렬해서
List<MemberDto> 형태로 만들어보세요.
*/

public class MainClass08 {
	public static void main(String[] args) {
		//list에는 참조값이 들어있음!!! (객체 생성 후 대입했으므로)
		List<MemberDto> list=new ArrayList<>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn = new DBConnection().getConn();
			
			String sql="SELECT num, name, addr FROM member ORDER BY num ASC";
			pstmt = conn.prepareStatement(sql);
			//?가 없으므로 바인딩할 내용도 없다.
			rs=pstmt.executeQuery();
			while(rs.next()) { //반복문 돌면서 커서를 한칸씩 내린다.
				//커서가 위치한 곳의 데이터를 읽어와서 MemberDto 객체를 생성해서 담고
				MemberDto dto=new MemberDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				
				//생성된 MemberDto 객체의 참조값을 ArrayList 객체에 누적시킨다.
				list.add(dto);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(conn!=null) conn.close();
					if(pstmt!=null) pstmt.close();
					if(rs!=null) rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		//위의 코드를 수행한 후의 배열의 방의 개수 참조해보기
		int size=list.size();
		//showInfo() 메소드에 List의 참조값 전달해보기
		showInfo(list);
		
		System.out.println("메인메소드가 종료됩니다.");
	}//end of main
	
	//showInfo 메소드
	public static void showInfo(List<MemberDto> list) {
		//일반 for문
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).getNum()+"|"
//							+list.get(i).getName()+"|"+list.get(i).getAddr());
//		}

		//향상된 for문 : 위의 코드는 아래와 같이 쓸 수 있다. 
		for(MemberDto tmp:list) { //tmp자체가 요소임! 즉 tmp자체가 MemberDto
			System.out.println(tmp.getNum()+"|"+tmp.getName()+"|"+tmp.getAddr());
		}
	}
	
	
}
