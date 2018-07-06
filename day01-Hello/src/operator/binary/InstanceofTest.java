package operator.binary;
/**
 * 객체의 타입을 조사하는 연산자
 * instanceof를 테스트하는 클래스
 * -------------------------------------------
 * object instance class
 * 로 사용시 object 가 class 타입의 객체이면 true
 * 그 외의 경우는 false를 결과로 얻어내는 연산자
 * -------------------------------------------
 * @author win10
 *
 */
public class InstanceofTest {

	public static void main(String[] args) {
		//1.선언 2.초기화
		String name = "유재성";
		boolean result;
		//3.사용
		result = (name instanceof String);
		System.out.printf("name = %s이며 %n"
				+"%s(은)는 String 타입이다? %b%n",name,name,result);
		
		//1.선언 : StringBuffer = > 문자열을 저장할 수 있는 
		//		 String과 유사하지만 다른 타입
		StringBuffer surname;
		
		//2.초기화
		surname = new StringBuffer("Yoo");
		
		//3.사용
		result = ((Object)surname instanceof String);
		System.out.printf("surname = %s이며 %n"
				+"%s(은)는 String 타입이다? %b%n",surname,surname,result);
	}

}





