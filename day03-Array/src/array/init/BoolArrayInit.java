package array.init;
/**
 * boolean ���� �ʱⰪ�� 
 * Ȯ���Ѵ�
 * @author win10
 *
 */
public class BoolArrayInit {

	public static void main(String[] args) {
		//1.����
		boolean[] bools;
		//2.�ʱ�ȭ
		bools = new boolean[10];
		//3.���
		for (boolean bool: bools) {
			System.out.printf("bool = %b%n",bool);
		}
	}

}
