package control.ifstmt;

import java.util.Scanner;

/**
 * 두 정수를 입력받아
 * 둘 중 큰 값, 작은 값을 가려내는 클래스
 * @author win10
 *
 */
public class MinMax {

	public static void main(String[] args) {
		//1.선언
		int x,y;
		int min,max;
		Scanner scan;
		
		//2.초기화
		scan = new Scanner(System.in);
		System.out.println("두 정수를 입력(space bar로 분리입력)");
		
		//스캐너를 사용하여 x,y 변수에 값을 초기화
		x = scan.nextInt();
		y = scan.nextInt();
		
		//3.사용 : if로직 전개
		//if~else를 사용하여
		//큰 값은 항상 max에,작은 값은 항상 min에 저장
		if(x<y) {
			min = x;
			max = y;
		}else {
			min = y;
	        max = x;
	    }
		 //출력
		System.out.printf("입력 된 두 정수 : %d,%d%n",x,y);
		System.out.printf("작은값 : %d%n",min);
		System.out.printf("큰 값 : %d%n",max);
	}

}
