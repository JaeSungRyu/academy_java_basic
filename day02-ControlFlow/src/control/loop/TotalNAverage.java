package control.loop;

import java.util.Scanner;

public class TotalNAverage {

	public static void main(String[] args) {
		//1.���� 2.�ʱ�ȭ
		int  total = 0,score = 0, count = 0;
		double avg;
		Scanner scan;
		//��ĳ�� �ʱ�ȭ 
		scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���(�������� 0�� �Է�)");
		score = scan.nextInt();
		
		while (score != 0) {
			total = score + total;
			count++;
			System.out.println("������ �Է��ϼ���(�������� 0�� �Է�)");
			total = scan.nextInt();
			if(count == 0){
				System.out.println("�Էµ� ���� �����ϴ�.");
				}else {
			avg = (double)total / count;
			System.out.printf("����:%d%n",total);
			System.out.printf("���:%5.2f%n",avg);
				}
				
		}
		
	} 

}
