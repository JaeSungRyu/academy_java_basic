package book.dao;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.factory.BookShelf;
import book.vo.Book;

public class MapBookShelf implements BookShelf {
	//1.멤버변수 선언 
	Map<String, Book> books;
	
	//2.생성자
	//(1)기본생성자
	public MapBookShelf() {
		super();
		books = new HashMap<>();
	}
	
	//매개변수를 받는 생성자
	public MapBookShelf(Map<String, Book> books) {
		super();
		this.books = books;
	}
	
	@Override
	public int insert(Book book) throws DuplicateException {
		int addCnt = 0;
		
		if(!isExists(book)) {
			books.put(book.getBookId(), book);
			addCnt++;
		}else {
			//같은객체 존재
			throw new DuplicateException();
		}return addCnt;
	
	}

	@Override
	public int update(Book book) throws NotFoundException {
		int updateCnt = 0;
		
		if(isExists(book)) {
			books.replace(book.getBookId(), book);
		}else {
			throw new NotFoundException("update",book);
		}return updateCnt;
	}

	@Override
	public int delete(Book book) throws NotFoundException {
		int delCnt = 0;
		
		if (isExists(book)) {
			books.remove(book.getBookId());
			delCnt++;
		}else {
			throw new NotFoundException("delete",book);
		}return delCnt;
	}

	@Override
	public Book select(Book book) throws NotFoundException {
		Book found = null;
		
		if(isExists(book)) {
			found = books.get(book.getBookId());
		}else {
			throw new NotFoundException("get",book);
		}return found;
	}

	@Override
	public List<Book> select() {
		Collection<Book> collection = books.values();
		Book[] bookArr = new Book[collection.size()];
		
		return Arrays.asList(collection.toArray(bookArr));
	}

	private boolean isExists(Book book) {
		return books.containsKey(book.getBookId());
	}

	@Override
	public List<Book> select(int low, int high) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> select(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int totalCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
