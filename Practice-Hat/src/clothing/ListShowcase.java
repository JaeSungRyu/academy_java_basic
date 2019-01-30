package clothing;

import java.util.ArrayList;
import java.util.List;


public class ListShowcase implements GeneralShowcase {
	//1.멤버 변수 선언부
	private List<Hat> hats;
	
	//2.생성자 선언부
	//(1)기본 생성자
	//ArrayList 를 사용해 자동으로 길이를 늘려줌
	public ListShowcase() {
		
		hats = new ArrayList<Hat>();
	} 
	
	//매개변수가 있는 생성자
	public ListShowcase(List<Hat> hats) {
		
		this.hats = hats; 
	}
	
	//접근자 
	public List<Hat> getHats() {
		
		return hats;
	}

	//수정자
	public void setHats(List<Hat> hats) {
		
		this.hats = hats;
	}
	
	//제품을 추가하는 메소드
	@Override
	public int add(Hat hat) {
		boolean success = hats.add(hat);
		int addCnt = 0;
		
		if (success) {
			addCnt++;
		}
		
		return addCnt;
	
	}
	
	//제품을 조회하는 메소드
	@Override
	public Hat get(Hat hat) {
	int getIndex = findHatIdx(hat);
	Hat found = null;
	if(getIndex > -1) {
		found = hats.get(getIndex);
	}
	
	return found;
}
	
	//제품을 수정하는 메소드
	@Override
	public int set(Hat hat) {
		
		int setIdx = findHatIdx(hat);
		
		if(setIdx >-1) {
			hats.set(setIdx, hat);
		}
		
			return setIdx; 
	
	}
	
	//제품을 제거하는 메소드
	@Override
	public int remove(Hat hat) {
		
		int rmIdx = findHatIdx(hat);
		
		if(rmIdx > -1) {
			
			hats.remove(rmIdx);
			
		}
		
		return rmIdx;
	}

	//모든 제품을 조회하는 메소드
	@Override
	public List<Hat> getAllHat() {

		return this.hats;
	
	}
	
	//찾는 제품의 인덱스를 지원하는 메소드
	private int findHatIdx(Hat hat) {
		int index = -1;
		
		for (int idx = 0; idx < hats.size(); idx++) {
			if (hats.get(idx).equals(hat)) {
				index = idx;
				break;
			 }
		}
		return index;
	}
	
}
