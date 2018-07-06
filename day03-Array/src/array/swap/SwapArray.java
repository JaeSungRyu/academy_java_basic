package array.swap;
/**
 * �� ������ ���� ���� �¹ٲٴ�
 * swap����� �����Ͽ�
 * �迭�� ������ ������ ���� Ŭ����
 * 
 * @author win10
 *
 */
public class SwapArray {

	public static void main(String[] args) {
		//1.���� 2.�ʱ�ȭ
		int[] numbers = {10, 20, 30, 40, 50, 60, 70
				        ,80, 90, 100, 110, 120}; 
	/***************************
	 * 	�迭�� ������ ������ ����
	 * **************************
	 * 1.��ü �迭�� ������ ��ȸ�� �ϸ�
	 *   �迭�� �ι� �������� ���� ��ȭ�� ����
	 *   
	 * 2.�迭�� ������ ������ ���ؼ���
	 * 	 ������ �ݸ� �۾��� �����ؾ� ��.
	 * 0         :       11  : length - 1
	 * 1         :       10
	 * 2         :        9
	 * 3         :        8
	 * 4         :        7
	 * 5         :        6
	 * 0~5������ �ε��� ���� (numbers.length / 2)����
	 * ���� ����
	 * 
	 * 0 < idx < numbers.length / 2
	 * �¹ٲ� ������ �μ��� : length -1 - idx
	 * 
	 */
		//3.
		for(int idx = 0; idx < numbers.length /2; idx++) {
			//swap�� ���� �ӽú���
			int temp;
			//���� ���� ���
			temp = numbers[idx];
			//���� ���� �� ����
			numbers[idx] = numbers[numbers.length - 1 - idx];
			//��� ��ʼҸ� ���� ĭ�� ����
			numbers[numbers.length - 1 - idx] = temp;
		}
			for(int number : numbers) {
				System.out.printf("%d \t",number);
				}
		}
}