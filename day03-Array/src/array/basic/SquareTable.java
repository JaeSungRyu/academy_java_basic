package array.basic;
/**
 * 1~10������ ������ ���ҷ� ������
 * �迭�� ����Ͽ� ����ǥ�� ����غ��� Ŭ����
 * 
 * ��½� foreach Ȱ���Ͽ� ���
 * * @author win10
 *
 */
public class SquareTable {

	public static void main(String[] args) {
		//1.����
		int[] numbers;
		//2.�ʱ�ȭ
		numbers = new int[10];
		//3.���
		
		//numbers �迭�� 1~10���� ���� �Ҵ�
		for (int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = idx + 1;
			
		
			//(2)foreach�� ����ǥ ���
			for(int number : numbers) {
				System.out.printf("%4d x %4d = %4d%n",number,number,number*number); 	
			}
	   	}
	}
}
