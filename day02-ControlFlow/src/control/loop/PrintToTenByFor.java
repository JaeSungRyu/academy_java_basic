package control.loop;
/**
 * 1~10���� ����ϴ� Ŭ����
 * for ���������� ����Ͽ� ���
 * @author win10
 *
 */
public class PrintToTenByFor {

	public static void main(String[] args) {
		//for(�����;���ǽ�;������)
		for(int idx =1; idx <= 10; idx++) {
			System.out.printf("idx =%2d%n",idx);
		}
		System.out.println("======================");
		final int From = 1;
		final int To = 10;
		
		for(int idx=From; idx<=To; idx++) {
			System.out.printf("idx =%2d%n",idx);
		}
		System.out.println("===========10~1�������============");
		for(int idx = To; idx >=From; idx--) {
			System.out.printf("idx =%2d%n",idx); 
		}
		
	}

}
