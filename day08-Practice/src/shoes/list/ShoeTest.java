package shoes.list;

/**
+

+

+

+
+8. 삭제된 신발의 정보가 shoes 에 없는 것을 출력(전체 출력)
+
 */

import shoes.Shoe;

public class ShoeTest {

	public static void main(String[] args) {
		// 1. 선언 : Shoe 타입만 저장하느 List 선언
		ShoeList shoes = new ShoeList();

		// 2. Shoe 객체 선언 및 생성
		Shoe adidas = new Shoe("SH001", "슈퍼스타", 260, 87200, "운동화", 5);
		Shoe reebok = new Shoe("SH002", "리복 로얄 테크큐 티", 270, 42000, "러닝화", 20);
		Shoe nike = new Shoe("SH003", "나이키 탄준 샌들", 235, 41300, "샌들", 30);
		Shoe crocs = new Shoe("SH004", "라이트라이드 샌들 우먼", 220, 40200, "샌들", 7);
		Shoe birkenstock = new Shoe("SH005", "지제 에바", 240, 29000, "슬리퍼", 15);

		// 3. 리스트 추가
		shoes.add(adidas);
		shoes.add(reebok);
		shoes.add(nike);
		shoes.add(crocs);
		shoes.add(birkenstock);

		// 4. foreach로 출력
		System.out.println("==============3번====================");

		System.out.println(shoes.getAllShoes());

		System.out.println();

		System.out.println("==============4번====================");
		// 5. SH003 번 코드로 등록된 신발의 정보 1개를 출력
		System.out.println(shoes.get(new Shoe("SH003")));
		System.out.println();

		System.out.println("==============5번====================");
		Shoe nike2 = new Shoe("SH003", "나이키 탄준 샌들", 235, 41300, "샌들", 0);
		shoes.set(nike2);
		System.out.println();

		System.out.println("==============수정 완료===================");
		System.out.println();

		System.out.println("==============6번====================");
		System.out.println(shoes.get(new Shoe("SH003", null, 0, 0, null, 0)));
		System.out.println();

		System.out.println("==============7번====================");
		System.out.println("삭제 완료 ? = " + shoes.remove(new Shoe("SH003", null, 0, 0, null, 0)));
		System.out.println();

		System.out.println("==============8번====================");
		System.out.println(shoes.getAllShoes());

	}
}