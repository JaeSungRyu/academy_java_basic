package control.loop;
/**
 * 중첩 for 구조를 사용하여 구구단을 출력
 * 2~9단을 출력
 * 
 * 각 단을 시작할 때 단의 제목을 출력
 * @author win10
 *
 */
public class NineNineTable {

	public static void main(String[] args) {
	//선언 초기화 사용 한꺼번에 이루어짐
		//외부 for 반복문 : 2~9단을 반복
		for(int stage = 2; stage<=9;stage++) {
			//단의 제목 출력
			System.out.printf("%d 단%n",stage);
			//내부 for 반복문 : 1~9곱해지는 수를 반복
			for(int times = 1; times <=9;times++) {
				
				System.out.printf("%d x %d = %2d%n",stage,times,stage*times);
			}
		}
		
	}

}
