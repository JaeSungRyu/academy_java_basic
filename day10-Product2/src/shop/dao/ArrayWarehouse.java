package shop.dao;

import java.util.Arrays;
import java.util.List;

import shop.vo.Product;

/**
 * ���忡�� �ǸŵǴ� ��ǰ���� ��Ƶδ� 
 * â�� �����ϴ� Ŭ����
 * ��ǰ ������ �����ϱ� ���Ͽ� �迭�� �����Ѵ�.
 * ------------------------------------------------------
 * ��ǰ���� �÷����ְų� �׿��ִ� â���� ������
 * �� â���� �����ϱ� ������ ������ �������(��ü����)��
 * �����ؾ� �Ѵ�.
 * ------------------------------------------------------
 * �޼ҵ�
 * 
 * set(Product product) : void
 *   ==> â�� �ִ� ��ǰ 1���� ������ �����ϴ� ���
 * 
 * get(Product product) : Product
 *   ==> â�� �ִ� ��ǰ 1���� ������ �������� ���
 * 
 * add(Product product) : void
 *   ==> â�� ����ǰ�� ���� �鿩���� ���
 *   
 * remove(Product product) : void  
 * �� �̻� �Ǹ����� �ʴ� ��ǰ�� ���
 * 
 * getAllProducts() : Product[] 
 * â�� ����ִ� ��ü ��ǰ ����� �������� ���
 * 
 * @author PC38206
 *
 */
public class ArrayWarehouse implements GeneralWarehouse {
	
	// 1. ��� ���� ����� : ��ǰ�� �׾Ƶ� �迭 ���� ����
	private Product[] products;	
	
	// 2. ������ �����
	/**
	 * �⺻ ������ : â�� ó�� ���� �� ��� ���� ������
	 * ����� �˷��ִ� ������
	 */
	public ArrayWarehouse() {
		// �ɼ� ���� â�� ������ ���� ���̸� 0���� ����ϴ�.
		this.products = new Product[0];
	}
	
	/**
	 * �Ű� ������ �ִ� ������
	 */
	public ArrayWarehouse(Product[] products) {
		this.products = products;
	}
	
	/** products �ʵ��� ������ */
	public Product[] getProducts() {
		return products;
	}

	/** products �ʵ��� ������ */
	public void setProducts(Product[] products) {
		this.products = products;
	}

	// 3. �޼ҵ� �����	
	public int add(Product product) {
		int addCnt = 0;
		int oldSize = this.products.length;
		
		// �̹� �����ϴ� �迭�� ũ�� + 1 ���̷� ����
		this.products = Arrays.copyOf(products
				                    , products.length + 1);
		
		int newSize = this.products.length;
		
		// ������ �ε����� �ű� ��ǰ ���� �Է�
		this.products[products.length - 1] = product;
		
		// �ű� �迭 ����� ���� �迭 ������� ũ��
		// �� ĭ�� �þ�� �߰��� �Ǿ��ٴ� ������ �����Ͽ�
		// addCnt �� 1 ������Ŵ
		if (newSize > oldSize) {
			addCnt++;
		}
		
		return addCnt;
	}
	
	public Product get(Product product) {
		return findProduct(product); 
	}
	
	public int set(Product product) {
		// ���� ���� �Ǽ�
		int setCnt = 0;
		// �����ϰ��� �ϴ� ��ǰ�� �ε���
		int setIndex = -1;
				
		if ((setIndex = findProductIdx(product)) > -1) {
			products[setIndex] = product;
			setCnt++;
		}
		
		// ���� ���� �Ǽ��� ����. 
		// ���� ������ �������� �ε��� ���Ͽ��� ������
		return setCnt;
	}
	
	public int remove(Product product) {
		// ���� ���� �Ǽ�
		int rmCnt = 0;
		// ����� ��ǰ�� ��ġ�ϴ� �ε���
		int rmIndex = -1;
		
		rmIndex = findProductIdx(product);
		
		// ���� �ȵ� ��ǰ�� ������ �� �迭
		Product[] newProducts;
		
		if (rmIndex > -1) {
			newProducts = new Product[this.products.length - 1];
			
			// 1. rmIndex �� �迭 �߰��� ��			
			if (rmIndex < (products.length - 1)) {
				// ������ ��ǰ ���ʱ��� ����
				for (int idx = 0; idx < rmIndex; idx++) {
					newProducts[idx] = products[idx];
				}
				
				// ������ ��ǰ ���ʺ��� ������ ����
				for (int idx = rmIndex; idx < newProducts.length; idx++) {
					newProducts[idx] = products[idx + 1];					
				}

			} else {
			// 2. rmIndex �� �迭 �������� ��
				for (int idx = 0; idx < products.length - 1; idx++) {
					newProducts[idx] = products[idx];
				}
			}
			
			rmCnt++;
			this.products = newProducts;
			
		} // outer if end
		
		// ���� ���� �Ǽ��� ����
		// ���� ���� �ε��� ���Ͽ��� ������
		return rmCnt;
		
	} // method remove end
	
	/**
	 * �迭(����)�� ����ִ� ��ǰ�� ��ü ������ �����ͼ�
	 * ����
	 * @return
	 */
	public List<Product> getAllProducts() {
		return Arrays.asList(this.products);
	}
	
	//------  private �޼ҵ�� �Ʒ��� ���� ����
	/**
	 * ã�� ��ǰ�� �ִ��� �˻��ϴ� �޼ҵ�
	 * @param product
	 * @return
	 */
	private Product findProduct(Product product) {
		Product found = null;
		for (Product prod: products) {
			// �迭(����)�� �����ϴ� ��ǰ ����(prod)��
			// �Ű������� �Ѱ��� ��ǰ ����(product)��
			// ��ġ�ϴ��� �� : prodCode �� ��
			if (prod.getProdCode().equals(product.getProdCode())) {
				found = prod;
				break;
			}
		}
		
		return found;
	}
	
	/**
	 * �Ű������� �Էµ� ��ǰ�� �迭(����) ���° ��ġ��
	 * �����ϴ��� �� �ε����� ã�´�.
	 * @param product
	 * @return
	 */
	private int findProductIdx(Product product) {
		// �迭�� �������� �ʴ� ������ �ʱ�ȭ
		int index = -1;
		
		for (int idx = 0; idx < products.length; idx++) {
			// �迭�� �ε������� ������ ��ǰ���� �Ѱ�
			// products[idx] �� ��ǰ�ڵ� �ʵ�(prodCode) ��
			// �Ű������� �Ѿ�� product �� ��ǰ�ڵ� �ʵ��
			// �������� ���ϰ� �׶��� �迭 �ε����� ����
			if (products[idx].getProdCode()
					.equals(product.getProdCode())) {
				index = idx;
				break;
			}
		}
		
		return index;
	}

}











