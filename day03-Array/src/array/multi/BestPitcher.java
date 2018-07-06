package array.multi;

import java.util.Scanner;

public class BestPitcher {

	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		double[][] ERA = new double[3][5];
		double min = 10.0;
		
		//각 팀별로 투수의 방어율 입력받아 배열에 저장한다.
		
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율 입력");
		
		for (int idx = 0; idx < ERA.length; idx++) {
			System.out.print((idx+1)+"번째 팀 1~5선발 투수 방어율 : ");
			for (int idx2 = 0; idx2 < ERA[idx].length; idx2++) {
				ERA[idx][idx2] = scan.nextDouble();
				if (ERA[idx][idx2]<min) {
				min = ERA[idx][idx2];
				}
			}
			System.out.println();	
		}
		System.out.println("최고의 투수는");
		for (int idx = 0; idx < ERA.length; idx++) {
			for (int idx2 = 0; idx2 < ERA[idx].length; idx2++) {
				if(ERA[idx][idx2] == min) {
					
					System.out.printf("%d팀의 %d번째선수",idx+1,idx2+1);
				}		
			}
		}
	}
}