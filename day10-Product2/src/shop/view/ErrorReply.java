package shop.view;

/**
 * ã�� ��ǰ�� ���ų� �ϴ� ���� 
 * ������ ��Ȳ�� ���� ������ ����
 * @author PC38206
 *
 */
public class ErrorReply implements Reply {

	@Override
	public void reply(Object object) {
		// ������ ��Ȳ�� ������ String Ÿ���� �߻�
		String errorMsg = (String)object;
		System.err.println(errorMsg);
	}

}

