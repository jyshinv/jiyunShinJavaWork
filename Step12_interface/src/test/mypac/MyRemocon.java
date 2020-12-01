package test.mypac;

//interface인 Remocon을 implements 하고나면 빨간줄 에러가 뜬다.
//이때 커서를 갖다대면 add unimplelment methods가 뜨고 그걸 누르면 재정의할 수 있는 코드가 뜬다.
public class MyRemocon implements Remocon{ 

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 올려요");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 내려요");
	}
	
	//메인에서 MyRemocon 객체를 new로 만들면 벌어지는일?
	//Heap에 Object,Remocon,MyRemocon가 생성된다. interface가 클래스는 아니지만 마치 부모의 역할을 한다. 
	
	//또 public class MyRemocon implements 인터페이스1, 인터페이스2, 인터페이스2...{} 으로 interface는 다중구현이 가능한다.
	
}
