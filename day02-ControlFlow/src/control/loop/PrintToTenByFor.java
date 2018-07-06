package control.loop;
/**
 * 1~10까지 출력하는 클래스
 * for 구문구조를 사용하여 출력
 * @author win10
 *
 */
public class PrintToTenByFor {

	public static void main(String[] args) {
		//for(선언식;조건식;증감식)
		for(int idx =1; idx <= 10; idx++) {
			System.out.printf("idx =%2d%n",idx);
		}
		System.out.println("======================");
		final int From = 1;
		final int To = 10;
		
		for(int idx=From; idx<=To; idx++) {
			System.out.printf("idx =%2d%n",idx);
		}
		System.out.println("===========10~1역순출력============");
		for(int idx = To; idx >=From; idx--) {
			System.out.printf("idx =%2d%n",idx); 
		}
		
	}

}
