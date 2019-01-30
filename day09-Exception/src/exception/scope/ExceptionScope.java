package exception.scope;

/**
 * level1() -> level2() -> level3() 
 * �� ������ �޼ҵ� ȣ���� �Ͼ�� Ŭ����
 * 
 * level3() �޼ҵ� �ȿ� 0���� ������ ��Ȳ��
 * �߻��� �� �ִ� ������ �����Ѵ�.
 * 
 * level3() ���� �߻��� ���ܰ� �޼ҵ� ȣ����
 * �ݴ������ ���ĵǴ� ���� Ȯ��
 * 
 * @author PC38206
 *
 */
public class ExceptionScope {
	
	public void level3(int input) {
		int current = 1;
		
		System.out.println("== level3 �� ���۵Ǿ����ϴ�. ==");
		current = current / input;
		System.out.println("== level3 �� ����Ǿ����ϴ�. ==");
	}
	
	public void level2() {
		System.out.println("== level2 �� ���۵Ǿ����ϴ�. ==");
		try {
			level3(0);
			
		} catch (ArithmeticException e) {
			System.err.println("���� �߻�! : " +  e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("== level2 �� ����Ǿ����ϴ�. ==");
	}
	
	public void level1() {
		System.out.println("== level1 �� ���۵Ǿ����ϴ�. ==");
//		try {
			level2();
			
//		} catch (ArithmeticException e) {
//			System.err.println("���� �߻�! : " +  e.getMessage());
//			e.printStackTrace();
//			
//		}
		System.out.println("== level1 �� ����Ǿ����ϴ�. ==");
	}
	

}