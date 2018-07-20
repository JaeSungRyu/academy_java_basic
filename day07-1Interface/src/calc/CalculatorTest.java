package calc;

import static calc.Calculator.*;

public class CalculatorTest {

	public static void main(String[] args) {
		// 1.����
		Calculator calc;
		// 2.�ʱ�ȭ : Calculator() Ŭ������ �⺻�����ڰ�
		// ��� ������ ���Ǹ� �����Ͽ� �⺻�����ڰ� �ڵ� ������
		calc = new Calculator();
		// non-static������ ����� �ʱ�ȭ : new ���

		// 3.���
		// Calculator Ŭ������ add()�޼ҵ� ���
		// (1)static -> non-static : �ٸ� Ŭ����
		int addResult = calc.add(100, 200);
		System.out.printf("100 + 200 = %d%n", addResult);

		// �� Ŭ������ �ִ�add�� ���
		// (2)static -> non-static : ���� Ŭ����
		CalculatorTest cTest = new CalculatorTest();
		cTest.add(10, 20);

		// ���� Ŭ�������� static�������� ȣ�� :
		// ===>��ü���� �ٷ� �̸������� ��밡��
		// (3)static - > static ���� Ŭ���� ���
		subtract(10, 20);

		// ���� Ŭ������ static �������� ȣ�� :
		// ==> �տ� Ŭ���� �̸��� ���
		// (4)static - > static : �ٸ�Ŭ����
		Calculator.subtract(20.0, 45.0);
		
		Calculator.add(10.0, 20.0);
		
		//(5)static import�� ����Ͽ� 
		//	  ��ġ ���� ������ �ִ� �޼ҵ�ó�� ȣ�Ⱑ��
		Calculator.multiply(10.0, 20.0);
		multiply(10.0, 20.0);
		
		
	} // end main

	// add�޼ҵ� ���� : non-static
	public int add(int x, int y) {
		System.out.printf("%d + %d = %d%n", x, y, x + y);
		return x + y;
	}

	public static int subtract(int x, int y) {
		System.out.printf("%d - %d = %d%n", x, y, x - y);
		return x - y;
	}

}