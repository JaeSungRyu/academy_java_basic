package control.loop;
/**
 * for 반복 구조에서 선언식,조건식,증감식이
 * 생략된 구문을 무한반복을 테스트해보는 클래스
 * 
 * @author win10
 *
 */
public class infiniteFor {

	public static void main(String[] args) {
		//조건식이 빠진 for 반복문
		//조건식이 생략되면 항상 true간주 =>무한루프
	for(int idx = 0; ;idx++){
		System.out.printf("idx=%d%n",idx);
	}	
	}

}
