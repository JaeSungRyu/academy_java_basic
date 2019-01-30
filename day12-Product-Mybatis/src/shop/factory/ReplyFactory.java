package shop.factory;

import shop.view.ErrorReply;
import shop.view.ListReply;
import shop.view.MessageReply;
import shop.view.ProductReply;
import shop.view.Reply;

/**
 * �Ŵ����� Ư�� ������ �� ��,
 * ���� ��ü�� Reply Ÿ������ �����ϴ� Ŭ����
 * @author PC38206
 *
 */
public class ReplyFactory {

	public static Reply getReply(String type) {
		Reply reply = null;
		
		if ("list".equals(type)) {
			reply = new ListReply();
			
		} else if ("message".equals(type)) {
			reply = new MessageReply();
			
		} else if ("error".equals(type)) {
			reply = new ErrorReply();
			
		} else if ("single".equals(type)) {
			reply = new ProductReply();
		}
		
		return reply;
	}
}












