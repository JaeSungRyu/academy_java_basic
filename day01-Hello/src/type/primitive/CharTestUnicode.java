package type.primitive;
/**
 * ���� 1���� �����ϴ� Ÿ���� char ������
 * ���ڸ� �����ڵ� ǥ������� �����Ͽ�
 * �׽�Ʈ�ϴ� Ŭ�����̴�.
 * @author win10
 *
 */


public class CharTestUnicode {

	public static void main(String[] args) {
		//1.����
		char han = '\ud55c';  // ��
		char gul = '\uae00';  // ��
		//2.�ʱ�ȭ
		
		//3.���
		System.out.println(han + gul);
		System.out.println(han + "" + gul);
		System.out.println(han);
		System.out.println(gul);
		
	}

}
