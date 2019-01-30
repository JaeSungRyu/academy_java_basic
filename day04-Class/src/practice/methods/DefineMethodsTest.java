package practice.methods;

import java.lang.reflect.Method;

public class DefineMethodsTest {

	public static void main(String[] args) {
		DefineMethods methods;
		methods = new DefineMethods();
		//1.
		methods.printTenTimes(10);
		System.out.println("===========================");
		
		//2.
		methods.printSomebodyMessage("안녕하세요", "유재성");
		System.out.println("===========================");
		
		//3.
		methods.printMessage("안녕하세요");
		System.out.println("===========================");
		
		//4.
		String message = methods.returnOriginMessage("유재성");
		System.out.println(message);
		System.out.println("===========================");
		
		//5.
		int addTenResult = methods.addTen(20);
		System.out.println(addTenResult);
		System.out.println("===========================");
		
		//6.
		int subtracTenResult = methods.subtractTen(20);
		System.out.println(subtracTenResult);
		System.out.println("===========================");
		
		//7.
		int makeDoubleResult = methods.makeDouble(20);
		System.out.println(makeDoubleResult);
		System.out.println("===========================");
		
		//8.
		double subtractFivePointFiveResult = methods.subtractFivePointFive(20.2);
		System.out.println(subtractFivePointFiveResult);
		System.out.println("===========================");
		
		//9.
		String makeFullNameResult = methods.makeFullName("재성","유");
		System.out.println(makeFullNameResult);
		System.out.println("===========================");
		
		//10.
		int intAddResult = methods.add(10, 20);
		System.out.println(intAddResult);
		System.out.println("===========================");
		
		//11.
		double doubleAddResult = methods.add(20.2, 30.3);
		System.out.println(doubleAddResult);
		System.out.println("===========================");
		
		//12.
		methods.printManyTimes("안녕", 3);
		System.out.println("===========================");
		
		//13.
		methods.calCulate(20,10,"-");
		System.out.println("===========================");
		
		//14.
		double calCulate2Result = methods.calCulate2(10, 20, "+");
		System.out.println(calCulate2Result);
		System.out.println("===========================");
		
		//15.
		boolean isEvenResult = methods.isEven(122);
		System.out.println(isEvenResult);	
		System.out.println("===========================");
		
		//2-1
		int absoluteResult = methods.absolute(-11);
		System.out.println(absoluteResult);
		System.out.println("===========================");
		
		//2-2
		methods.findMultiple(5);
		System.out.println("===========================");
		
		//2-3
		String decideSignResult = methods.decideSign(-2);
		System.out.println(decideSignResult);
		System.out.println("===========================");
		
		//2-4
		methods.repeated("스프라이트마싯다", 3);
		System.out.println("===========================");
		
		//2-5
		double calCircleResult = methods.calcircle(2);
		System.out.println(calCircleResult);
		System.out.println("===========================");
		
		//2-6
		int[] makeMultipleNumsResult = methods.makeMultipleNums(3);
		System.out.println(makeMultipleNumsResult);
		//모르겠습니다;
	}
		
}
