package control.switchstmt;

import java.util.Scanner;

/**
 * �Էµ� �ڿ����� 3�� �������
 * �Ǻ��ϴ� Ŭ����
 * 
 * ��� �Ǵܿ� switch ������ Ȱ��
 * @author win10
 *
 */
public class DecideMultiple {

	public static void main(String[] args) {
	//1.����
	
	//�Է¹��� ���� ������ ����
	int input;
	
	//�Է��� ���� ��ĳ�� ���� ����
	Scanner scan;
		
	//2.�ʱ�ȭ
	//��ĳ�� ���� �ʱ�ȭ
	scan = new Scanner(System.in);
	
	//��ĳ�ʸ� ����Ͽ� input���� �ʱ�ȭ
	System.out.println("�ڿ����� �Է��ϼ���");
	input = scan.nextInt();
	
	//3.��� : input������ 3�� ������� �Ǵ�
	//		  switch���
	switch (input%3) {
	case 0:
		System.out.printf("�Է� �� %d�� 3�� ��� �Դϴ�",input);
		break;
	case 1:
		System.out.printf("�Է� �� %d�� 3�� ����� �ƴմϴ�",input);
		break;
	case 2:
		System.out.printf("�Է� �� %d�� 3�� ����� �ƴմϴ�",input);
		break;
		
	default:
		System.out.println("�Է��� �߸��Ǿ����ϴ�.");
		break;
 	
		}//end switch <-���� ������
	
	}//end main

}//end class
