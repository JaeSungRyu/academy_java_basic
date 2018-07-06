package operator.ternary;

import java.util.Scanner;

/**
 * 삼항연산자(조건식?값1:값2)를
 * 테스트하는 클래스이다.
 * -----------------------------------
 * 조건식 : 연산결과는 항상 boolean타입의 데이터로
 * 나와야 한다
 * 값1 : 조건식의 결과가 true일때 선택되는 값
 * 값2 : 조건식의 결과가 false 일 때 선택되는 값
 * -------------------------------------
 * 값1,값2의 데이터 타입이 일치해야 한다
 * 수학적 절댓값 계산을 사용하여 테스트해본다.
 * @author win10
 *
 *
 */
public class TernaryTest {

	public static void main(String[] args) {
		//1.선언 2.초기화
		int x = 10;
		int y = -10;
		//x,y 변수에 들어있는 값의 절댓값을 저장할 변수
		int absX = (x < 0) ? -x : x;
		int absY = (y < 0) ? -y : y;
		
				
		//3.사용
		System.out.printf("x=%d일때,x의 절댓값은 %d%n",x,absX);
		System.out.printf("y=%d일때,y의 절댓값은 %d%n",y,absY);
		
		//스캐너를 사용하여 입력받은 값의 절댓값을 구해보자
		//1.스캐너,새 변수 선언
		Scanner scan;
		int z;
		//2.초기화
		scan = new Scanner(System.in); 	
		System.out.println("정수를 입력하세요. 절댓값이 출력 됩니다");
		z = scan.nextInt();
		
		int absZ = (z < 0) ? -z : z;
		System.out.printf("z=%d일때,z의 절댓값은 %d%n",z,absZ);
	}

}
