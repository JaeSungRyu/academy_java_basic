package type.primitive;
/**
 * 정수형 타입중 가장 대표 타입인 int
 * 타입을 테스트하는 클래스이다.
 * @author win10
 *
 */
public class IntegerTest {

	public static void main(String[] args) {
		//1.선언
		//한 줄에 변수를 선언하며 초기화 하는 것을
		//여러번 나열하는 것이 가능함
		int num1 = 5,num2 = 28;
		//한 줄에 여러 변수를 선언하는것이 가능
		int num3,num4,num5; //노란밑줄은 선언은 되었지만 사용되지 않은것을 알려줌(warning)
		
		//2.초기화
		//num3,num4,num5는 초기화
		//num1,num2에 대해서는 사용
		num3 = num1 * num2; //곱셈
		num4 = num2 / num1; //나눗셈
		num5 = 25 / num1;   //나눗셈
		
		//3.사용 : 변수의 값을 출력
		System.out.println("5 * 28 = " + num3);
		System.out.println("28 / 5 = " + num4);
		System.out.println("25 / 5 = " + num5);
		
	}

}
