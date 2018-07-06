package control.loop;
/**
 * 1~100사이의 홀수의 합을 구하는 클래스
 * 
 * while 구문 활용
 * @author win10
 *
 */
public class SumOfOdds {

	public static void main(String[] args) {
		//1.선언 2.초기화
		//1~100까지 증가시킬 값을 저장하는 변수 선언
		int num = 1;
		//홀수 값을 저장할 변수 선언,초기화
		int sum = 0;
		//3.사용
		while (num<=100) {
			sum = sum + num;
			num += 2; //++는 1씩 밖에 증가하지 않음
			System.out.printf("1~100사이 홀수의 합 : %d%n",sum);
			
			num = 1;
			sum = 0;
			while (num<=100) {
				if((num&2) == 1) {
					sum += num; 
				}
				num++;
			}
		}
		
	}

}
