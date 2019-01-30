package shop.view;

import java.util.List;

import shop.vo.Product;

/**
 * ��ǰ ��ü ����� �����ִ� ���� ������
 * ������ ����
 * @author PC38206
 *
 */
public class ListReply implements Reply {

	@Override
	public void reply(Object object) {
		// object �� ��ǰ���� ����� �Ѿ�´�.
		List<Product> products = (List<Product>)object;
		for (Product product: products) {
			product.print();
		}

	}

}








