package control.loop;
/**
 * 0~10까지 츨력하는 클래스
 * 
 * while 구문을 사용하여 
 * 반복 출력으로 구현한다.
 * @author win10
 *
 */
public class PrintToTen {

	public static void main(String[] args) {
		//1.선언 2.초기화
		int  num = 0;
		
		//3.사용
		while (num<=10) {
			System.out.printf("num = %d%n",num);
			num++; 
			
		}
	}

}
