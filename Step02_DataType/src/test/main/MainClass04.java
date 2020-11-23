package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main메소드가 시작 되었습니다.");
		
		/*
		 * 1. 각각의 점수를 지역변수 eng, kor, math 에 대입
		 * 영어점수 100
		 * 국어점수 100
		 * 수학점수 90
		 * */
		
		int eng = 100;
		int kor = 100;
		int math = 90;
		
		
		//2. eng, kor, math 세 점수의 합을 구해서 sum이라는 이름의 지역 변수에 담아 보세요.
		int sum = eng + kor + math;
		
		//3. eng, kor, math의 평균값을 구해서 avg라는 이름의 지역 변수에 담아보세요.
		double avg = sum/3;  			//sum과 3 둘다 int type => 연산 결과는 int type으로 나옴
		double realavg = sum/3.0;       //3을 실수로 만들어 주었다.
		double realavg2 = (double)sum/3; //sum을 실수로 만들어 주었다.
	
		//4. avg 안에 있는 값을 콘솔창에 출력해보세요.
		System.out.println(avg);
		System.out.println(realavg);
	
	
		/*
		 * int type과 int type을 연산하면 결과는 int type만 나온다. 만약 정확한 실수 값을 얻고 싶음 연산에 참여하는 데이터
		 * 중에 어느 하나가 실수 type이 되어야 실수 type이 결과로 나온다.
		 */


	}
}
