package shop.dao;

import java.util.ArrayList;
import java.util.List;

import shop.exception.DuplicateException;
import shop.exception.NotFoundException;
import shop.vo.Product;

/**
 * ��ǰ������ ������ �ڷᱸ���� ����Ʈ�� �����ϴ� â�� Ŭ����
 * @author PC38206
 *
 */
public class ListWarehouse implements GeneralWarehouse {
	
	// 1. ��� ���� �����
	private List<Product> products;
	
	// 2. ������ �����
	// (1) �⺻ ������
	public ListWarehouse() {
		products = new ArrayList<Product>();
	}
	
	// (2) �Ű� ������ �޴� ������
	public ListWarehouse(List<Product> products) {
		this.products = products;
	}

	//  ������
	public List<Product> getProducts() {
		return products;
	}

	// ������
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public int add(Product product) throws DuplicateException {
		int index = findProductIdx(product);
		int addCnt = 0;
		
		if (index == -1) {
			products.add(product);
			addCnt++;
			
		} else {
			throw new DuplicateException("add", product);
		}
		
		return addCnt;
	}
	
	@Override
	public Product get(Product product) throws NotFoundException {
		int getIndex = findProductIdx(product);
		Product found = null;
		
		if (getIndex > -1) {
			// ã�ƿ� ��ǰ�� ����
			found = products.get(getIndex); 
			
		} else {
			throw new NotFoundException("get", product);
		}
		
		return found;
	}

	@Override
	public int set(Product product) throws NotFoundException {
		int setCnt = 0;
		int setIdx = findProductIdx(product);
		
		if (setIdx > -1) {
			products.set(setIdx, product);
			setCnt++;
			
		} else {
			throw new NotFoundException("set", product);
		}
		
		return setCnt;
	}

	@Override
	public int remove(Product product) throws NotFoundException {
		int rmCnt = 0;
		int rmIdx = findProductIdx(product);
		
		if (rmIdx > -1) {
			products.remove(rmIdx);
			rmCnt++;
			
		} else {
			throw new NotFoundException("remove", product);
		}
		
		return rmCnt;
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








