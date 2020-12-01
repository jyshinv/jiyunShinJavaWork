package test.mypac;

public class MyUtil {
	
	private String owner = "김구라";
	private String a = "a";
	
	private void test() {
		System.out.println("MyUtil 테스트중입니다.");
	}
	
	
	/*
			내부 클래스 안에서 바깥에 자신을 포함하고 있는 클래스의
			멤버(필드, 메소드)는 자유롭게 자기것처럼 접근해서 사용할 수 있다.
			이런 편리함 때문에 android프로그래밍 할 때 종종 사용된다. 
			웹프로그래밍엔 이런 구조가 없다. 앱에는 있당!
	 */
	public class User{
		public void doSomething() {
			
			String a = "inner의 a";
			
			//바깥에 자신을 포함하고 있는 객체의 참조값을 가리키는 방법
			//바깥클래스명.this이다. 
			System.out.println(MyUtil.this.owner);
			MyUtil.this.test();
			
			//User클래스의 동일한 이름의 필드와 메소드가  없다면 MyUtil.this생략가능
			System.out.println(owner); //바깥의 owner을 의미
			test(); //바깥의 test를 의미
			
			//두 a가 무엇인지 확인하기
			System.out.println(a); //inner의 a를 의미
			System.out.println(MyUtil.this.a); //바깥의 a를 의미 
			
			//아래의 타입을 확인해보세요.
			MyUtil m= MyUtil.this;
			User u=this;
			System.out.println(m);
			System.out.println(u);
			
			/*
			doSomething 호출 시 실행결과
			김구라
			MyUtil 테스트중입니다.
			김구라
			MyUtil 테스트중입니다.
			inner의 a
			a
			test.mypac.MyUtil@15db9742
			test.mypac.MyUtil$User@6d06d69c

			*/
		}
	}

}
