package exception.scope;

public class ExceptionScopeTest {

	public static void main(String[] args) {
		// 1. ����
		ExceptionScope demo;
		
		// 2. �ʱ�ȭ
		demo = new ExceptionScope();
		
		
		// 3. ���
		System.out.println("==== main �޼ҵ尡 ���۵Ǿ����ϴ�. ====");
		
		demo.level1();
		
		System.out.println("==== main �޼ҵ尡 ����Ǿ����ϴ�. ====");

	}

}

