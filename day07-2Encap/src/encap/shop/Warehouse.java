package encap.shop;

import java.util.Arrays;

/**
 * ���忡�� �ǸŵǴ� ��ǰ���� ��Ƶδ� â�� �����ϴ� Ŭ���� ��ǰ������ �����ϱ� ���� �迭�� �����Ѵ�.
 * -------------------------------------- ��ǰ���� �÷����ְų� �׿��ִ� â���� ������ �� â���� �����ϱ�
 * ������ ������ ��������� �����ؾ� �Ѵ�. -------------------------------------- �޼ҵ� set(Product
 * prod) : void ==>â�� �ִ� ��ǰ 1���� ������ �����ϴ� ���
 * 
 * print() : void ==>â�� �ִ� ��ǰ 1���� ������ ����ϴ� ���
 * 
 * add(Product prod) : void ==>â�� ����ǰ �鿩���� ���
 * 
 * remove(Product prod) : void �� �̻� �Ǹ����� �ʴ� ��ǰ�� ���
 * 
 * getAllProduct() : Product[] â�� ����ִ� ��ü ��ǰ ����� �������� ���
 * 
 * 
 * â�� ����ִ� ��ü ��ǰ ����� ����ϴ� ��� â�� �ִ� ��ǰ 1���� ������ �����ϴ� ��� ����ǰ�� ���� �鿩���� ��� �� �̻�
 * �Ǹ����� �ʴ� ����� ��� â�� �ִ� ��ǰ 1���� ������ ����ϴ� ���
 * 
 * @author win10
 * 
 */
public class Warehouse {
	// 1.������� ����� : ��ǰ�� �׾Ƶ� �迭 ��������
	Product[] products;

	// 2.������ �����
	/*
	 * �⺻ ������ : â�� ó�� ���� �� ��� ���� ������ ����� �˷��ִ� ������*
	 */
	Warehouse() {
		// �ɼǾ��� â�� ������ ���� ���̸� 0���� ����ϴ�
		this.products = new Product[0];
	}

	// �Ű������� �ִ� ������
	Warehouse(Product[] products) {
		this.products = products;
	}

	// 3.�޼ҵ� �����
	/**
	 * ��ǰ ���� ���� �������� �߰� ��ǰ ���� ũ�⸦ 1���� ��Ű�鼭 �߰�
	 * 
	 * @param prod
	 */
	public void add(Product prod) {
		// �̹� �����ϴ� �迭�� ũ�� + 1 ���̷� ����
		this.products = Arrays.copyOf(products, products.length + 1);
		// ������ �ε����� �ű� ��ǰ ���� �Է�
		this.products[products.length - 1] = prod;
	}

	/**
	 * �Ķ���ͷ� ���޵� ��0���� ��ġ�ϴ� ��ǰ�� �ִ��� �˻��Ͽ�(prodCode �ʵ尡 ������ ���� ��ǰ���� ó��) ��ġ�ϴ� ��ǰ�� ������ ��
	 * ��ǰ������ ���� ������ null�� ����
	 * 
	 * @return
	 */
	public Product get(Product prod) {
		return findProduct(prod);
	}

	/**
	 * �Ű������� �Ѱ��� ��ǰ ������ ��ġ�ϴ� ��ǰ�ڵ带 ���� ��ǰ�� ���� �Էµ� ������ �����Ͽ� ������
	 * 
	 * @param prod
	 * @return
	 */
	public void set(Product prod) {
		int setIndex = -1;
		if ((setIndex = findProductIdx(prod)) > -1) {
			products[setIndex] = prod;
		}

	}

	/**
	 * �Ǹ����� ���� ��ǰ ������ ���
	 * 
	 * @param prod
	 */
	public void remove(Product prod) {
		// ����� ��ǰ�� ��ġ�ϴ� �ε���
		int rmIndex = -1;
		rmIndex = findProductIdx(prod);

		// ���� �ȵ� ��ǰ�� ������ �� �迭
		Product[] newProducts;
		if (rmIndex > -1) {
			newProducts = new Product[this.products.length];
			// 1.rmIndex�� �迭 �߰��� ��
			if (rmIndex < (products.length - 1)) {

				// ������ ��ǰ �� �ʱ��� ����
				for (int idx = 0; idx < rmIndex; idx++) {
					newProducts[idx] = products[idx];
				}
				// ������ ��ǰ �� �ʺ��� ������
				for (int idx = rmIndex; idx < newProducts.length; idx++) {
					newProducts[idx] = products[idx + 1];
				}

			} else {
				// 2.rmIndex�� ������ �� ��
				for (int idx = 0; idx < products.length - 1; idx++) {
					newProducts[idx] = products[idx];
				}
			}
			this.products = newProducts;

		}//outer if end
	}// method remove ��

	/**
	 * �迭�� ��� �մ� ��ǰ�� ��ü ������ �����ͼ� ����
	 * 
	 * @return
	 */
	public Product[] getAllProducts() {
		return this.products;
	}

	/**
	 * ã�� ��ǰ�� �ִ��� �˻��ϴ� �޼ҵ�
	 * 
	 * @param prod
	 * @return
	 */
	private Product findProduct(Product prod) {
		Product finded = null;
		for (Product prods : products) {
			// �迭�� �����ϴ� ��ǰ ����(prod)��
			// �Ű������� �Ѱ��� ��ǰ����(product)��
			// ��ġ�ϴ��� �� : prodCode�� ��
			if (prods.prodCode.equals(prod.prodCode)) {
				finded = prod;
				break;
			}
		}
		return finded;
	}

	/**
	 * �Ű������� �Էµ� ��ǰ�� �迭 ���° ��ġ�� �����ϴ��� �� �ε����� ã�´�.
	 * 
	 * @param product
	 * @return
	 */
	private int findProductIdx(Product prod) {
		int index = -1;

		for (int idx = 0; idx < products.length; idx++) {
			if (products[idx].prodCode.equals(prod.prodCode)) {
				index = idx;
				break;
			}
		}
		return index;
	}
	// �迭�� �������� �ʴ� ������ �ʱ�ȭ
}
