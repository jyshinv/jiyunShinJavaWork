package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 *  HashSet 클래스는 Set 인터페이스를 구현한 클래스 이다.
 *  - 저장된 데이터를 순서없이 무작위로 관리한다.
 *  - key 값도 없다.
 *  - 중복을 허용하지 않는다 ( 같은값이 두개 이상 존재할수 없다 )
 *  - 어떤 data 를 묶음(집합) 으로 관리 하고자 할때 사용한다. 
 *  - 중복된 데이터를 제거 할때도 유용하다
 */
public class MainClass09 {
	public static void main(String[] args) {
		
		/*HashSet 클래스는 Set 인터페이스를 구현한 클래스이다.
		따라서 
		HashSet<type> h=new HashSet<type>();
		으로
		Set<type> h=new HashSet<type>(); 으로 다형성을 구현할 수 있다.
	
		HashSet은 사탕봉지에 사탕을 마구잡이로 집어넣는 느낌
		
		*/
		
		

		//정수 값을 저장할 수 있는 HashSet객체
		Set<Integer> set1=new HashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		
		//어떤 data가 Set에 있는지 여부를 리턴하는 메소드
		boolean result1=set1.contains(10); //true
		boolean result2=set1.contains(50); //false
		
		//Set가 비어있는 지 여부를 리턴
		boolean result3=set1.isEmpty(); //false;
		
		//저장된 아이템의 개수
		int size=set1.size(); //3
		
		//HashSet클래스는 키값도 없고, 인덱스도 없는데 어떻게 값을 찾아올까?
		//Iterator을 사용하자.
		//정수가 일렬로 담겨진 Interator 객체의 참조값 얻어내기
		Iterator<Integer> it=set1.iterator();
		
		//커서 다음에 데이터가 있으면 while문이 돌아간다. 
		while(it.hasNext()) {
			//커서를 다음 데이터로 옮겨서 해당 데이터를 읽어낸다.
			Integer tmp=it.next();
			//읽어낸 데이터 콘솔에 출력하기
			System.out.println(tmp);
			
		}
		
		
	}
}
