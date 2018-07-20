package calc;

import static calc.Calculator.*;

public class CalculatorTest {

	public static void main(String[] args) {
		// 1.선언
		Calculator calc;
		// 2.초기화 : Calculator() 클래스의 기본생성자가
		// 모든 생성자 정의를 생략하여 기본생성자가 자동 제공됨
		calc = new Calculator();
		// non-static영역의 명시적 초기화 : new 사용

		// 3.사용
		// Calculator 클래스의 add()메소드 사용
		// (1)static -> non-static : 다른 클래스
		int addResult = calc.add(100, 200);
		System.out.printf("100 + 200 = %d%n", addResult);

		// 이 클래스에 있는add를 사용
		// (2)static -> non-static : 같은 클래스
		CalculatorTest cTest = new CalculatorTest();
		cTest.add(10, 20);

		// 동일 클래스안의 static영역끼리 호출 :
		// ===>객체없이 바로 이름만으로 사용가능
		// (3)static - > static 같은 클래스 사용
		subtract(10, 20);

		// 같은 클래스인 static 영역끼리 호출 :
		// ==> 앞에 클래스 이름을 명시
		// (4)static - > static : 다른클래스
		Calculator.subtract(20.0, 45.0);
		
		Calculator.add(10.0, 20.0);
		
		//(5)static import를 사용하여 
		//	  마치 내가 가지고 있는 메소드처럼 호출가능
		Calculator.multiply(10.0, 20.0);
		multiply(10.0, 20.0);
		
		
	} // end main

	// add메소드 정의 : non-static
	public int add(int x, int y) {
		System.out.printf("%d + %d = %d%n", x, y, x + y);
		return x + y;
	}

	public static int subtract(int x, int y) {
		System.out.printf("%d - %d = %d%n", x, y, x - y);
		return x - y;
	}

}