package control.loop;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		//1.����
		double kg;
		double m;
		double bmi;
		Scanner scan = new Scanner(System.in);
		//2.�ʱ�ȭ
		System.out.println("�����Ը� �Է��ϼ���");
		kg = scan.nextDouble();
		System.out.println("Ű�� �Է��ϼ���");
		m = scan.nextDouble();
		bmi = kg / (m*m);
		
		
		//3.���
		if(bmi<15) {
			System.out.printf("BMI : %f : ������ ü��",bmi);
		}else if(bmi>=15 && bmi<18.5) {
			System.out.printf("BMI : %f : ��ü��",bmi);
		}else if(bmi>=18.5 && bmi<23) {
			System.out.printf("BMI : %f : ����",bmi);
		}else if(bmi>23 && bmi<=27.5) {
			System.out.printf("BMI : %f : ��ü��",bmi);
		}else if(bmi>27.5 && bmi<=40) {
			System.out.printf("BMI : %f : ��",bmi);
		}else {
			System.out.printf("BMI : %f : ������ ��",bmi);
		}	
	}
					
}


