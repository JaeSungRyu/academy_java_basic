package shop.view;

import shop.vo.Product;

/**
 * �Ŵ����� 1���� ��ǰ������ ������ ���� ��
 * ����� ������ ����
 * @author PC38206
 *
 */
public class ProductReply implements Reply {

	@Override
	public void reply(Object object) {
		// object �� ������ ����� Product Ÿ���� ����
		// Ȯ���ϴ� / instanceof ���� 
		Product product = (Product)object;
		product.print();

	}

}







