package type.primitive;
/**
 * 실수형 타입인 float,double 타입을
 * 테스트하는 클래스이다.
 * @author win10
 *
 */
public class FloatTest {

	public static void main(String[] args) {
		//1.선언
		float pi1;
		double pi2;
		
		//2.초기화
		pi1 = 3.14f; //실수로 표현된 값이 있으면 기본적으로double로 인식
					 //그래서 float은 실수뒤에 f를 붙여줌
					 //f를 안붙일 시 오류가 나는 이유는 double타입이 float보다 크기때문에 값이 오버됨
		pi2 = 3.14;
		
		//3.사용
		System.out.println("float pi1 = " + pi1);
		System.out.println("double pi2 = " + pi2);
		System.out.println("======================");
		
		pi1 = 3.1415926536539304123F;
		pi2 = 3.1415926536539304123;
		
		System.out.println("float pi1 = " + pi1);
		System.out.println("double pi2 = " + pi2);
		
	}
	

}