package clothing;

import java.util.Arrays;

import java.util.List;


public class Showcase{
	
	//1.멤버변수 선언부
	private Hat[] hats;
	
	//2.생성자 선언부
	//기본 생성자 생성
	public Showcase() {
		this.hats = new Hat[0];
	}
	//매개변수 생성자 
	public Showcase(Hat[] hats) {
		this.hats = hats;
	}
	
	//hats필드의 접근자 수정자
	public Hat[] getHats() {
		return hats;
	}
	
	public void setHats(Hat[] hats) {
		this.hats = hats;
	}
	
	public void add(Hat hat) {
		this.hats = Arrays.copyOf(hats, hats.length+1);
		
		this.hats[hats.length - 1] = hat;
	}
	public Hat get(Hat hat) {
		return findHat(hat);
	}
	public void set(Hat hat) {
	int setIndex = -1;
	
	if((setIndex = findHatIdx(hat)) > -1) {
		hats[setIndex] = hat;
	}
}
	public void remove(Hat hat) {
		int rmIndex = -1;
		rmIndex = findHatIdx(hat);
		
		Hat[] newHats;
		if (rmIndex > -1) {
			newHats = new Hat[this.hats.length - 1];
			
			// 1. rmIndex 가 배열 중간일 때			
			if (rmIndex < (hats.length - 1)) {
				// 삭제할 제품 앞쪽까지 복사
				for (int idx = 0; idx < rmIndex; idx++) {
					newHats[idx] = hats[idx];
				}
				
				// 삭제할 제품 뒷쪽부터 끝까지 복사
				for (int idx = rmIndex; idx < newHats.length; idx++) {
					newHats[idx] = hats[idx + 1];					
				}

			} else {
			// 2. rmIndex 가 배열 마지막일 때
				for (int idx = 0; idx < hats.length - 1; idx++) {
					newHats[idx] = hats[idx];
				}
			}
			this.hats = newHats;
			
		} // outer if end

	}//rm method 끝
	
	public List<Hat> getAllHats(){
		return Arrays.asList(this.hats);
	}
	
	
	private Hat findHat(Hat hat) {
		Hat finded = null;
		for (Hat hat2 : hats) {
			if(hat2.getHatid().equals(hat.getHatid())) {
				finded = hat2;
			}
		}
		return finded;
	}
	private int findHatIdx(Hat hat) {
		//배열에 존재하지 않는 값으로 초기화
		int index = -1;
		
		for (int idx = 0; idx < hats.length; idx++) {
			if (hats[idx].getHatid().equals(hat.getHatid())) {
				index = idx;
				break;
				
			}
			
		}
		return index;
	}
 
}
