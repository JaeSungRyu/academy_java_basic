package control.loop;

import java.util.Scanner;

/**
 * do~while�� Ȱ��
 * @author win10
 *
 */
public class FindMax {

	public static void main(String[] args) {
		//1.����
		int input;
		int max;
		
		Scanner scan;
		//2.�ʱ�ȭ
		max = 0;
		scan = new Scanner(System.in);
		System.out.println("����� �Է�(�������� 0�Է�)");
		input = scan.nextInt();
		
		do {
			System.out.println("����� �Է�(�������� 0�Է�)");
			input = scan.nextInt();
			if(input > max)
				max = input;
				
			}
			while(input>0); 
			System.out.printf("�ִ��� %d �Դϴ�",max); 
		
		
		//3.���
		
	}

}
