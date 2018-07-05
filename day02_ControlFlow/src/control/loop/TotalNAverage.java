package control.loop;

import java.util.Scanner;

public class TotalNAverage {

	public static void main(String[] args) {
		//1.선언 2.초기화
		int  total = 0,score = 0, count = 0;
		double avg;
		Scanner scan;
		//스캐너 초기화 
		scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요(끝내려면 0을 입력)");
		score = scan.nextInt();
		
		while (score != 0) {
			total = score + total;
			count++;
			System.out.println("점수를 입력하세요(끝내려면 0을 입력)");
			total = scan.nextInt();
			if(count == 0){
				System.out.println("입력된 값이 없습니다.");
				}else {
			avg = (double)total / count;
			System.out.printf("총점:%d%n",total);
			System.out.printf("평균:%5.2f%n",avg);
				}
				
		}
		
	} 

}
