package control.loop;
/**
 * 1~100���� ¦���� �� 
 * ¦���� ���� ���ϱ��
 * @author win10
 *
 */
public class SumOfEvens {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		while (num<=100) {
			sum = num + sum;
			num+=2;
			
			System.out.println("1~100������ ¦���� �� :" + sum);
		}
		
	}

}
