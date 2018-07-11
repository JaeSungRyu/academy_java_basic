package shop;
/**
 * ������ �Ǹ��ϴ� ������ ��Ÿ���� Ŭ����
 * ���忡�� ���� �ǸŸ� ���Ͽ� �ּ� 1����
 * �Ŵ����� �־�� �Ѵ�.
 * @author win10
 *
 */

import javax.print.attribute.standard.RequestingUserName;

public class Shop {
	//1.��� ���� ����� : ������ ������ �Ŵ��� �ּ� 1��
	Manager manager;
	//2.������ �����
	//(1)�⺻ ������
	Shop(){
		manager = new Manager();
	}
	//(2)�Ű������� �ִ� ������
	Shop(Manager manager){
		this.manager = manager;
	}
	//3.�޼ҵ� �����
	/**
	 * ���忡 �ű� ��ǰ�� ������ ���
	 * �Ŵ������� ��Ź�Ͽ� �� ��ǰ�� â�� ����ش޶� ��Ź��
	 * @param prod
	 */
	public void add(Product prod) {
		manager.add(prod);
	}
	/**
	 * ���忡�� �Ǹ��ϴ� ��ǰ ������ ������ �ʿ��Ҷ�
	 * �Ŵ������� ��ǰ���� ������ ��Ź��
	 * @param prod
	 */
	public void set(Product prod) {
		manager.set(prod);
	}
	/**
	 * ���忡�� �� �̻� �Ǹ����� ���� ������ ��⸦
	 * �Ŵ������� ��Ź��
	 * @param prod
	 */
	public void remove(Product prod) {
		manager.remove(prod);
	}
	/**
	 * ���忡 ã�ƿ� ������ �Ǹ��� ������
	 * â���� ������ �޶�� �Ŵ������� ��Ź��
	 * @param prod
	 * @return
	 */
	public Product get(Product prod) {
		return manager.get(prod);
	}
	/**
	 * �Ŵ����� ��ü ��ǰ����� ��ȸ�� �� �ִ�
	 * @return
	 */
	public Product[] getAllProducts() {
		return manager.getAllProducts();
	}
		
}
