package type.casting;
/**
 * 숫자형 테이터 사이에
 * 형 변환(type casting)을
 * 테스트하는 클래스이다.
 * 자동형변환 : 작은 자료형 -> 큰 자료형
 * 프로모션 : 더 큰 자료형으로 자동 형변환 / (데이터 무손실)
 * 디모션 	: 더 작은 자료형으로 강제 형변환 / 데이터 손실 가능성 있음.
 * @author win10
 *
 */
public class TypeCastingTest {

	public static void main(String[] args) {
		//1.선언
		double pi = 3.1415926542154587;
		int number = 100;
		int result;
		//2.초기화
		result = number + (int)pi;  //(형변환타입)피연산자
		//3.사용
		System.out.println("double pi = " + pi);
		System.out.println("int number= " + number);
		System.out.println("int result= " + result);
	}

}
