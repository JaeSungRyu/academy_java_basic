package practice.methods;
/**
 * VarietyMethods Ŭ������ �׽�Ʈ�ϴ� Ŭ����
 * @author win10
 *
 */
public class MethodsTest {

	public static void main(String[] args) {
		//1.����
		VarietyMethods methods;
		
		//2.�ʱ�ȭ
		methods = new VarietyMethods();
		
		//3.���
		methods.sayHello();
		methods.maxims("��ũ���׽�","�� �ڽ��� �˶�");
		
		
		methods.birthYearMonth("Į���� ������",1998,12);
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
