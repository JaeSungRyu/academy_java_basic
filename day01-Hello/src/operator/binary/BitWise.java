package operator.binary;
/**
 * ��Ʈ�����ڸ� �����ϴ� ���׿����ڸ� �׽�Ʈ�ϴ� Ŭ���� 
 * &,|,^
 * @author win10
 * 
 */
public class BitWise {

	public static void main(String[] args) {
		//1. ���� ���� 2.�ʱ�ȭ
		//0x �� �����ϸ� 16������ ���ڰ��� ǥ����
		//0~9,a~f�� ���� ǥ���ϴ� ���
		int a = 0x1f05;
		int b = 0x31a1;
		
		//3.��� : �� ���� ���� ��Ʈ���� ����
		System.out.printf("%x & %x = %x%n",a,b,a&b);
		System.out.printf("%x | %x = %x%n",a,b,a|b);
		System.out.printf("%x ^ %x = %x%n",a,b,a^b);
		System.out.printf("~%x = %x%n",a,~a);
		
	}

}
