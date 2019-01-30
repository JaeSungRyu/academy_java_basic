package book.exception;

import book.vo.Book;

public class NotFoundException extends Exception {
 
	//�Ű������� ���� ������
	public NotFoundException() {
		super("��ǰ������ �������� �ʽ��ϴ�");
	}
	
	public NotFoundException(String type,Book book) {
		String.format("%s[%s]��ǰ������ �������� �ʽ��ϴ�.", type, book.getBookId());
	}
}
