package array.multi;

import java.util.Scanner;

public class ArcheryScore {

	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		int[][] score = new int[3][9];
		int[] sum = new int[3];
		int max = 0;
		
		//�� �������� ���� ������ �Է¹޾� �迭�� ����
		System.out.println("��� ���� ���� �Է�");
		for (int idx = 0; idx < score.length; idx++) {
			System.out.println((idx+1)+"��° ���� ���� �Է�");
			for (int idx2 = 0; idx2 < score[idx].length; idx2++) {
				score[idx][idx2] = scan.nextInt();
				sum[idx] += score[idx][idx2];
				if (sum[idx]>max) {
					max = sum[idx]; 
				}
			}
			}
			System.out.println("��¼���");
			for (int idx = 0; idx < score.length; idx++) {
				for (int idx2 = 0; idx2 < score[idx].length; idx2++) {
					
					if (sum[idx] == max) {
						System.out.printf("%d��° ����",idx);
				}
			}
		}
	}
}
