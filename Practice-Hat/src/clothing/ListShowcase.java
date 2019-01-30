package clothing;

import java.util.ArrayList;
import java.util.List;


public class ListShowcase implements GeneralShowcase {
	//1.��� ���� �����
	private List<Hat> hats;
	
	//2.������ �����
	//(1)�⺻ ������
	//ArrayList �� ����� �ڵ����� ���̸� �÷���
	public ListShowcase() {
		
		hats = new ArrayList<Hat>();
	} 
	
	//�Ű������� �ִ� ������
	public ListShowcase(List<Hat> hats) {
		
		this.hats = hats; 
	}
	
	//������ 
	public List<Hat> getHats() {
		
		return hats;
	}

	//������
	public void setHats(List<Hat> hats) {
		
		this.hats = hats;
	}
	
	//��ǰ�� �߰��ϴ� �޼ҵ�
	@Override
	public int add(Hat hat) {
		boolean success = hats.add(hat);
		int addCnt = 0;
		
		if (success) {
			addCnt++;
		}
		
		return addCnt;
	
	}
	
	//��ǰ�� ��ȸ�ϴ� �޼ҵ�
	@Override
	public Hat get(Hat hat) {
	int getIndex = findHatIdx(hat);
	Hat found = null;
	if(getIndex > -1) {
		found = hats.get(getIndex);
	}
	
	return found;
}
	
	//��ǰ�� �����ϴ� �޼ҵ�
	@Override
	public int set(Hat hat) {
		
		int setIdx = findHatIdx(hat);
		
		if(setIdx >-1) {
			hats.set(setIdx, hat);
		}
		
			return setIdx; 
	
	}
	
	//��ǰ�� �����ϴ� �޼ҵ�
	@Override
	public int remove(Hat hat) {
		
		int rmIdx = findHatIdx(hat);
		
		if(rmIdx > -1) {
			
			hats.remove(rmIdx);
			
		}
		
		return rmIdx;
	}

	//��� ��ǰ�� ��ȸ�ϴ� �޼ҵ�
	@Override
	public List<Hat> getAllHat() {

		return this.hats;
	
	}
	
	//ã�� ��ǰ�� �ε����� �����ϴ� �޼ҵ�
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
