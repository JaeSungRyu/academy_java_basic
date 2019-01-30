package clothing;

import java.util.Arrays;

import java.util.List;


public class Showcase{
	
	//1.������� �����
	private Hat[] hats;
	
	//2.������ �����
	//�⺻ ������ ����
	public Showcase() {
		this.hats = new Hat[0];
	}
	//�Ű����� ������ 
	public Showcase(Hat[] hats) {
		this.hats = hats;
	}
	
	//hats�ʵ��� ������ ������
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
			
			// 1. rmIndex �� �迭 �߰��� ��			
			if (rmIndex < (hats.length - 1)) {
				// ������ ��ǰ ���ʱ��� ����
				for (int idx = 0; idx < rmIndex; idx++) {
					newHats[idx] = hats[idx];
				}
				
				// ������ ��ǰ ���ʺ��� ������ ����
				for (int idx = rmIndex; idx < newHats.length; idx++) {
					newHats[idx] = hats[idx + 1];					
				}

			} else {
			// 2. rmIndex �� �迭 �������� ��
				for (int idx = 0; idx < hats.length - 1; idx++) {
					newHats[idx] = hats[idx];
				}
			}
			this.hats = newHats;
			
		} // outer if end

	}//rm method ��
	
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
		//�迭�� �������� �ʴ� ������ �ʱ�ȭ
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
