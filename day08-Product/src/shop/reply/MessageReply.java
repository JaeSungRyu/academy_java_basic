package shop.reply;
/**
 * �Ŵ����� ��ǰ ������ ���,����,����
 * �� �� ������ ����� ������ ����
 * @author win10
 *
 */
public class MessageReply implements Reply {

	@Override
	public void reply(Object object) {
		//������ ����� ���� == String Ÿ��
		String message = (String)object;
		System.out.println(message);
		
	}

}
