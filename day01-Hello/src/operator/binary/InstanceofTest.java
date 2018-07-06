package operator.binary;
/**
 * ��ü�� Ÿ���� �����ϴ� ������
 * instanceof�� �׽�Ʈ�ϴ� Ŭ����
 * -------------------------------------------
 * object instance class
 * �� ���� object �� class Ÿ���� ��ü�̸� true
 * �� ���� ���� false�� ����� ���� ������
 * -------------------------------------------
 * @author win10
 *
 */
public class InstanceofTest {

	public static void main(String[] args) {
		//1.���� 2.�ʱ�ȭ
		String name = "���缺";
		boolean result;
		//3.���
		result = (name instanceof String);
		System.out.printf("name = %s�̸� %n"
				+"%s(��)�� String Ÿ���̴�? %b%n",name,name,result);
		
		//1.���� : StringBuffer = > ���ڿ��� ������ �� �ִ� 
		//		 String�� ���������� �ٸ� Ÿ��
		StringBuffer surname;
		
		//2.�ʱ�ȭ
		surname = new StringBuffer("Yoo");
		
		//3.���
		result = ((Object)surname instanceof String);
		System.out.printf("surname = %s�̸� %n"
				+"%s(��)�� String Ÿ���̴�? %b%n",surname,surname,result);
	}

}





