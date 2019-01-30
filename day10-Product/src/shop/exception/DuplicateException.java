package shop.exception;

import shop.vo.Product;

/**
 * �ű� �Է� �� ��, ��ǰ ������ 
 * �ߺ������� ��� �߻���ų ���ܸ� ������ Ŭ����
 * 
 * @author PC38206
 *
 */
public class DuplicateException extends Exception {

	// �⺻ ������
	public DuplicateException() {
		super("��ǰ ������ �ߺ��Ǿ����ϴ�.");
	}
	
	// �Ű������� �ִ� ������
	public DuplicateException(String type, Product product) {
		super(String.format("%s:[%s] ��ǰ ������ �ߺ��Ǿ����ϴ�."
				          , type, product.getProdCode()));
		
	}
}







