package shop;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ǰ������ ������ �ڷᱸ�� ����Ʈ�� �����ϴ� â�� Ŭ����
 * @author PC38206
 *
 */
public class ListWarehouse implements GeneralWarehouse {
	
	// 1. ��� ���� �����
	private List<Product> products;
	
	// 2. ������ �����
	// (1) �⺻ ������
	// �ڵ����� �迭�� ���̸� �÷��ִ� ArrayList�� ���
	public ListWarehouse() {
		products = new ArrayList<Product>();
	}
	
	public ListWarehouse(List<Product> products) {
		this.products = products;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public int add(Product product) {
		boolean success = products.add(product);
		int addCnt = 0;
		
		if (success) {
			addCnt++;
		}
		
		return addCnt;
	}


	@Override
	public Product get(Product product) {
		int getIndex = findProductIdx(product);
		Product found = null;
		
		if (getIndex > -1) {
			// ã�ƿ� ��ǰ�� ����
			found = products.get(getIndex); 
		} 
		
		return found;
	}

	@Override
	public int set(Product product) {
		int setIdx = findProductIdx(product);
		
		if (setIdx > -1) {
			products.set(setIdx, product);
		}
		
		return setIdx;
	}

	@Override
	public int remove(Product product) {
		int rmIdx = findProductIdx(product);
		
		if (rmIdx > -1) {
			products.remove(rmIdx);
		}
		
		return rmIdx;
	}

	@Override
	public List<Product> getAllProducts() {		
		return this.products;
	}
	
	// ����Ʈ �ȿ� ã������ ��ǰ�� �ε����� ���ϴ� ���� �޼ҵ�
	private int findProductIdx(Product product) {
		int index = -1;

		for (int idx = 0; idx < products.size(); idx++) {
			if (products.get(idx).equals(product)) {
				index = idx;
				break;
			}
		}
		return index;
	}
}








