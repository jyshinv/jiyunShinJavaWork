package test.main;

import test.mypac.*;

public class MainClass01 {
	
	public static void main(String[] args) {
		//제너릭 클래스 사용해보기 
		//왼쪽 <>안 내용은 생략 불가! 오른쪽 <> 안 내용은 생략 가능!
		FruitBox<Apple> appleBox = new FruitBox<Apple>(); //<>안에 클래스명 Apple을 넣어준다. --> Apple 객체 생성 후 appleBox에 참조값 대입
		FruitBox<Banana> bananaBox = new FruitBox<Banana>();//<>안에 클래스명 Banana을 넣어준다. --> Banana 객체 생성 후 bananaBox에 참조값 대입
		FruitBox<Orange> orangeBox = new FruitBox<Orange>(); //<>안에 클래스명 Orange을 넣어준다. --> Orange 객체 생성 후  orangeBox에 참조값 대입 
		FruitBox<Integer> intBox = new FruitBox<Integer>(); //<>안에 클래스명 Integer을 넣어준다. --> Integer 객체 생성 후  intBox에 참조값 대입 
		
		//setItem() 메소드에 전달해야하는 type이 Generic class에 의해서 정해진다.
		appleBox.setItem(new Apple()); //참조값을 인자로 넘겨준다.
		bananaBox.setItem(new Banana()); //참조값을 인자로 넘겨준다.
		orangeBox.setItem(new Orange()); //참조값을 인자로 넘겨준다.
		intBox.setItem(3); //정수를 인자로 넘겨준다.

		//getItem() 메소드가 리턴해주는 type이 Generic class에 의해서 정해진다.
		//필드의 data type이 Generic class에 의해서 정해진다!
		System.out.println(appleBox.getItem()); //참조값이 반환된다. --> test.mypac.Apple@15db9742 
		System.out.println(bananaBox.getItem()); //참조값이 반환된다. --> test.mypac.Banana@6d06d69c
		System.out.println(orangeBox.getItem()); //참조값이 반환된다. --> test.mypac.Orange@7852e922
		System.out.println(intBox.getItem()); //정수가 반환된다. --> 3
		

		
		
		
	}
	
}
