package array.init;
/**
 * boolean 값의 초기값을 
 * 확인한다
 * @author win10
 *
 */
public class BoolArrayInit {

	public static void main(String[] args) {
		//1.선언
		boolean[] bools;
		//2.초기화
		bools = new boolean[10];
		//3.사용
		for (boolean bool: bools) {
			System.out.printf("bool = %b%n",bool);
		}
	}

}
