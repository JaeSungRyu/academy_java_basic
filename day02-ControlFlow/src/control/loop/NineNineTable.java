package control.loop;
/**
 * ��ø for ������ ����Ͽ� �������� ���
 * 2~9���� ���
 * 
 * �� ���� ������ �� ���� ������ ���
 * @author win10
 *
 */
public class NineNineTable {

	public static void main(String[] args) {
	//���� �ʱ�ȭ ��� �Ѳ����� �̷����
		//�ܺ� for �ݺ��� : 2~9���� �ݺ�
		for(int stage = 2; stage<=9;stage++) {
			//���� ���� ���
			System.out.printf("%d ��%n",stage);
			//���� for �ݺ��� : 1~9�������� ���� �ݺ�
			for(int times = 1; times <=9;times++) {
				
				System.out.printf("%d x %d = %2d%n",stage,times,stage*times);
			}
		}
		
	}

}
