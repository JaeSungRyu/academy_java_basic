package control.loop;
/**
 * ȭ���µ�(F) -> �����µ�(C)��ȯ ���� C = 5/9(F-32)�� �̿�
 * ȭ���µ�->�����µ� ��ȯ ǥ ���
 * ȭ���µ� 0.0������ 10���� ������Ű�鼭 100.0������ ���
 * for loop �̿�, �µ��� double Ÿ������ ��� 
 * @author win10
 *
 */

public class F2CTable {
	
	public static void main(String[] args) {
		double fah = 0.0;
		double cel = 0.0;
		
		
		final int From = 0;
		final int To = 100;
		final int STEP = 10;
		
		
		for (fah = From; fah <= To; fah += STEP) {
			cel  = 5.0 / 9.0 * (fah - 32);
			System.out.printf("%5.1f F =  %5.1fC %n",fah,cel); 
		} 
		System.out.printf("%5.1f F",fah); 
	} 
}