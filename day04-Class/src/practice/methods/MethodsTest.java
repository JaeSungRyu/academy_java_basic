package practice.methods;
/**
 * VarietyMethods 클래스를 테스트하는 클래스
 * @author win10
 *
 */
public class MethodsTest {

	public static void main(String[] args) {
		//1.선언
		VarietyMethods methods;
		
		//2.초기화
		methods = new VarietyMethods();
		
		//3.사용
		methods.sayHello();
		methods.maxims("소크라테스","너 자신을 알라");
		
		
		methods.birthYearMonth("칼리앙 음바페",1998,12);
		System.out.println("===================");		
		methods.printNineNineTable(8);
		System.out.println("===================");	
		
		int[] stages = new int[4];
		stages[0] = 2;
		stages[1] = 8;
		stages[2] = 9;
		stages[3] = 11;
//		methods.printNineNineTableArray(stage);
		
		double cel = methods.fahToCel(100.0);
		System.out.printf("cel = %5.1f F",cel);
		
		methods.printNineNineTable(8);
		System.out.println("===================");

		int min = methods.min(100,-100);
		System.out.printf("min = %d%n",min);
		System.out.println("===================");
		
		int max = methods.min(100,-100);
		System.out.printf("max = %d%n",max);
		System.out.println("===================");

	}

}
