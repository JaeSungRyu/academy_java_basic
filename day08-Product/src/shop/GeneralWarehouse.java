package shop;

import java.util.List;

/**
 * ��ǰ�� �����ϱ� ���� â���� ����� 
 * ������ �������̽�
 * @author PC38206
 *
 */
public interface GeneralWarehouse {

	public abstract int add(Product product);
	public abstract Product get(Product product);
	public abstract int set(Product product);
	public abstract int remove(Product product);
	public abstract List<Product> getAllProducts();
}





