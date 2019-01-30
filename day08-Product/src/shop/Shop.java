package shop;

import java.util.List;

/**
 * ������ �Ǹ��ϴ� ������ ��Ÿ���� Ŭ����
 * ���忡�� ���� �ǸŸ� ���Ͽ� �ּ� 1����
 * �Ŵ����� �־�� �Ѵ�.
 * @author PC38206
 *
 */
public class Shop {
	
	// 1. ��� ���� ����� : ������ ������ �Ŵ��� �ּ� 1��
	private Manager manager;
	
	// 2. ������ �����
	// (1) �⺻ ������
	public Shop() {
		manager = new Manager();
	}
	
	// (2) �Ű������� �ִ� ������
	public Shop(Manager manager) {
		this.manager = manager;
	}
	
	// manager �ʵ��� ������ / ������ ����
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	// 3. �޼ҵ� �����
	/**
	 * ���忡 �ű� ��ǰ�� ������ ���
	 * �Ŵ������� �� ��ǰ�� â�� ����ش޶� ��Ź��
	 * @param product
	 */
	public void add(Product product) {
		manager.add(product);
	}
	
	/**
	 * ���忡�� �Ǹ��ϴ� ��ǰ ������ ������ �ʿ��� ��
	 * �Ŵ������� ��ǰ ���� ������ ��Ź��
	 * @param product
	 */
	public void set(Product product) {
		manager.set(product);
	}

	/**
	 * ���忡�� �� �̻� �Ǹ����� ���� ������ ��⸦
	 * �Ŵ������� ��Ź��
	 * @param product
	 */
	public void remove(Product product) {
		manager.remove(product);
	}
	
	/**
	 * ���忡 ã�ƿ� ������ �Ǹ��� ������
	 * â���� ������ �޶�� �Ŵ������� ��Ź��
	 * @param product
	 * @return
	 */
	public void get(Product product) {
		manager.get(product);
	}
	
	/**
	 * ���忡�� �Ǹŵ� �� �ִ� ��� ��ǰ�� ������
	 * �Ŵ������� ��Ź��
	 * @return
	 */
	public void getAllProducts() {
		manager.getAllProducts();
	}
	
}

