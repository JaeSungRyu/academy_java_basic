package array.multi;

import java.util.Scanner;

public class BestPitcher {

	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		double[][] ERA = new double[3][5];
		double min = 10.0;
		
		//�� ������ ������ ����� �Է¹޾� �迭�� �����Ѵ�.
		
		System.out.println("1���� 2���� 3���� 4���� 5���� ����� �Է�");
		
		for (int idx = 0; idx < ERA.length; idx++) {
			System.out.print((idx+1)+"��° �� 1~5���� ���� ����� : ");
			for (int idx2 = 0; idx2 < ERA[idx].length; idx2++) {
				ERA[idx][idx2] = scan.nextDouble();
				if (ERA[idx][idx2]<min) {
				min = ERA[idx][idx2];
				}
			}
			System.out.println();	
		}
		System.out.println("�ְ��� ������");
		for (int idx = 0; idx < ERA.length; idx++) {
			for (int idx2 = 0; idx2 < ERA[idx].length; idx2++) {
				if(ERA[idx][idx2] == min) {
					
					System.out.printf("%d���� %d��°����",idx+1,idx2+1);
				}		
			}
		}
	}
}