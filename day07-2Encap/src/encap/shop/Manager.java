package encap.shop;
/**
 * â��(Warehouse)�� ����ϴ�
 * ���� �Ŵ����� ��Ÿ���� Ŭ����
 * ---------------------------------------------
 * ���� �Ŵ����� 
 * 1.��ǰ�� â�� ����� �ϰų�
 * 2.â���� ������ ���ų�
 * 3.�����̳� ���������� �����ϰų�
 * 4.���̻� �Ǹ����� ���� ������ ���
 * 
 * ���� �۾��� â���� ����
 * ---------------------------------------------
 * �������� : �Ŵ����� �츮 ������ â�� ����ִ��� �˾ƾ� �Ѵ�.
 * ---------------------------------------------
 * 
 * @author win10
 *
 */

public class Manager {
	//1.��� ���� �����'
	Warehouse warehouse;
	//2.������ �����
	//(1)�Ŵ��� �⺻ ������
	Manager(){
		warehouse = new Warehouse();
	}
	//(2)�Ű������� �ִ� �Ŵ��� ������
	Manager(Warehouse warehouse){
		this.warehouse = warehouse;
	}
	
	//3.�޼ҵ� �����
	/**
	 * �Ŵ����� ��ǰ �Ѱ��� â��� ����� 
	 * â�� ����� �Ҽ� �ִ�
	 * @param prod
	 */
	public void add(Product prod) {
		warehouse.add(prod);
	}
	/**
	 * �Ŵ����� ��ǰ�Ѱ��� â��� �����
	 * â�� �ִ� ��ǰ ������ ������ �� �ִ�
	 * @param prod
	 */
	public void set(Product prod) {
		warehouse.set(prod);
	}
	/**
	 *  �Ŵ����� â�� ���� �� �̻� ���� �ʾ� �����
	 *  ��ǰ ������ ������ �� �ִ�.
	 *  �� ��, ������ ��ǰ�� ������ �˰� �־�� �Ѵ�
	 * @param prod
	 */
	public void remove(Product prod) {
		warehouse.remove(prod);
	}
	/*
	 * �Ŵ����� â�� ���� ��û�� ��ǰ �Ѱ��� 
	 * ������ ���� ���
	 */
	public Product get(Product prod) {
		return warehouse.get(prod);
	}
	/**
	 * �Ŵ����� ���� â�� ��ϵǾ� �����մ�
	 * ��ǰ ���� ��ü ����� ��ȸ�� �� �ִ�.
	 * @return
	 */
	public Product[] getAllProducts() {
		return warehouse.getAllProducts();
	}
}
