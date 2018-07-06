package array.multi;

import java.util.Scanner;

public class ArcheryScore {

	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		int[][] score = new int[3][9];
		int[] sum = new int[3];
		int max = 0;
		
		//각 선수별로 과녁 점수를 입력받아 배열에 저장
		System.out.println("양궁 선수 점수 입력");
		for (int idx = 0; idx < score.length; idx++) {
			System.out.println((idx+1)+"번째 선수 점수 입력");
			for (int idx2 = 0; idx2 < score[idx].length; idx2++) {
				score[idx][idx2] = scan.nextInt();
				sum[idx] += score[idx][idx2];
				if (sum[idx]>max) {
					max = sum[idx]; 
				}
			}
			}
			System.out.println("우승선수");
			for (int idx = 0; idx < score.length; idx++) {
				for (int idx2 = 0; idx2 < score[idx].length; idx2++) {
					
					if (sum[idx] == max) {
						System.out.printf("%d번째 선수",idx);
				}
			}
		}
	}
}
