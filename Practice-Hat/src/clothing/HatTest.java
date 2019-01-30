package clothing;

import java.util.ArrayList;
import java.util.List;

/**
 * =================================================================== 사용 클래스
 * HatTest 작성 패키지 이름 : clothing 클래스 이름 : HatTest -------------------------- main
 * 메소드 작성
 * 
 * 메인 메소드 내에 Hat 객체를 3개 생성 Hat cap = new Hat(......); // type을 "야구모자"로 생성,
 * hatId: HT001, 나머지 필드는 적당히 Hat fedora = new Hat(....);// type을 "페도라"로 생성 ,
 * hatId: HT002, 나머지 필드는 적당히 Hat sunCap = new Hat(....);// type을 "썬캡" 으로 생성 ,
 * hatId: HT003, 나머지 필드는 적당히
 * 
 * List<Hat> hats 를 생성하고 앞서 생성한 cap, fedora, sunCap 을 add() 한다. hats 를 foreach 로
 * 출력. 출력할 때 println() 메소드 안에 hat 객체를 바로 출력
 * 
 * @author win10
 *
 */
public class HatTest {  

	public static void main(String[] args) {
		// List<hat> hats생성
		Hat[] hats2 = new Hat[0];
		List<Hat> hats = new ArrayList<Hat>();

//		GeneralShowcase showcase = new 
		GeneralShowcase showcase = new ListShowcase(hats);

		// 3개의 Hat 객체 생성
		Hat cap = new Hat("HT001", "야구모자", "천", 57, "파랑", 32, 30, 'M');
		Hat fedora = new Hat("HT002", "페도라", "밀짚", 59, "갈색", 28, 15, 'F');
		Hat sunCap = new Hat("HT003", "썬캡", "밀짚", 58, "빨강", 30, 50, 'U');

		// 생성된 객체 hats에 add
		hats.add(cap);
		hats.add(fedora);
		hats.add(sunCap);
 
		System.out.println("제품정보");
		// foreach문으로 hats 객체출력
		for (Hat hat : hats) {
			System.out.println(hat);
		}
			
			
			// 제품수정
			Hat cap2 = new Hat("HT001", "야구모자", "천", 30, "빨강", 20, 30, 'M');
			showcase.set(cap2);
			//수정된 제품 확인
			System.out.println("================수정");
			showcase.get(new Hat("HT001", null, null, 0.0, null, 0.0, 0, '\u0000')).print();
			// 제품 삭제
			showcase.remove(new Hat("HT001", null, null, 0.0, null, 0.0, 0, '\u0000'));
			//전체목록 재 조회
			System.out.println("================삭제");
			for (Hat hat : showcase.getAllHat()) {
				hat.print();
			}

		} 
	
}

	


