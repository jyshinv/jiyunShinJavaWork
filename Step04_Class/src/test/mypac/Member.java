package test.mypac;

public class Member {
	
	public int num; 
	public String name;
	public String addr;	
	
	public void showInfo() {
		//this : 자기자신의 참조값을 의미한다.
		//this.num과 this.name, this.addr로 자기자신 객체의 필드에 접근할 수 있다.
		System.out.println("----정보----");
		System.out.println("번호 :" + this.num);
		System.out.println("이름 : " +this.name);
		System.out.println("주소 :" +this.addr);
		System.out.println("------------");
	}
	
}
