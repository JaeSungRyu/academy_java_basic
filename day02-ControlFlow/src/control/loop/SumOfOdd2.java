package control.loop;
/**
 * 1~100사이의 홀수의 합을
 * for 반복문과 continue의 조합으로 구해보는 클래스
 * 
 * @author win10
 *
 */
public class SumOfOdd2 {

	public static void main(String[] args) {
	//1.선언
		int sum;
		int idx;
	//2.초기화
		for(sum = 0, idx = 1; idx<100; idx++) {
			if(idx%2==0) {
					;
			//짝수면 실행하지 않음
			//continue를 굳이 실행하지 않아도
			// ; 가 더 깔끔함
			}else {
				sum += idx;
			}
			
		}
		System.out.printf("1~100사이 홀수의 합 : %d%n",sum);
		
	}

}
