package test.mypac;

//메소드를 하나만 정의할 수 있도록 강제하는 어노테이션 이 어노테이션을 작성하고 메소드를 2개 이상 작성하면 에러가 난다. 
@FunctionalInterface
public interface Calculator {
	//인자로 전달되는 두 숫자를 연산해서 결과 값을 리턴해주는 메소드
	public double exec(double a, double b);

}
