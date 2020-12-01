package test.main;

import test.mypac.Calculator;

public class MainClass06 {
	public static void main(String[] args) {
		
		//()->{}는 이런식으로도 작성할 수 있다. 
		Calculator add=(double a, double b)->{
			return a+b;
		};
		
		//위를 간략히 표현하면 아래와 같이 표현된다. 아래와 같은 방법을 람다식이라고 한다. 
		Calculator add2 = (a,b)->a+b;
		useCalculator(add);
		useCalculator(add2);
		
		//응용해보기
		Calculator sub=(a,b)->a-b;
		Calculator multi=(a,b)->a*b;
		Calculator divide=(a,b)->a/b;
		
		useCalculator(sub);
		useCalculator(multi);
		useCalculator(divide);
		
	}
	
	public static void useCalculator(Calculator cal) {
		double result = cal.exec(10, 20);
		System.out.println("result:"+result);
	}
}
