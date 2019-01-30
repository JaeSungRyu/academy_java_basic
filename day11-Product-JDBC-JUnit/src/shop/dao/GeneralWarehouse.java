package shop.dao;

import java.util.List;

import shop.exception.DuplicateException;
import shop.exception.NotFoundException;
import shop.vo.Product;

/**
 * ��ǰ�� �����ϱ� ���� â���� ����� 
 * ������ �������̽�
 * @author PC38206
 *
 */
public interface GeneralWarehouse {

	/**
	 * Product ���� 1���� �߰��� <br/>
	 * -----------------------------------------------------<br/>
	 * �߰��ϴ� �������� �߰��� ��ǰ�� �̹� �����ϸ� 0�� �����ϰ�<br/>
	 * ���� �����Ͱ� �������� �ʾ� �߰��� �����ϸ� 1�� ������ <br/>
	 * ------------------------------------------------------<br/>
	 * @param product : �߰��� ��ǰ ����<br/>
	 * @return 0 : ������ �����Ͱ� �����ϴ� ��� �߰� ���� <br/>
	 * 		   1 : �߰� ����<br/>
	 */
	public abstract int add(Product product) throws DuplicateException;
	
	/**
	 * Product ���� 1���� ��ȸ��<br/>
	 * ------------------------------------------------------------------<br/>
	 * @param product : ��ȸ�� ��ǰ������ �ڵ尪(prodCode)�� ����ִ� ��ü<br/>
	 * @return �Ű������� �Էµ� product �� ������ ��ǰ����<br/>
	 *         null : ��ȸ�� ��ǰ������ �������� ����<br/>
	 */
	public abstract Product get(Product product) throws NotFoundException;
	
	/**
	 * Product 1���� ������ ������<br/>
	 * �����ϴ� �������� ������ ��ǰ �ε�����<br/> 
	 * -1 ���� ũ�� ���� ������ ��� <br/>
	 * ���� ������ �ǹ��ϴ� 1�� ����<br/>
	 * ----------------------------------------------------------------------<br/>
	 * @param product : ������ ��ǰ������ �ڵ尪(prodCode)�� ����ִ� ��ü<br/>
	 * @return 0 : ������ ��ǰ ������ �������� �ʾƼ� ������<br/>
	 *         1 : ���� ������ <br/>
	 */
	public abstract int set(Product product) throws NotFoundException;
	
	/**
	 * Product 1���� ������ ������<br/>
	 * �����ϴ� �������� ������ �ε�����<br/> 
	 * -1 ���� ũ�� ���� ������ ��� <br/>
	 * ���� ������ �ǹ��ϴ� 1�� ����<br/>
	 * ----------------------------------------------------------------------<br/>
	 * @param product : ������ ��ǰ������ �ڵ尪(prodCode)�� ����ִ� ��ü<br/>
	 * @return 0 : ������ ��ǰ ������ �������� �ʾƼ� ������<br/>
	 *         1 : ���� ������<br/>
	 */
	public abstract int remove(Product product) throws NotFoundException;
	
	/**
	 * ��ü ��ǰ ����� List<Product> Ÿ������ �ٲپ� �����Ѵ�.<br/>
	 * ������ � �ڷᱸ���� �����ϴ����� �߿����� ����.<br/>
	 * @param ��ü ��ǰ ���<br/>
	 */
	public abstract List<Product> getAllProducts();
}





