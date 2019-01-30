package practice.methods;

/**
 * �޼ҵ� �ۼ� �ǽ� Ŭ����
 * 
 * @author PC38206
 *
 */
public class VarietyMethods {
	
	/**
	 * ȭ�鿡 hello, world! �� ����ϴ� �޼ҵ�
	 */
	public void sayHello() {
		System.out.println("hello, world!");
	}
	
	/**
	 * �Ű������� 
	 * ������(���) �� �̸��� �Է�(name) �ް�
	 * �� ����� �� ������ ����(maxim)�� �Է� �޾�
	 * 
	 * OOO(��)�� ���ϱ� "....." ��� �Ͽ���.
	 * ��� ������ ����ϴ� �޼ҵ�
	 * maxims �� �����϶�
	 */
	public void maxims(String name, String maxim) {
		System.out.printf("%s (��)�� ���ϱ�%n"
				         + "\"%s\" ��� �Ͽ���.%n"
				          , name, maxim);
	}
	
	/**
	 * � ����� �̸�, ����, ������� �Ű������� �Է¹޾�
	 * 
	 * OOO�� XXXX�� XX�� ���Դϴ�.
	 * 
	 * ��� �������� ����ϴ� �޼ҵ� 
	 * birthYearMonth ��� �޼ҵ带 ������
	 * @param name : String
	 * @param year : int
	 * @param month : int
	 */
	public void birthYearMonth(String name, int year, int month) {
		System.out.printf("%s (��)�� %4d�� %2d�� ���Դϴ�.%n", name, year, month);
	}
	
	/**
	 * ����� ���� ���ڸ� �Է¹޾�
	 * �ش� ���� �������� ����ϴ� �޼ҵ�
	 * 
	 * ����� ù �ٿ� X �� �̶�� ������ ���
	 * 
	 * printNineNineTable �� ������
	 * @param stage : int
	 */
	public void printNineNineTable(int stage) {
		System.out.printf("%2d ��%n", stage);
		
		for (int times = 1; times < 10; times++) {
			System.out.printf("%2d x %2d = %2d%n", stage, times, stage * times);
		}
	}
	
	
	/**
	 * ����� ���� ���ڸ� ������ �ִ� int �迭�� 
	 * �Ű������� �Է¹޾�
	 * �Էµ� �迭�� ������ �� ���ڿ� ����
	 * �������� ����ϴ� �޼ҵ�
	 * printNineNineTableArray �� ������
	 * @param stages : int �迭
	 */
	public void printNineNineTableArray(int[] stages) {
		for (int stage: stages) {
			System.out.printf("%2d ��%n", stage);
			
			for (int times = 1; times < 10; times++) {
				System.out.printf("%2d x %2d = %2d%n"
						, stage, times, stage * times);
				
			}
			System.out.println();
		}
	}
	
	
	/**
	 * �Էµ� ȭ���µ��� �����µ��� ��ȯ�Ͽ� 
	 * ��ȯ�� �����µ��� �����ϴ� �޼ҵ�
	 * fahToCel �� ������
	 * 
	 * ��ȯ ���� : 5 / 9 * (F - 32)
	 * 
	 * @param fah : double : ��ȯ�� ȭ�� �µ� ��
	 * @return ��ȯ�� ���� �µ� ��
	 */
	public double fahToCel(double fah) {
		return 5.0 / 9.0 * (fah - 32);
	}
	
	
	/**
	 * Ű(cm), ������(kg)�� �Ű������� �Է¹޾�
	 * BMI ������ ����Ͽ� �񸸵� ���� ����� �����ϴ� �޼ҵ�
	 * calcBmi �� ������
	 * 
	 *   ������(kg) / Ű(m)�� ����
	 *    
	 *   15.0�̸�               ������ ��ü��
	 *   15.0�̻� 18.5�̸�      ��ü��
	 *   18.5�̻� 23.0�̸�      ����
	 *   23.0�̻� 27.5����      ��ü��
	 *   27.5�ʰ� 40.0����      ��
	 *   40.0�ʰ�               ������ ��
	 * 
	 * @param height : double
	 * @param weight : double
	 * @return �񸸵� ���� ��� ���ڿ�
	 */
	public String calcBmi(double height, double weight) {
		String result;
		double bmi = (double)weight / ((height * 0.01) * (height * 0.01));
		
		if (bmi > 40.0) {
			result = "������ ��";
		} else if (bmi > 27.5) {
			result = "��";			
		} else if (bmi >= 23.0) {
			result = "��ü��";
		} else if (bmi >= 18.5) {
			result = "����";			
		} else if (bmi >= 15.0) {
			result = "��ü��";			
		} else {
			result = "������ ��ü��";
		}
		
		return result + "\n";
		
	}
	
	/**
	 * �Էµ� �� ���� �߿��� ���� ���� ã�� �����ϴ� �޼ҵ�
	 * min �� ������
	 * @param input1
	 * @param input2
	 * @return : �� �� ���� ����
	 */
	public int min(int input1, int input2) {
		int min;
		
		if (input1 < input2) {
			min = input1;
		} else {
			min = input2;
		}
		
		return min;
	}
	
	/**
	 * �Էµ� �� ���� �߿��� ū ���� ã�� �����ϴ� �޼ҵ�
	 * max �� ������
	 * @param input1 : int
	 * @param input2 : int
	 * @return : �� �� ū ����
	 */
	public int max(int input1, int input2) {
		int max;
		
		if (input1 > input2) {
			max = input1;
		} else {
			max = input2;
		}
		
		return max;
	}
	
	/**
	 * ������ ����� int �迭�� �Ű������� �Է¹޾�
	 * �� �迭�� �� ������ ���� ���Ͽ� �����ϴ� �޼ҵ�
	 * sumOfArray �� ������
	 * @param numbers : int �迭
	 * @return numbers �迭�� �� ������ ��
	 */
	public int sumOfArray(int[] numbers) {
		int sum = 0;
		
		for (int num: numbers) {
			sum += num;
		}
		
		return sum;
	}
	
	
	
	/**
	 * ������ ����� int �迭�� �Ű������� �Է¹޾�
	 * �� �迭�� �� ���ҵ��� ����� ���Ͽ� �����ϴ� �޼ҵ�
	 * avgOfArray �� ������
	 * @param numbers
	 * @return numbers �迭�� �� ������ ��� 
	 */
	public double avgOfArray(int[] numbers) {
		double avg = 0.0;
		int sum = 0;
		
		for (int num: numbers) {
			sum += num;
		}
		
		avg = (double)sum / numbers.length;
		
		return avg;
	}
	
	
	
	
	/**
	 * char Ÿ���� �����ڿ� �� ���� ������ 
	 * �Ű������� �Է¹޾�
	 * 
	 * �Էµ� �����ڰ� '+' �� ����
	 * �� ������ ���� ���Ͽ� ������ ����� 
	 * 
	 * ����ϴ� �޼ҵ� adder �� ������
	 * ��� ���� ��) 10 + 20 = 30
	 * @param op : char
	 * @param x : int
	 * @param y : int
	 */	
	public void adder(char op, int x, int y) {
		if (op == '+') {
			System.out.printf("%d %c %d = %d%n", x, op, y, x + y );
		} else {
			System.out.println("������ �Է��� �߸��Ǿ����ϴ�.");
		}
		
	}
}










