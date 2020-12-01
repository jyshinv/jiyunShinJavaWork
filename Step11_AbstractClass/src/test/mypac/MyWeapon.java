package test.mypac;

//1.추상클래스를 extends하면 빨간줄이 뜨며 에러가 난다.
//이때 빨간줄에 커서를 댄 후 'Add unimplemented methods' 버튼을 클릭한다. 
public class MyWeapon extends Weapon{

	//2. 버튼을 클릭 해 미완성의 추상 메소드를 오버라이드 하는 코드를 생성해야한다.
	//부모의 추상메소드를 자식클래스에서 재정의 해주어야한다.
	@Override
	public void attack() {
		System.out.println("코로나를 공격해요~");
	}

	

}
