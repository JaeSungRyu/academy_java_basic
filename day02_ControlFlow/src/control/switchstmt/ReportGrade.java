package control.switchstmt;

import java.util.Scanner;

/**
 * ���� ���� switch������ ����Ͽ� ������ �������
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

public class ReportGrade {
	
	public static void main(String[] args) {
		//1.����
		int score;
		char grade;
		Scanner scan;
		//2.�ʱ�ȭ
		scan = new Scanner(System.in);
		System.out.println("0~100���� ������ �Է��ϼ���");
		score = scan.nextInt();
		
		
		//3.���
		switch (score/10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 6: case 7:
			grade = 'C';
			break;
		case 5: case 4:
			grade = 'D';
			break;
		
		default :
		grade = 'F';
			
		/*default:
			break;*/
		
		}
		System.out.printf("����%d�� %c�Դϴ�",score,grade);
		
	}

}
