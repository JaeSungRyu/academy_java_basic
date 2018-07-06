package array.multi;
/**
 * 동적 2차원 배열을 생성하고 사용해보는 클래스
 * 
 * 2차수의 배열은 각각 3, 4, 1, 5 사이즈로 생성
 * @author win10
 *
 */
public class Dynamic2D {

	public static void main(String[] args) {
		
		//1.선언
		int[][] twoDarray;
		int count = 0;
		
		
		//2.초기화
		twoDarray = new int[4][];
		twoDarray = new int[0][3];
		twoDarray = new int[1][4];
		twoDarray = new int[2][1];
		twoDarray = new int[3][5];
		
				
		//3.사용
		//(1)2차원 배열의 각 칸에 1~13까지
		//   for 구문을 사용하여 할당
		for (int idx = 0; idx < twoDarray.length; idx++) {
			for (int idx2 = 0; idx2 < twoDarray[idx].length; idx2++) {
				twoDarray[idx][idx2] = ++count;
			}
			System.out.println();
		}
		
		//(2)할당한 값 확인을 위한 출력
		for (int idx = 0; idx < twoDarray.length; idx++) {
			for (int idx2 = 0; idx2 < twoDarray[idx].length; idx2++) {
		System.out.printf("twoDarray[%d][%d] = %d\t",idx,idx,twoDarray[idx][idx2]);
		//(3)foreach로 출력
		for (int[] outer : twoDarray) {
			for (int in : outer) {
				System.out.printf("%d%n",in);
			}
			System.out.println();
		} 
		
	}
		}
	}


}






