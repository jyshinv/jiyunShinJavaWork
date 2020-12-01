/*
Object type에 대한
공부를 충분히 하고 다시 봐볼 것!
*/
package test.main;

import java.util.HashMap;

public class MainClass02 {
	public static void main(String[] args) {
		/*HashMap 클래스는 Map 인터페이스를 구현한 클래스이다.
		따라서 
		HashMap<type> h=new HashMap<type>();
		으로도 쓰지만
		Map<type> m=new HashMap<type>(); 으로 다형성을 구현할 수 있다.
		*/
		
		
		//한명의 회원 정보라고 가정하자. 아래 정보는 순서가 중요하지 않은 정보이다. 
		int num=1;
		String name="김구라";
		String addr="노량진";
		boolean isMan=true;
		
		//HashMap객체를 이용하여 정보를 담아보자.
		//new HashMap<K, V>();  --> <K,V>는 Generic Class, 여기서 K는 key값의 타입, V는 value값의 type을 나타낸다.
		
		//key값을 Object, value값을 String으로 하면?
		//id(1) : "1"
		//id(2) : "김구라"
		//id(3) : "노량진" 
		//이런꼴로 들어감!
		
		//key값을 String, value를 Object로 하면?
		//"num" : id(1) --> id(1)에는 1이 저장되어있음
		//"name" : id(2) --> id(2)에는 "김구라"가 저장되어있음
		//"addr" : id(3) --> id(3)에는 "노량진"이 저장되어있음
		//"isMan" : id(4) --> id(4)에는  true이 저장되어있음
		
		//Object는 모든 클래스의 부모클래스이다. 따라서 이런 형태가 가능하다.
		Object a = true; 
		Object b = "김구라";  
		System.out.println(a);
		System.out.println(b);

		//map1에 HashMap객체를 담아준다. 
		HashMap<String, Object> map1 = new HashMap<String, Object>();
		//참조값이 저장되며 그 참조값이 가리키는 곳에는 Integer type의 num이 저장된다.
		map1.put("num", num);
		
		//참조값이 저장되며 그 참조값이 가리키는 곳에는 String type의 name이 저장된다.
		map1.put("name",name);
		
		//참조값이 저장되며 그 참조값이 가리키는 곳에는 String type의 addr이 저장된다.
		map1.put("addr",addr);
		
		//참조값이 저장되며 그 참조값이 가리키는 곳에는 Boolean type의 isMan이 저장된다. 
		map1.put("isMan",isMan);
		
		//map1을 이용해서 "num"이라는 키값으로 저장된 int 불러오기 
		//HashMap<K,V>에서 V를 Object타입으로 설정해주면 map1.get()의 return타입이 Object가 된다.
		//따라서 각 변수에 저장해줄 때 형변환을 해주어야 한다. 
		//map1.get(~)은 참조값(object type)이 반환됨!
		System.out.println(map1.get("num"));
		int h1 = (int)map1.get("num");
		String h2 = (String)map1.get("name");
		String h3 = (String)map1.get("addr");
		boolean h4 = (boolean)map1.get("isMan");

		//위의 코드 javaScript랑 비교해보면?
		/*
		let obj1 = {};
		obj1.num=1;
		obj1.name="김구라";
		obj1.addr="노량진";
		obj1.isMan=true;
		
		let a=obj1.num;
		let b=obj1.name;
		let c=obj1.addr;
		let d=obj1.isMan;
		*/
		
		//그밖의 map1의 기능들 
		//저장된 아이템 개수 (4)
		int size=map1.size();
		
		//"addr"로 저장된 아이템 삭제하기
		map1.remove("addr");
		
		//모든 아이템 삭제하기
		map1.clear();
		
	}

}
