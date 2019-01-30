package book.factory;

import book.view.BookView;
import book.view.ErrorView;
import book.view.ListView;
import book.view.MessageView;
import book.view.SingleView;

/**
 * �Ŵ����� ä���� �Ϻ� ��ü ������ ���������� �ϴ� Ŭ����
 * @author PC38206
 *
 */
public class BookViewFactory {

	public static BookView getBookView(String type) {
		BookView view = null;
		
		if ("list".equals(type)) {
			view = new ListView();
		} else if ("single".equals(type)) {
			view = new SingleView();
		} else if ("message".equals(type)) { 
			view = new MessageView();
		} else if ("error".equals(type)) {
			view = new ErrorView(); 
		}
		
		return view;
	} 
}

