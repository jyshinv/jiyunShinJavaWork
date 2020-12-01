package test.main;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		1. 3명의 회원정보를 HashMap 객체를 3개 생성해서 각각 담아보세요.
		번호 => "num"이라는 키값으로 정수 저장
		이름 => "name"이라는 키값으로 문자열 저장
		주소 => "addr"이라는 키값으로 문자열 저장
		
		2.위에서 생성한 Map을 담은 ArrayList 객체를 생성하고 생성된 참조값을
		map1 라는 이름의 지역변수에 담아보세요.
		
		3.map1에 회원정보가 담긴 Map객체의 참조값을 순서대로 담아보세요.
		4. 반복문 돌면서 map1에 담긴 내용을 아래와 같은 형식으로 출력해보세요.
		
		번호 : 1, 이름 : 김구라, 주소 : 노량진
		번호 : 2, 이름 : 해골, 주소 : 행신동
		*/
		
		
		//1
		Map<String, Object> map1=new HashMap<String, Object>();
		Map<String, Object> map2=new HashMap<String, Object>();
		Map<String, Object> map3=new HashMap<String, Object>();
		map1.put("num",1);
		map1.put("name","김구라");
		map1.put("addr","노량진");
		map2.put("num",2);
		map2.put("name","해골");
		map2.put("addr","행신동");
		map3.put("num",3);
		map3.put("name","개구리");
		map3.put("addr","홍대");
		
		//2
		List<Map<String, Object>> members=new ArrayList<>();
		
		//3
		members.add(map1);
		members.add(map2);
		members.add(map3);
		
		//4_1 : for문
		for(int i=0; i<members.size(); i++) {
			int num=(int)members.get(i).get("num");
			String name=(String)members.get(i).get("name");
			String addr=(String)members.get(i).get("addr");
			System.out.println("번호: "+num+ ", 이름 : "+name+", 주소 :" +addr );
		}
		
		System.out.println("------------------------------");
		
		//4_2: 향상된 for문 , 요소는 Map타입임!
		for(Map<String, Object> m:members) {
			int num=(int)m.get("num"); //object타입(부모타입)이므로 형변환 해주어야한다.
			String name=(String)m.get("name"); //object(부모타입)타입이므로 형변환 해주어야한다.
			String addr=(String)m.get("addr"); //object(부모타입)타입이므로 형변환 해주어야한다.
			System.out.println("번호: "+num+ ", 이름 : "+name+", 주소 :" +addr );
			
			//object형을 syso에 넣으면 ","문자열과 연결연산자+ 해져 자동 형변환 된다. 
			System.out.println(m.get("num")+","+m.get("name")+","+m.get("addr"));
		}
		
		
		
		
		
		
	}
}
