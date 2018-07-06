package control.loop;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		//1.선언
		double kg;
		double m;
		double bmi;
		Scanner scan = new Scanner(System.in);
		//2.초기화
		System.out.println("몸무게를 입력하세요");
		kg = scan.nextDouble();
		System.out.println("키를 입력하세요");
		m = scan.nextDouble();
		bmi = kg / (m*m);
		
		
		//3.사용
		if(bmi<15) {
			System.out.printf("BMI : %f : 병적인 체중",bmi);
		}else if(bmi>=15 && bmi<18.5) {
			System.out.printf("BMI : %f : 저체중",bmi);
		}else if(bmi>=18.5 && bmi<23) {
			System.out.printf("BMI : %f : 정상",bmi);
		}else if(bmi>23 && bmi<=27.5) {
			System.out.printf("BMI : %f : 과체중",bmi);
		}else if(bmi>27.5 && bmi<=40) {
			System.out.printf("BMI : %f : 비만",bmi);
		}else {
			System.out.printf("BMI : %f : 병적인 비만",bmi);
		}	
	}
					
}


