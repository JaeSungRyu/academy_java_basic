package book.exception;

import book.vo.Book;

public class DuplicateException extends Exception {

	//�Ű������� ���� 
	public DuplicateException() {
		super("��ǰ������ �ߺ��Ǿ����ϴ�.");
	}
	
	//�Ű������� �ִ�
	public DuplicateException(String type, Book book) {
		super(String.format("%s[%s]�� ���� �ߺ��Ǿ����ϴ�.", type,book.getBookId()));
	}
}
