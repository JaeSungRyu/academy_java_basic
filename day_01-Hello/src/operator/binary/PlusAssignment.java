package operator.binary;
/**
 * ���� ���� ��������
 * +=�����ڸ� �׽�Ʈ
 * @author win10
 *
 */
public class PlusAssignment {

	public static void main(String[] args) {
		//1.���� 2.�ʱ�ȭ
		int num = 0;
		//3.���
		System.out.println("�ʱ� num �� : " + num);
		
		num += 1;
		System.out.println("num += 1 �� ������: " + num);
		
		num = num+1;
		System.out.println("num = num+1 �� ������ : " + num);
		num += num+1;
		System.out.println("num += num+1 �� ������ : " + num);
		num *= num*num;
		System.out.println("num *= num*num �� ������ : " + num);
		
	}

}






