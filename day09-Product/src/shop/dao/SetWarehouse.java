package shop.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import shop.vo.Product;

public class SetWarehouse implements GeneralWarehouse {

	// 1. ��� ���� : ��ǰ�� ������ �ڷᱸ���� set ����
	private Set<Product> products;
	
	// 2. ������ 
	public SetWarehouse() {
		products = new HashSet<Product>();
	}
	
	public SetWarehouse(Set<Product> products) {
		super();
		this.products = products;
	}
	
	// 3. �޼ҵ�
	@Override
	public int add(Product product) {
		boolean success = products.add(product);
		return success ? 1 : 0;
	}

	@Override
	public Product get(Product product) {
		return findProduct(product);
	}

	@Override
	public int set(Product product) {
		// Set �� ��������� api �� �����Ƿ� 
		// ���� �� remove �� add
		boolean rmSuccess = products.remove(product);
		boolean addSuccess = false;
		if (rmSuccess) {
			products.add(product);
			addSuccess = true;
		}
		return addSuccess ? 1 : 0 ;
	}

	@Override
	public int remove(Product product) {
		boolean success = products.remove(product);
		return success ? 1 : 0;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<Product>();
		
		for (Product product: this.products) {
			products.add(product);
		}
		
		return products;
	}


	private Product findProduct(Product product) {
		Product found = null;
		
		for (Product prod: products) {
			if (prod.equals(product)) {
				found = prod;
				break;
			}
		}
		
		return found;
	}
	
}


