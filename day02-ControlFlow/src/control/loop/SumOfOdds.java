package control.loop;
/**
 * 1~100������ Ȧ���� ���� ���ϴ� Ŭ����
 * 
 * while ���� Ȱ��
 * @author win10
 *
 */
public class SumOfOdds {

	public static void main(String[] args) {
		//1.���� 2.�ʱ�ȭ
		//1~100���� ������ų ���� �����ϴ� ���� ����
		int num = 1;
		//Ȧ�� ���� ������ ���� ����,�ʱ�ȭ
		int sum = 0;
		//3.���
		while (num<=100) {
			sum = sum + num;
			num += 2; //++�� 1�� �ۿ� �������� ����
			System.out.printf("1~100���� Ȧ���� �� : %d%n",sum);
			
			num = 1;
			sum = 0;
			while (num<=100) {
				if((num&2) == 1) {
					sum += num; 
				}
				num++;
			}
		}
		
	}

}
