package practice.methods;

public class DefineMethods {

	// 1.
	public void printTenTimes(int input) {
		for (int idx = 0; idx < 11; idx++)
			input += 10;
		System.out.println(input);
		
	}

	// 2.
	public void printSomebodyMessage(String message, String name) {
		System.out.printf("[%s]�� �޼��� : [%s]%n", name, message);
	
	}

	// 3.
	public void printMessage(String message) {
		System.out.println(message);
		
	}

	// 4.
	public String returnOriginMessage(String message) {
		return message;
		
	}

	// 5.
	public int addTen(int input) {
		return input + 10;
		
	}

	// 6.
	public int subtractTen(int input) {
		return input - 10;
		
	}

	// 7.
	public int makeDouble(int input) {
		return input * 2;
		
	}

	// 8.
	public double subtractFivePointFive(double input) {
		return input - 5.5;
		
	}

	// 9.
	public String makeFullName(String name, String surname) {
		return surname + name;
		
	}

	// 10.
	public int add(int x, int y) {
		return x + y;
		
	}

	// 11.
	public double add(double x, double y) {
		return x + y;
		
	}

	// 12.
	public void printManyTimes(String message, int input) {
		for (int idx = 0; idx < input; idx++) {
			System.out.println(message);
			
		}
	}

	// 13.��Ģ������ ��ȣ(+-*/)�� �Էµ� �����ڴ� ���ڿ��� �ǿ�����
	//(x,y)�� ������
	//�Է¹޾� ��ȣ�� ���� ������ �����ϰ� �������� ����ϴ� �޼ҵ�
	public void calCulate(int x,int y,String cal) {
		if(cal == "+") {
			System.out.println(x+cal+y+"="+(x+y));
		}else if(cal == "-") {
			System.out.println(x+cal+y+"="+(x-y));			
		}else if(cal == "*") {
			System.out.println(x+cal+y+"="+(x*y));			
		}else {
			System.out.println(x+cal+y+"="+(x/y));			
		}
	}
	
	// 14.13�� �޼ҵ带 �������� double Ÿ������ �����ϴ� �޼ҵ�� �����Ͻÿ�
	public double calCulate2(double x,double y,String cal) {
	    double result = 0.0;
		if (cal == "+") {
			result = x+y;
		}else if(cal == "-"){
			result = x-y;
		}else if(cal == "*"){
			result = x*y;
		}else if(cal == "/"){
			result = x/y;
		}
		return result;
	}
	
	// 15.
	public boolean isEven(int input){
		boolean result;
	if(input%2 == 0){
	result = true;
		}else{
		result = false;
	    }
	return result;
	}

	// 2-1
	public int absolute(int x) {
		if (x < 0) {
			x = -x;
		}else{
			x = x;
		}
		return x;
	}

	// 2-2
	public void findMultiple(int x) {
		int y = 0;
		int result = 0;
		while (true) {
			y++;
			result = x * y;
			if(result<100) {
				System.out.printf("%d x %d = %d%n",x,y,result);
			}else {
				break;
			}
		}
	}

	
	// 2-3
	public String decideSign(int x) {
		String result;	
		if (x < 0) {
			result = "��������";
		} else if (x == 0) {
			result = "���� 0";
		} else {
			result = "��������";
		}
		return result + "\n";
	}
	

	//2-4 ���ڿ��� ������ �Ű������� �Է¹޾� repeatũ���� ���ڿ� 
	//�迭�� ����� ������ �迭��
	//���Ҹ��� message�� �����ϰ� 
	//�迭�� ������ ����ϴ� �޼ҵ� repeat�� �ۼ��Ͻÿ�
	public void repeated(String message,int repeat) {
		String str[] = new String[repeat];		
		for (int idx = 0; idx < str.length; idx++) {
		    str[idx] = message;
			System.out.printf("�޽��� : %s%n",message);
		}
	}
	//2-5
	public double calcircle(int r) {
		double pi = 3.14;
		return pi*(double)r*(double)r;
	
	}
	
	//2-6
	/**
	����(x)�� �Ű������� �Է� �޾�
	�Է� �� ���� ��� �� 100 ������ ����
	�迭�� �����ϰ�
	�� �迭�� �����ϴ� �޼ҵ�
	makeMultipleNums�� �����Ͻÿ�.
	*/
	public int[] makeMultipleNums(int x) {
		int length = 100;
		int [] numbers = new int[length];
		for (int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = x * idx;
		}
		return numbers;	
	}
}