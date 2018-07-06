package control.loop;
/**
 * 화씨온도(F) -> 섭씨온도(C)변환 공식 C = 5/9(F-32)를 이용
 * 화씨온도->섭씨온도 변환 표 출력
 * 화씨온도 0.0도에서 10도씩 증가시키면서 100.0도까지 출력
 * for loop 이용, 온도는 double 타입으로 계산 
 * @author win10
 *
 */

public class F2CTable {
	
	public static void main(String[] args) {
		double fah = 0.0;
		double cel = 0.0;
		
		
		final int From = 0;
		final int To = 100;
		final int STEP = 10;
		
		
		for (fah = From; fah <= To; fah += STEP) {
			cel  = 5.0 / 9.0 * (fah - 32);
			System.out.printf("%5.1f F =  %5.1fC %n",fah,cel); 
		} 
		System.out.printf("%5.1f F",fah); 
	} 
}