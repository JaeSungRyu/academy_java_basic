package operator.binary;

import java.util.Scanner;

/**
 * ���׿����� �� ���������(+,-,*,/,%)
 * �� �׽�Ʈ�ϴ� Ŭ�����̴�.
 * 
 * printf�� �Ἥ �������Ͽ� �׽�Ʈ
 *
 * �������� �Է��� �޾Ƽ� �Է¹��� ������
 * ��Ģ����� ������ ������ ������
 */
public class Arithmetic {

	public static void main(String[] args) {
		//1.����
		//�Է¹��� ���� ����
		int input1;
		int input2;
		
		//Ű���� �Է��� ���� ���ִ� ��ĳ�ʸ� �̿�
		//Ű���� �Է��� �޴� ��ĳ�� ���� ���� : ctrl + shift + o (�ڵ� ����Ʈ) 
		Scanner scan;
		
		//2.�ʱ�ȭ
		//��ĳ�� ���� �ʱ�ȭ
		scan = new Scanner(System.in);
		
		
		//��ĳ�ʸ� ����Ͽ� ���� ���� �Է�
		System.out.println("���� �ΰ��� �Է� : ");
		input1= scan.nextInt();
		input2= scan.nextInt();
		
		System.out.printf("%d + %d = %d%n",
				           input1,input2,input1+input2);
		System.out.printf("%d - %d = %d%n",
		                   input1,input2,input1-input2);
		System.out.printf("%d * %d = %d%n",
		           		   input1,input2,input1*input2);
		System.out.printf("%d / %d = %d%n",
		           		   input1,input2,input1/input2);
		System.out.printf("%d %% %d = %d%n",
		                   input1,input2,input1%input2);
	}

}



