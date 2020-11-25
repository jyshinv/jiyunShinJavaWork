package test.mypac;

public class FruitBox<T>{
	
//Generic Class를 만드는 이유?
//메인메소드에서 참조 데이터 타입만 던져주면
//자동으로 그 객체타입에 맞게 클래스가 구성되었으면 좋겠다면?
//Generic Class는 즉, 아직 결정되지 않은 타입이다!
	
	
	//필드의 data type이 Generic class에 의해서 정해진다!
	public T item;
	
	
	
	public void setItem(T item) {
		this.item=item;
	}
	
	
	
	public T getItem() {
		return this.item;
	}
	
}
