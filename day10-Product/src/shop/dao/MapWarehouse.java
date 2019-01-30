package shop.dao;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import shop.exception.DuplicateException;
import shop.exception.NotFoundException;
import shop.vo.Product;

public class MapWarehouse implements GeneralWarehouse {
	
	// 1. ��� ���� ���� : ��ǰ������ ������ ��
	Map<String, Product> products;
	
	// 2. ������
	// (1) �⺻ ������
	public MapWarehouse() {
		super();
		products = new HashMap<>();
	}

	// (2) �Ű������� �޴� ������
	public MapWarehouse(Map<String, Product> products) {
		super();
		this.products = products;
	}

	@Override
	public int add(Product product) throws DuplicateException {
		int addCnt = 0;
		
		// ���� ��ü�� �ִ��� �˻�
		if (!isExists(product)) {
			products.put(product.getProdCode(), product);
			addCnt++;
		} else {
			// ���� ��ü�� ������
			throw new DuplicateException("add", product);
		}
		
		return addCnt;
	}

	@Override
	public Product get(Product product) throws NotFoundException {
		Product found = null;
		
		if (isExists(product)) {
			found = products.get(product.getProdCode());
			
		} else {
			// ��ȸ�� ��ǰ�� �������� ����
			throw new NotFoundException("get", product);
		}
		
		return found;
	}

	@Override
	public int set(Product product) throws NotFoundException {
		int setCnt = 0;
		
		if (isExists(product)) {
			products.replace(product.getProdCode(), product);
			setCnt++;
		} else {
			// ������ ��ǰ�� �������� ����
			throw new NotFoundException("set", product);
		}
		
		return setCnt;
	}

	@Override
	public int remove(Product product) throws NotFoundException {
		int rmCnt = 0;
		
		if (isExists(product)) {
			products.remove(product.getProdCode());
			rmCnt++;
		} else {
			// ������ ��ǰ�� �������� ����
			throw new NotFoundException("remove", product);
		}
		
		return rmCnt;
	}

	@Override
	public List<Product> getAllProducts() {
		Collection<Product> collection = products.values();
		Product[] prodArr = new Product[collection.size()];
		
		return Arrays.asList(collection.toArray(prodArr));
	}

	// ��ǰ�� �̹� �����ϴ��� ���� Ȯ��
	// true  : ������
	// false : ����
	private boolean isExists(Product product) {
		return products.containsKey(product.getProdCode());
	}
}







