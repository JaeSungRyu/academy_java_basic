package type.primitive;
/**
 * ������ Ÿ���� ���� ��ǥ Ÿ���� int
 * Ÿ���� �׽�Ʈ�ϴ� Ŭ�����̴�.
 * @author win10
 *
 */
public class IntegerTest {

	public static void main(String[] args) {
		//1.����
		//�� �ٿ� ������ �����ϸ� �ʱ�ȭ �ϴ� ����
		//������ �����ϴ� ���� ������
		int num1 = 5,num2 = 28;
		//�� �ٿ� ���� ������ �����ϴ°��� ����
		int num3,num4,num5; //��������� ������ �Ǿ����� ������ �������� �˷���(warning)
		
		//2.�ʱ�ȭ
		//num3,num4,num5�� �ʱ�ȭ
		//num1,num2�� ���ؼ��� ���
		num3 = num1 * num2; //����
		num4 = num2 / num1; //������
		num5 = 25 / num1;   //������
		
		//3.��� : ������ ���� ���
		System.out.println("5 * 28 = " + num3);
		System.out.println("28 / 5 = " + num4);
		System.out.println("25 / 5 = " + num5);
		
	}

}
