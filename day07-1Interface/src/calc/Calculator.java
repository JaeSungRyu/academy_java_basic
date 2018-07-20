package calc;

/**
 * static ������ non-static���� ������ �ʱ�ȭ ������ ���� ȣ�� ������ �׽�Ʈ �ϴ� Ŭ����
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
	//static �޼ҵ� ����
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
