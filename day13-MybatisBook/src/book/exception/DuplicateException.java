package book.exception;

import book.vo.Book;

public class DuplicateException extends Exception {

	//매개변수가 없는 
	public DuplicateException() {
		super("제품정보가 중복되었습니다.");
	}
	
	//매개변수가 있는
	public DuplicateException(String type, Book book) {
		super(String.format("%s[%s]의 값이 중복되었습니다.", type,book.getBookId()));
	}
}
