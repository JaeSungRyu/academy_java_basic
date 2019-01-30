package api.wrapper;
import static java.lang.Integer.*;
import static java.lang.Double.*;

/**
 * 기본형을 객체형으로 포장하는 포장클래스중
 *  int : Integer
 *  double : Double
 *  두가지를 테스트하는 클래스이다.
 * @author win10
 *
 */
public class IntDoubleWrapper {

	public static void main(String[] args) {
		//(0)사용할 문자열 변수 선언
		String intInput = "100";
		String dblInput = "200.0";
		
		//(1)String 타입 --> 기본형
		//(.1)parseType() : static 메소드 사용하는 방법
		//import를 시켜주면 parseInt 안넣어도 됨.
		String intfrm = String.format("문자열[%s]를 기본형 [%d]로 변경%n]"
				      , intInput,Integer.parseInt(intInput));
		
		System.out.println(intfrm);
		
		String dblfrm = String.format("문자열[%s]를 기본형 [%f]로 변경]"
				, dblInput,Double.parseDouble(dblInput));
		
		System.out.println(dblfrm);
		
		
		//(.2)typeValue() : non-static 메소드 사용
		intfrm = String.format("문자열[%s]를 기본형 [%d]로 변경%n]"
			      , intInput,new Integer(intInput).intValue());
	
		System.out.println(intfrm);
		dblfrm = String.format("문자열[%s]를 기본형 [%f]로 변경%n]"
				, intInput,new Double(dblInput).doubleValue());
		
		System.out.println(dblfrm);
	
		//(2)기본형 ------> String
		int ten = 10;
		double sixty = 60.0;
		
		String tenStr = new Integer(ten).toString();
		String sixtyStr = new Double(sixty).toString();
		//String  변경 확인을 위해 문자열 접합
		tenStr += "입니다.";
		sixtyStr += "입니다.";
		
		//접합 연산 결과 출력
		System.out.println(tenStr);
		System.out.println(sixtyStr);
		
		
		//(3)기본형 <------> 객체형
		Integer ObjTen = new Integer(ten);
		Double ObjSixty = new Double(sixty);
		
		System.out.println(ten + "의 객체형 데이터 : " + ObjTen);
		System.out.println(sixty + "의 객체형 데이터 : " + ObjSixty);
		
	}

}