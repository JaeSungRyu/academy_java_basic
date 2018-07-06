package operator.ternary;

import java.util.Scanner;

/**
 * ���׿�����(���ǽ�?��1:��2)��
 * �׽�Ʈ�ϴ� Ŭ�����̴�.
 * -----------------------------------
 * ���ǽ� : �������� �׻� booleanŸ���� �����ͷ�
 * ���;� �Ѵ�
 * ��1 : ���ǽ��� ����� true�϶� ���õǴ� ��
 * ��2 : ���ǽ��� ����� false �� �� ���õǴ� ��
 * -------------------------------------
 * ��1,��2�� ������ Ÿ���� ��ġ�ؾ� �Ѵ�
 * ������ ���� ����� ����Ͽ� �׽�Ʈ�غ���.
 * @author win10
 *
 *
 */
public class TernaryTest {

	public static void main(String[] args) {
		//1.���� 2.�ʱ�ȭ
		int x = 10;
		int y = -10;
		//x,y ������ ����ִ� ���� ������ ������ ����
		int absX = (x < 0) ? -x : x;
		int absY = (y < 0) ? -y : y;
		
				
		//3.���
		System.out.printf("x=%d�϶�,x�� ������ %d%n",x,absX);
		System.out.printf("y=%d�϶�,y�� ������ %d%n",y,absY);
		
		//��ĳ�ʸ� ����Ͽ� �Է¹��� ���� ������ ���غ���
		//1.��ĳ��,�� ���� ����
		Scanner scan;
		int z;
		//2.�ʱ�ȭ
		scan = new Scanner(System.in); 	
		System.out.println("������ �Է��ϼ���. ������ ��� �˴ϴ�");
		z = scan.nextInt();
		
		int absZ = (z < 0) ? -z : z;
		System.out.printf("z=%d�϶�,z�� ������ %d%n",z,absZ);
	}

}
