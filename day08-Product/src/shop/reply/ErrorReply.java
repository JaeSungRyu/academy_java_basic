package shop.reply;
/**
 * ã�� ��ǰ�� ���ų� �ϴ� ���� 
 * ������ ��Ȳ�� ���� ������ ����
 * @author win10
 *
 */
public class ErrorReply implements Reply {

	@Override
	public void reply(Object object) {
		//������ ��Ȳ�� ������ String Ÿ���� �߻�
		String errorMsg = (String)object;
		System.err.println(errorMsg);
		
	}

}
