package control.ifstmt;

import java.util.Scanner;

/**
 * �� ������ �Է¹޾�
 * �� �� ū ��, ���� ���� �������� Ŭ����
 * @author win10
 *
 */
public class MinMax {

	public static void main(String[] args) {
		//1.����
		int x,y;
		int min,max;
		Scanner scan;
		
		//2.�ʱ�ȭ
		scan = new Scanner(System.in);
		System.out.println("�� ������ �Է�(space bar�� �и��Է�)");
		
		//��ĳ�ʸ� ����Ͽ� x,y ������ ���� �ʱ�ȭ
		x = scan.nextInt();
		y = scan.nextInt();
		
		//3.��� : if���� ����
		//if~else�� ����Ͽ�
		//ū ���� �׻� max��,���� ���� �׻� min�� ����
		if(x<y) {
			min = x;
			max = y;
		}else {
			min = y;
	        max = x;
	    }
		 //���
		System.out.printf("�Է� �� �� ���� : %d,%d%n",x,y);
		System.out.printf("������ : %d%n",min);
		System.out.printf("ū �� : %d%n",max);
	}

}
