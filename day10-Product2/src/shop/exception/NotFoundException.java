package shop.exception;

import shop.vo.Product;

/**
 * ����, ���� �۾� �� ��� ��ǰ�� ���� ��� 
 * �߻���ų ���ܸ� ������ Ŭ����
 * 
 * @author PC38206
 *
 */
public class NotFoundException extends Exception {

	public NotFoundException() {
		super("��ǰ ������ �������� �ʽ��ϴ�.");
	}
	
	public NotFoundException(String type, Product product) {
		super(String.format("%s:[%s] ��ǰ ������ �������� �ʽ��ϴ�."
		                   , type, product.getProdCode()));
	}
	
}






