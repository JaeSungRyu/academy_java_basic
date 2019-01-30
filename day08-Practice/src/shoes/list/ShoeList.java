package shoes.list;

import java.util.ArrayList;
import java.util.List;
import shoes.Shoe;

public class ShoeList {
	// 1. List Ÿ���� shoes ��� ���� ����, 2. ArrayList Ŭ������ ��ü ���� �ʱ�ȭ 
	List<Shoe> shoes = new ArrayList<Shoe>();
	
	// 2. ������ �����
	// (1) �⺻ ������ ����, ArrayList<Shoe>�� �ʱ�ȭ
	public ShoeList() {
		shoes = new ArrayList<Shoe>();
	}
	
	// (2) �Ű������� �ִ� ������ ����
	public ShoeList(List<Shoe> shoes) {
		this.shoes = shoes;
	}

	// 3. �޼ҵ� ����

	// (1) �����͸� �߰��ϴ� �޼ҵ�
	public int add(Shoe shoe) {
		boolean success = shoes.add(shoe);
		int addResult = 0;

		if (success) {
			addResult++;
		}

		return addResult;
	}
	
	// (2) �����͸� �����ϴ� �޼ҵ�
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
	
	// (3) �����͸� �����ϴ� �޼ҵ�
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

	// (4) Ư�� ������ �ϳ��� ��ȸ�ϴ� �޼ҵ�
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

	// (5) ��� �����͸� ��ȸ�ϴ� �޼ҵ�
	public List<Shoe> getAllShoes() {
		return this.shoes;
	}
}