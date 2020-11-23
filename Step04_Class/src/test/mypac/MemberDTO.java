package test.mypac;

/*
아래와 같이 설계된 클래스를 DTO(Data Transfer Object)라고 한다.

[MemberDTO 만드는 방법]
1. 필드의 접근 지정자는 private로 지정
2. 기본 생성자와, 필드에 모든 값을 전달 받는 생성자 2개가 있어야 한다.
3. 필드의 접근 메소드 setter, getter 메소드가 형식에 맞게 정의되어 있어야한다.
(set, get + ctrl+spacr 하거나 해당 클래스내에서 우클릭 Source-Gnerate Getter/Setter로 만들어주면 된다.)

[생성자의 특징]
0. 객체를 new로 생성할 때 호출된다.
1. 클래스 이름으로 선언한다.
2. no return type
3. 디포트 생성자이든, 매개변수가 있는 생성자이든 뭐든간에 아무 생성자도 없다면
new하는 순간 자동으로 디포트 생성자가 생성된다. 따라서 new 클래스명()으로 객체 생성이 가능하다. 
그러나 매개변수가 있는 생성자를 하나 이상 생성하면 디포트 생성자는 생성되지 않는다. 즉, new 클래스명()으로는 객체 생성을 하지 못하고 new 클래스명(인자1,~~)로만 객체 생성을 해줘야한다. 
따라서 new 클래스명() 이런식으로도 객체를 생성하고 싶다면 디포트 생성자를 명시적으로 써주어야 한다. 
이처럼 생성자를 여러개 만들어주는 것을 constructor overloading 이라고 한다.

*/

public class MemberDTO {

	//public : 전체공개, private : 비공개  
	//private으로 선언해두면 클래스 안에서만 접근할 수 있다. 
	//private으로 선언해두면 메인메소드에서 객체.필드명~ 으로 접근할 수 없다. 
	//따라서 메인메소드에서도 객체의 필드에 접근할 수 있게 하기 위해 get, set 함수를 선언해준다.
	//필드를 비공개로 하는 이유?
	//필드를 공개로 해놔서 개발자들이 마구잡이로 수정할 수 있어 잘못된 데이터들을 대입한다면 어플리케이션의 신뢰성이 떨어질 수 있다.
	//기계의 부품들을 딱딱한 플라스틱으로 가려놔 부품을 못건드려 기계가 고장나지 않게 한것처럼
	//필드도 가려놓고 어플리케이션이 고장나지 않도록 해주자!
	private int num;
	private String name;
	private String addr;
	
	//생성자(Constructor)
	//객체를 new 할 때 호출되는 생성자
	//생성자 특징은 리턴 type (no return type)가 없고 클래스명과 동일하게 작성해야 한다.
	public MemberDTO(int num, String name, String addr) {
		System.out.println("MemberDto()생성자가 호출됨!");
		 //this.num, this.name, this.addr에 아무것도 없음 0nullnull이 출려될것임
		System.out.println(this.num+this.name+this.addr);
		//매개변수를 통해 this.num, this.name, this.addr에 값을 넣어줌
		this.num = num; 
		this.name = name;
		this.addr = addr;
		System.out.println(this.num+this.name+this.addr);//매개변수로 입력한 값들이 출력될것임 
	}
	
	//기본(default) 생성자를 명시적으로 정의하기
	//생성자는 얼마든지 다중 정의할 수 있다.
	//다중 정의를 overloading 이라고 한다.
	public MemberDTO() {
		// MemberDTO(int num, String name, String addr) 이런 메소드만 있다면 
		//객체 생성 시 MemberDTO dto1 = new MemberDTO(1,"김재성","노량진") 으로만 생성해야 한다.
		//그냥 MemberDTO dto1 = new MemberDTO() 로만 생성하고 나중에 값을 넣고싶다면
		//지금처럼 매개변수가 없는 생성자를 하나 적어주어야 한다. 
	}
	
	//필드에 num값을 수정하는 setter 메소드
	public void setNum(int num) {
		this.num=num;
	}
	
	//필드에 num값을 리턴해주는 getter메소드
	public int getNum() {
		return this.num;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getAddr() {
		return addr;
	}

	
	
	
}
