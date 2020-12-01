/*블로그ok*/
package test.main;
import test.mypac.Member;
public class MainClass05 {
	public static void main(String[] args) {
		/*
		두명의 회원정보를 2개의 Member 객체를 생성해서 담아보세요.
		*/
		
		Member mem1=new Member();
		//아래의 코드를 수행하기 전까진 이 객체의 필드에는 0, null, null이 들어간다.
		mem1.num=1;
		mem1.name="김재성";
		mem1.addr="연남동";
		
		Member mem2 = new Member();
		mem2.num=2;
		mem2.name="김구라";
		mem2.addr="노량진";
		
		
		//필드에 직접 접근하여 필드값 출력해보기
		//mem1객체의 필드
		System.out.println("----정보----");
		System.out.println("번호 :" + mem1.num);
		System.out.println("이름 : " +mem1.name);
		System.out.println("주소 :" +mem1.addr);
		System.out.println("------------");
		
		//mem2객체의 필드 
		System.out.println("----정보----");
		System.out.println("번호 :" + mem2.num);
		System.out.println("이름 : " +mem2.name);
		System.out.println("주소 :" +mem2.addr);
		System.out.println("------------");
		
		//메소드를 사용해보기
		mem1.showInfo();
		mem2.showInfo();
		
		

	}
}
