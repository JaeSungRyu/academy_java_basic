package type.casting;
/**
 * ������ ������ ���̿�
 * �� ��ȯ(type casting)��
 * �׽�Ʈ�ϴ� Ŭ�����̴�.
 * �ڵ�����ȯ : ���� �ڷ��� -> ū �ڷ���
 * ���θ�� : �� ū �ڷ������� �ڵ� ����ȯ / (������ ���ս�)
 * ���� 	: �� ���� �ڷ������� ���� ����ȯ / ������ �ս� ���ɼ� ����.
 * @author win10
 *
 */
public class TypeCastingTest {

	public static void main(String[] args) {
		//1.����
		double pi = 3.1415926542154587;
		int number = 100;
		int result;
		//2.�ʱ�ȭ
		result = number + (int)pi;  //(����ȯŸ��)�ǿ�����
		//3.���
		System.out.println("double pi = " + pi);
		System.out.println("int number= " + number);
		System.out.println("int result= " + result);
	}

}
