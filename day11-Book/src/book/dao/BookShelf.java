package book.dao;

import java.util.List;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

public interface BookShelf {
	
	//추가를 위한 인터페이스
	public abstract int insert(Book book)throws DuplicateException;
	
	//수정을 위한 인터페이스
	public abstract int upadate(Book book)throws NotFoundException;
	
	//삭제를 위한 인터페이스
	public abstract int delete(Book book)throws NotFoundException;
	
	//조회를 위한 인터페이스
	public abstract Book select(Book book)throws NotFoundException;
	
	//전체 조회를 위한 인터페이스
	public abstract List<Book> select();
	
	
	
}
