package shop.view;

/**
 * �Ŵ����� ��ǰ ������ ���, ����, ����
 * �� �� ������ ����� ������ ����
 * @author PC38206
 *
 */
public class MessageReply implements Reply {

	@Override
	public void reply(Object object) {
		// ������ ����� ���� == String Ÿ��
		String message = (String)object;
		System.out.println(message);
	}

}







