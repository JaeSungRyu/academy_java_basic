package array.init;
/**
 * �迭�� �ʱ�ȭ �� ��,
 * �� �迭 ������ �ʱ�ȭ ���� �˾ƺ��� Ŭ����
 * 
 * int Ÿ���� �����ϴ� �迭�� �ϳ� �����ϰ�
 * �ʱ�ȭ �� �� �迭 ������ �ʱⰪ�� Ȯ���غ���
 * @author win10
 *
 */
public class IntArrayInit {

	public static void main(String[] args) {
		//1.����
		int[] numbers;
		
		//2.�ʱ�ȭ
		numbers = new int[10];
		
		//3.��� : �ʱ�ȭ ���� �� ���� �� Ȯ��
		for (int idx = 0; idx < numbers.length; idx++) {
			System.out.printf("number = %d%n",idx);
			
		}
		
	}

}



