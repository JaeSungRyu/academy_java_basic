package control.ifstmt;

import java.util.Scanner;

/**
 * ���� ���� if������ ����Ͽ� ������ �������
 * 90���̻� A
 * 80~89 B
 * 60~70 C
 * 40~69 D
 * ������ F
 * 
 * �Էµ� ������ ���� ������ ����ϴ� Ŭ������ �ۼ�
 * 
 * �Է� int Ÿ�� ������ score
 * ���� char Ÿ���� ����� �� ������ grade�� ����� ��
 * 
 * @author win10
 *
 */
public class Grade {

	public static void main(String[] args) {
		//1.����
		int score;
		char grade;
		Scanner scan;
		
		
		//2.�ʱ�ȭ
		//��ĳ�� ���� �ʱ�ȭ
		scan = new Scanner(System.in);
		//��ĳ�ʸ� �̿��� score �ʱ�ȭ
		System.out.println("������ �Է��ϼ���");
		score = scan.nextInt();
		/** 90���̻� A
	     * 80~89 B
		 * 60~79 C
		 * 40~69 D
		 * ������ F
		 */ 
		if(score >= 90) {
			grade = 'A';
		}else if(score>=80 && score <90) {
			grade = 'B';
		}else if(score>=60 && score <80) {
			grade = 'C';
		}else if(score>=40 && score <80) {
			grade = 'D';
		}else {
			grade = 'F'; 
		}
		
		//3.���
		System.out.printf("������ ������ %c �Դϴ�",grade);
	}

}

