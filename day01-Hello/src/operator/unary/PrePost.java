package operator.unary;
/**
 * 단항 연산자 : 증감연산자(++,--)를 테스트 하는 클래스
 * 증감 연산자의 위치에 따른 값의 변화를 확인
 * ----------------------------------------
 * 
 * 변수 앞에 쓰이는 증가 된 값이 결과로 사용
 * 변수 뒤에 쓰이면 증가되기 전의 값이 결과로 사용됨.
 * @author win10
 *
 */
public class PrePost {

	public static void main(String[] args) {
		//1.선언
		int count = 0;
		//3.사용
//		System.out.println(++count); //0->1
//		System.out.println(count++); //화면 출력 후 1->2 
//		System.out.println(--count); //2->1
//		System.out.println(count--); //화면 출력 후 1->0
		
		
		System.out.println("변경 값 ||"+"변경 후 값"); //0->1
		System.out.println(++count+"       "+count); //0->1
		System.out.println(count+++"       "+count); //화면 출력 후 1->2 
		System.out.println(--count+"       "+count); //2->1
		System.out.println(count--+"       "+count); //화면 출력 후 1->0
		
	
	}

}
