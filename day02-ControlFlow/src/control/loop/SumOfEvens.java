package control.loop;
/**
 * 1~100까지 짝수의 합 
 * 짝수의 합을 구하기오
 * @author win10
 *
 */
public class SumOfEvens {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		while (num<=100) {
			sum = num + sum;
			num+=2;
			
			System.out.println("1~100까지의 짝수의 합 :" + sum);
		}
		
	}

}
