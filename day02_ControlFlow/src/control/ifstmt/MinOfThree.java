package control.ifstmt;

import java.util.Scanner;

/**
 * �� ������ �Է¹޾Ƽ�
 * �� �� ���� ���� ������ �Ǻ��ϴ� Ŭ�����̴�.
 * 
 * ���� ���� ������ �Ǻ��� �� 
 * ��ø if~else�� ���
 * @author win10
 *
 */
public class MinOfThree {

	public static void main(String[] args) {
		//1.����
		//�Է��� ���� ���� ����
		int num1;
		int num2;
		int num3;
		//���� ���� ���� ������ ����
		int min;
		//��ĳ�� ����
		Scanner scan;
		//2.�ʱ�ȭ
		scan = new Scanner(System.in);
		//��ĳ�ʸ� �̿��� num1,num2,num3 ���� �ʱ�ȭ
		System.out.println("�� ������ �Է�(�����̽� �ٷ� �и� �Է�)");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		//3.��� : if~else������ ���� �� �Ǵ�
		if(num1<num2) {
			if(num1<num3) {
				min = num1;
			}
		}else {
				min = num3;
		}
		
			   if(num2<num3) {
				   min = num2;
			   }else {
				   min = num3;
			   }
		System.out.printf("�Էµ� �� �� &d,%d,%d�� ���� ���� ���� : %d",num1,num2,num3,min);		   
		}
	
	}
		

