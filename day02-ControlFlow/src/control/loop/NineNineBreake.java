package control.loop;
/**
 * �����ܿ��� ������ ����� 50�� ������ �ߴ��ϵ���
 * break ������ for �ݺ����� �����Ͽ�
 * �׽�Ʈ�غ��� Ŭ����
 * @author win10
 *
 */
public class NineNineBreake {

	public static void main(String[] args) {
		OUT:for (int stage=2;stage<10;stage++) {
			//�� ���
			System.out.printf("%d ��%n",stage);
			
			for(int times =1;times <10; times++) {
				if(stage*times>50) {
					break OUT;}
				System.out.printf("%d x %d = %d%n",stage,times,stage*times);
				
			}
		}	
	}
}
