package array.basic;
/**
 * �迭��  for ���������� ����
 * ---------------------------------
 * �迭�� for������ �׻� ���� ���Ǵ� �����̹Ƿ�
 * �� ������ ����� �ɼ��ϰ� �ٷ� �� �־�� �Ѵ�.
 * ---------------------------------
 * 10ĭ¥�� int �迭 ������ �����ϰ�
 * for �������� �ʱ�ȭ ����
 * for �������� ���
 * @author win10
 *
 */
public class ArrayAndFor {

	public static void main(String[] args) {
	//1.���� : int �迭 ���� ���� ����
		int[]  numbers;
		int summary;
	//2.�ʱ�ȭ : �迭 ���������� Ÿ���� 
	//		     �⺻�� 8������ �ƴϹǷ�
	//		   new�� �ʱ�ȭ ����
		numbers = new int[10];
		summary = 0;
	//3.���
	//(1) 1~10���� ���� �Ҵ� : for ���� ���
	for(int idx = 0; idx < numbers.length;idx++) {
		numbers[idx] = idx  + 1;
	}
	//(2)�Ҵ��� ���� ��� : for����
	for(int idx = 0; idx < numbers.length;idx++) {
		System.out.printf("numbers[%d]=%d%n",idx,numbers[idx]);
		}
	//(3)�Ҵ��� ���� ��� foreach����
	System.out.println("==========================");
	for(int number : numbers) {
		System.out.printf("number=%d%n",number);
	}
	//(4)��� ������Ʈ�� ���� ���
	System.out.println("==������ ����==");
	for(int number : numbers) {
		summary += number;
	}System.out.printf("������ ����(summary):%d%n",summary);
	}
}
