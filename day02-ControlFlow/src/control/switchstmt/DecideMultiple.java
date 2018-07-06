package control.switchstmt;

import java.util.Scanner;

/**
 * 입력된 자연수가 3의 배수인지
 * 판별하는 클래스
 * 
 * 배수 판단에 switch 구문을 활용
 * @author win10
 *
 */
public class DecideMultiple {

	public static void main(String[] args) {
	//1.선언
	
	//입력받을 값을 저장한 선언
	int input;
	
	//입력을 위한 스캐너 변수 선언
	Scanner scan;
		
	//2.초기화
	//스캐너 변수 초기화
	scan = new Scanner(System.in);
	
	//스캐너를 사용하여 input변수 초기화
	System.out.println("자연수를 입력하세요");
	input = scan.nextInt();
	
	//3.사용 : input변수의 3의 배수인지 판단
	//		  switch사용
	switch (input%3) {
	case 0:
		System.out.printf("입력 값 %d는 3의 배수 입니다",input);
		break;
	case 1:
		System.out.printf("입력 값 %d는 3의 배수가 아닙니다",input);
		break;
	case 2:
		System.out.printf("입력 값 %d는 3의 배수가 아닙니다",input);
		break;
		
	default:
		System.out.println("입력이 잘못되었습니다.");
		break;
 	
		}//end switch <-습관 들이자
	
	}//end main

}//end class
