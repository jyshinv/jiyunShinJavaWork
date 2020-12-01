/*2020.11.30*/
package test.main;

import java.util.ArrayList;
import java.util.List;
import test.mypac.MemberDTO;

public class MainClass06 {
	public static void main(String[] args) {
		//MemberDTO 객체의 참조값을 담을 수 있는 ArrayList 객체를 생성해서
		//ArrayList 객체의 참조값을 List type지역변수 members에 담기
		List<MemberDTO> members=new ArrayList<>();
		
		//방법1. 3명의 회원 정보를 members배열에 담아보세요. 단, MemberDTO의 디포트생성자를 이용하세요.
		MemberDTO mem1=new MemberDTO();
		MemberDTO mem2=new MemberDTO();
		MemberDTO mem3=new MemberDTO();
		mem1.setNum(1);
		mem1.setName("강아지");
		mem1.setAddr("인천");
		
		mem2.setNum(2);
		mem2.setName("해골");
		mem2.setAddr("제주도");
		
		mem3.setNum(3);
		mem3.setName("원숭이");
		mem3.setAddr("부산");
		members.add(mem1);
		members.add(mem2);
		members.add(mem3);
		
		
		//방법2. 3명의 회원 정보를 members 배열에 담아보세요.
		MemberDTO m1=new MemberDTO(4, "강아지", "인천");
		MemberDTO m2=new MemberDTO(5, "해골", "제주도");
		MemberDTO m3=new MemberDTO(6, "원숭이", "부산");
		members.add(m1);
		members.add(m2);
		members.add(m2);
		
		//방법3. 위의 6줄을 이렇게 표현할 수 있다.
		members.add(new MemberDTO(7,"강아지","인천"));
		members.add(new MemberDTO(8,"해골","제주도"));
		members.add(new MemberDTO(9,"원숭이","부산"));

		for(int i=0; i<members.size(); i++) {
			String info="번호는 "+members.get(i).getNum()+ 
					" 이름은 "+members.get(i).getName()+
					" 주소는 "+members.get(i).getAddr();
			System.out.println(info);
		}
		System.out.println("---------위for문줄이기------------");
		//위의 for문 줄이기
		for(int i=0; i<members.size(); i++) {
			MemberDTO tmp=members.get(i);
			String info="번호는 "+tmp.getNum()+ 
					" 이름은 "+tmp.getName()+
					" 주소는 "+tmp.getAddr();
			System.out.println(info);
		}
		//확장for문
		System.out.println("-----------확장for문----------");
		for(MemberDTO tmp:members) {
			//tmp는 요소
			String info="번호는 "+tmp.getNum()+ 
					" 이름은 "+tmp.getName()+
					" 주소는 "+tmp.getAddr();
			System.out.println(info);
			
		}
		
		
	}
}
