package control.switchstmt;

import java.util.Scanner;

/**
 * 다중 선택 switch구문을 사용하여 다음의 기분으로
 * 90점이상 A
 * 80~89 B
 * 60~70 C
 * 40~69 D
 * 나머지 F
 * 
 * 입력된 정수에 대해 학점을 계산하는 클래스를 작성
 * 
 * 입력 int 타입 변수명 score
 * 학점 char 타입을 사용할 것 변수명 grade을 사용할 것
 * 
 * @author win10
 *
 */

public class ReportGrade {
	
	public static void main(String[] args) {
		//1.선언
		int score;
		char grade;
		Scanner scan;
		//2.초기화
		scan = new Scanner(System.in);
		System.out.println("0~100사이 점수를 입력하세요");
		score = scan.nextInt();
		
		
		//3.사용
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
		System.out.printf("점수%d는 %c입니다",score,grade);
		
	}

}
