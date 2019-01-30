package book.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.factory.BookShelf;
import book.vo.Book;

public class SetBookShelf implements BookShelf {
	private Set<Book> books;
	
	public SetBookShelf() {
		books = new HashSet<Book>();
	}
	
	public SetBookShelf(Set<Book> books) {
		super();
		this.books = books;
	}
	
	@Override
	public int insert(Book book) throws DuplicateException {
		boolean success = books.add(book);
		return success ? 1 : 0;
	}

	@Override
	public int update(Book book) throws NotFoundException {
		boolean rmSuccess = books.remove(book);
		boolean addSuccess = false;
		
		if(rmSuccess) {
			books.add(book);
			addSuccess = true;
		}
		return addSuccess ? 1 : 0;
	}

	@Override
	public int delete(Book book) throws NotFoundException {
		boolean Success = books.remove(book);
		return Success ? 1 : 0;
	}

	@Override
	public Book select(Book book) throws NotFoundException {
		
		return findBook(book);
	}

	@Override
	public List<Book> select() {
		List<Book>  books = new ArrayList<Book>();
	for (Book book : this.books) {
		books.add(book);
	} 
	return books;
}
	
	private Book findBook(Book book) {
		Book found = null;
		
		for (Book prod: books) {
			if (prod.equals(book)) {
				found = prod;
				break;
			}
		}
		
		return found;
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

	
