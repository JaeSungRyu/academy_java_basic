package control.loop;

import java.util.Scanner;

/**
 * do~while을 활용
 * @author win10
 *
 */
public class FindMax {

	public static void main(String[] args) {
		//1.선언
		int input;
		int max;
		
		Scanner scan;
		//2.초기화
		max = 0;
		scan = new Scanner(System.in);
		System.out.println("양수를 입력(끝내려면 0입력)");
		input = scan.nextInt();
		
		do {
			System.out.println("양수를 입력(끝내려면 0입력)");
			input = scan.nextInt();
			if(input > max)
				max = input;
				
			}
			while(input>0); 
			System.out.printf("최댓값은 %d 입니다",max); 
		
		
		//3.사용
		
	}

}
