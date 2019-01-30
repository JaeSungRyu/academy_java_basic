package book.exception;

import book.vo.Book;

public class NotFoundException extends Exception {
 
	//매개변수가 없는 생성자
	public NotFoundException() {
		super("제품정보가 존재하지 않습니다");
	}
	
	public NotFoundException(String type,Book book) {
		String.format("%s[%s]제품정보가 존재하지 않습니다.", type, book.getBookId());
	}
}
