package operator.binary;

import java.util.Scanner;

/**
 * 입력된 정수가 0~100사이의 
 * 유효한 값인지 판단하는 클래스이다.
 * @author win10
 *
 *논리연산자 &&를 테스트
 *Scanner 를 사용하여 간단히 키보드 입력으로 처리한다.
 *
 */
public class ScoreInput {

	public static void main(String[] args) {
		//1.선언
		//스캐너 선언
		Scanner scan = new Scanner(System.in);
		
		//변수 초기화 : 스캐너를 통해서 입력
		int score;
		
		//변수선언
		System.out.println("점수를 입력 : ");
		score = scan.nextInt();
				
		//3.사용
		//0<=score<100
				if(score >= 0 && score <=100){

					System.out.printf("%d는 유효한 점수입니다.%n",score);
					}else {
						System.out.printf("%d는 유효한 점수가 아닙니다.%n",score);
					
				} 	
				/**
				 * -----------------------------
				 * 테스트 사용시 주의점
				 * -----------------------------
				 * 1.올바른 데이터만으로 테스트 하는것을 주의
				 * 2.경계값 테스트를 반드시 진행
				 * 3.잘못된 결과를 발생시킬 것으로
				 *   예상되는 값으로 반드시 진행
				 *------------------------------   	
				 */
				}

	}

