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
		System.out.printf("[%s]의 메세지 : [%s]%n", name, message);
	
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

	// 13.사칙연산의 기호(+-*/)가 입력될 연산자는 문자열로 피연산자
	//(x,y)는 정수로
	//입력받아 기호에 따라 연산을 수행하고 연산결과를 출력하는 메소드
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
	
	// 14.13번 메소드를 연산결과를 double 타입으로 리턴하는 메소드로 변경하시오
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
			result = "음의정수";
		} else if (x == 0) {
			result = "정수 0";
		} else {
			result = "양의정수";
		}
		return result + "\n";
	}
	

	//2-4 문자열와 정수를 매개변수로 입력받아 repeat크기의 문자열 
	//배열을 만들고 생성된 배열의
	//원소마다 message를 저장하고 
	//배열의 내용을 출력하는 메소드 repeat를 작성하시오
	public void repeated(String message,int repeat) {
		String str[] = new String[repeat];		
		for (int idx = 0; idx < str.length; idx++) {
		    str[idx] = message;
			System.out.printf("메시지 : %s%n",message);
		}
	}
	//2-5
	public double calcircle(int r) {
		double pi = 3.14;
		return pi*(double)r*(double)r;
	
	}
	
	//2-6
	/**
	정수(x)를 매개변수로 입력 받아
	입력 된 값의 배수 중 100 이하의 수를
	배열에 저장하고
	그 배열을 리턴하는 메소드
	makeMultipleNums를 저장하시오.
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