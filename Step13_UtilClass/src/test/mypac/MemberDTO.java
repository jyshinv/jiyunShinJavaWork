package test.mypac;

//DTO구현 
public class MemberDTO {
	//필드
	private int num;
	private String name;
	private String addr;
	
	//디폴트 생성자
	public MemberDTO() {
	}
	
	//인자로 모든 필드에 값을 대입해주는 생성자
	public MemberDTO(int num, String name, String addr) {
		this.num=num;
		this.name=name;
		this.addr=addr;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	

}
