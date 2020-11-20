package test.mypac;

public class Member {
	
	public int num; //추후 Member 클래스로 객체를 생성하게 되면 num이라는 필드가 생긴다.
	public String name;
	public String addr;	
	
	public void showInfo() {
		//this : 자기자신의 참조값을 의미한다.
		//this.num과 this.name, this.addr로 사용할 수 있다. 
		System.out.println("----정보----");
		System.out.println("번호 :" + this.num);
		System.out.println("이름 : " +this.name);
		System.out.println("주소 :" +this.addr);
		System.out.println("------------");
	}
	
}
