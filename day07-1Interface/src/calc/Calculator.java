package calc;

/**
 * static 영역과 non-static영역 사이의 초기화 시점에 따른 호출 방향을 테스트 하는 클래스
 * 
 * @author win10
 *
 */
public class Calculator {
	
	//non-static
	// add
	public int add(int x, int y) {
		return x + y; 
	}

	// subtract
	public int subtract(int x, int y) {
		return x - y;
	}

	// multiple
	public int multiply(int x, int y) {
		return x * y;
		
	}
	// divide
	public int divide(int x, int y) {
		return x / y;
	}

	// modular
	public int modular(int x, int y) {
		return x % y;

	}
	//static 메소드 선언
	public static double add(double x, double y) {
		return x + y;
	}
	public static double subtract(double x, double y) {
		return x - y;
	}	
	public static double multiply(double x, double y) {
		return x * y;
	}	
}
