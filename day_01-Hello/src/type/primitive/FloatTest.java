package type.primitive;
/**
 * �Ǽ��� Ÿ���� float,double Ÿ����
 * �׽�Ʈ�ϴ� Ŭ�����̴�.
 * @author win10
 *
 */
public class FloatTest {

	public static void main(String[] args) {
		//1.����
		float pi1;
		double pi2;
		
		//2.�ʱ�ȭ
		pi1 = 3.14f; //�Ǽ��� ǥ���� ���� ������ �⺻������double�� �ν�
					 //�׷��� float�� �Ǽ��ڿ� f�� �ٿ���
					 //f�� �Ⱥ��� �� ������ ���� ������ doubleŸ���� float���� ũ�⶧���� ���� ������
		pi2 = 3.14;
		
		//3.���
		System.out.println("float pi1 = " + pi1);
		System.out.println("double pi2 = " + pi2);
		System.out.println("======================");
		
		pi1 = 3.1415926536539304123F;
		pi2 = 3.1415926536539304123;
		
		System.out.println("float pi1 = " + pi1);
		System.out.println("double pi2 = " + pi2);
		
	}
	

}