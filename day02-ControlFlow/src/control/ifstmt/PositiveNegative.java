package control.ifstmt;

import java.util.Scanner;

/**
 * �ϳ��� ������ �Է¹޾Ƽ�
 * ��������,0����,���������
 * �Ǵ��ϴ� Ŭ�����̴�
 * --------------------------------
 * ���� ��ȣ�� �Ǵ��� ��
 * if~else if ~else ������ ���
 * --------------------------------
 * @author win10
 * 
 * 
 *
 */
public class PositiveNegative {

	public static void main(String[] args) {
		//1.����
		//�Է¹��� ���� ����
		int input;
		//���,0,���� ��� �Ǵ��� ������ ����
		String result;
		//��ĳ�� ���� ����
		Scanner scan;
		
		//2.�ʱ�ȭ
		scan = new Scanner(System.in);
		
		//��ĳ�� ����Ͽ� �Է� ���� �ʱ�ȭ(�Է�)
		System.out.println("���� �ϳ��� �Է�");
		input = scan.nextInt();
		
		//3.���
		//�Է� ���� ����� input ������
		//if~else if~else �������� ��ȣ �Ǵ�
		if(input > 0) {
			result = "���";
		}else if(input == 0 ){
			result = "0";
		}else {
			result = "����";
		}
		System.out.printf("�Է� �� : %d�� %s�Դϴ�",input,result);
	}

}



