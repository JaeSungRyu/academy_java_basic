package control.loop;
/**
 * 1~100������ Ȧ���� ����
 * for �ݺ����� continue�� �������� ���غ��� Ŭ����
 * 
 * @author win10
 *
 */
public class SumOfOdd2 {

	public static void main(String[] args) {
	//1.����
		int sum;
		int idx;
	//2.�ʱ�ȭ
		for(sum = 0, idx = 1; idx<100; idx++) {
			if(idx%2==0) {
					;
			//¦���� �������� ����
			//continue�� ���� �������� �ʾƵ�
			// ; �� �� �����
			}else {
				sum += idx;
			}
			
		}
		System.out.printf("1~100���� Ȧ���� �� : %d%n",sum);
		
	}

}
