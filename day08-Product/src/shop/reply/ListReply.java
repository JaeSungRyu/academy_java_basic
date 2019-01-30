package shop.reply;

import java.util.List;

import shop.Product;

/**
 * ��ǰ ��ü ����� �����ִ� ���� ������
 * ������ ����
 * @author win10
 *
 */
public class ListReply implements Reply {

	@Override
	public void reply(Object object) {
		//object �� ��ǰ���� ����� �Ѿ�´�.
		List<Product> products = (List<Product>)object;
		for (Product product : products) {
			product.print();
		}
		
	}

}
