package array.multi;
/**
 * ���� 2���� �迭�� �����ϰ� ����غ��� Ŭ����
 * 
 * 2������ �迭�� ���� 3, 4, 1, 5 ������� ����
 * @author win10
 *
 */
public class Dynamic2D {

	public static void main(String[] args) {
		
		//1.����
		int[][] twoDarray;
		int count = 0;
		
		
		//2.�ʱ�ȭ
		twoDarray = new int[4][];
		twoDarray = new int[0][3];
		twoDarray = new int[1][4];
		twoDarray = new int[2][1];
		twoDarray = new int[3][5];
		
				
		//3.���
		//(1)2���� �迭�� �� ĭ�� 1~13����
		//   for ������ ����Ͽ� �Ҵ�
		for (int idx = 0; idx < twoDarray.length; idx++) {
			for (int idx2 = 0; idx2 < twoDarray[idx].length; idx2++) {
				twoDarray[idx][idx2] = ++count;
			}
			System.out.println();
		}
		
		//(2)�Ҵ��� �� Ȯ���� ���� ���
		for (int idx = 0; idx < twoDarray.length; idx++) {
			for (int idx2 = 0; idx2 < twoDarray[idx].length; idx2++) {
		System.out.printf("twoDarray[%d][%d] = %d\t",idx,idx,twoDarray[idx][idx2]);
		//(3)foreach�� ���
		for (int[] outer : twoDarray) {
			for (int in : outer) {
				System.out.printf("%d%n",in);
			}
			System.out.println();
		} 
		
	}
		}
	}


}






