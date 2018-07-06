package control.ifstmt;

import java.util.Scanner;

/**
 * 다중 선택 if구문을 사용하여 다음의 기분으로
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
public class Grade {

	public static void main(String[] args) {
		//1.선언
		int score;
		char grade;
		Scanner scan;
		
		
		//2.초기화
		//스캐너 변수 초기화
		scan = new Scanner(System.in);
		//스캐너를 이용한 score 초기화
		System.out.println("점수를 입력하세요");
		score = scan.nextInt();
		/** 90점이상 A
	     * 80~89 B
		 * 60~79 C
		 * 40~69 D
		 * 나머지 F
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
		
		//3.사용
		System.out.printf("귀하의 학점은 %c 입니다",grade);
	}

}

