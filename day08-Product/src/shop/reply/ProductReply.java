package shop.reply;

import shop.Product;

/**
 * �Ŵ����� �Ѱ��� ��ǰ������ ������ ���� ��
 * ����� ������ ���� 
 * @author win10
 *
 */
public class ProductReply implements Reply {

	@Override
	public void reply(Object object) {
		//object �� ������ ����� product Ÿ���ΰ���
		//Ȯ���ϴ�
		Product product = (Product)object;
		product.print();
		
	}

}
