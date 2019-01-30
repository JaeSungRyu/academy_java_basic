package shoes.list;

import java.util.ArrayList;
import java.util.List;
import shoes.Shoe;

public class ShoeList {
	// 1. List 타입의 shoes 멤버 변수 선언, 2. ArrayList 클래스로 객체 생성 초기화 
	List<Shoe> shoes = new ArrayList<Shoe>();
	
	// 2. 생성자 선언부
	// (1) 기본 생성자 선언, ArrayList<Shoe>로 초기화
	public ShoeList() {
		shoes = new ArrayList<Shoe>();
	}
	
	// (2) 매개변수가 있는 생성자 선언
	public ShoeList(List<Shoe> shoes) {
		this.shoes = shoes;
	}

	// 3. 메소드 선언

	// (1) 데이터를 추가하는 메소드
	public int add(Shoe shoe) {
		boolean success = shoes.add(shoe);
		int addResult = 0;

		if (success) {
			addResult++;
		}

		return addResult;
	}
	
	// (2) 데이터를 수정하는 메소드
	public int set(Shoe shoe) {
		int setResult = 0;
		for (int idx = 0; idx < shoes.size(); idx++) {
			if (shoes.get(idx).equals(shoe)) {
				shoes.set(idx, shoe);
				setResult = 1;
				break;
			}
		}
		return setResult;
	}
	
	// (3) 데이터를 삭제하는 메소드
	public int remove(Shoe shoe) {
		int rmResult = 0;
		for (int idx = 0; idx < shoes.size(); idx++) {
			if (shoes.get(idx).equals(shoe)) {
				shoes.remove(idx);
				rmResult = 1;
				break;
			}
		}
		return rmResult;
	}

	// (4) 특정 데이터 하나를 조회하는 메소드
	public Shoe get(Shoe shoe) {
		Shoe found = new Shoe();
		for (int idx = 0; idx < shoes.size(); idx++) {
			if (shoes.get(idx).equals(shoe)) {
				found = shoes.get(idx);
				break;
			}
		}
		return found;
	}

	// (5) 모든 데이터를 조회하는 메소드
	public List<Shoe> getAllShoes() {
		return this.shoes;
	}
}