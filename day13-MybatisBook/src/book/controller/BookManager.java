package book.controller;

import static book.factory.BookViewFactory.getBookView;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.factory.BookShelf;
import book.view.BookView;
import book.vo.Book;

/**
 * �������� å�� �����ϴ� �Ŵ����� �����ϴ� Ŭ����
 * @author PC38206
 *
 */
public class BookManager {
	
	// 1. ��� ���� ����
	/** �������� å�� �žƵδ� å�� */
	private BookShelf books;
	
	/** �Ŵ����� ��� ��� */
	private BookView view;

	// 2. ������ ����
	public BookManager() {
		
	}

	public BookManager(BookShelf books) {
		this.books = books; 
	}
	
	// 3. �޼ҵ� ���� 
	public void insert(Book book) {
		String message = "";
		
		try {
			books.insert(book);
			message = String.format("[�߰�]:å[%s:%s] ���� �߰� ����"
					               , book.getBookId(), book.getTitle());			
			view = getBookView("message");
			
		} catch (DuplicateException e) {
			message = e.getMessage();
			view = getBookView("error");
		}
		 
		view.display(message);
	}
	
	public void update(Book book) {
		String message = "update";
		
		try {
			books.update(book);
			message = String.format("[����]:å[%s:%s] ���� ���� ����"
					, book.getBookId(), book.getTitle());			
			view = getBookView("message");
			
		} catch (NotFoundException e) {
			message = e.getMessage();
			view = getBookView("error");
		}
		
		view.display(message);
	}
	
	public void delete(Book book) {
		String message = "";
		
		try {
			books.delete(book);
			message = String.format("[����]:å[%s:%s] ���� ���� ����"
					, book.getBookId(), book.getTitle());			
			view = getBookView("message");
			
		} catch (NotFoundException e) {
			message = e.getMessage();
			view = getBookView("error");
		}
		
		view.display(message);
	}
	
	public void select(Book book) {		
		try { 
			view = getBookView("single");
			view.display(books.select(book));
			
		} catch (NotFoundException e) {
			view = getBookView("error");
			view.display(e.getMessage());
		}
	}
	
	public void select() {
		view = getBookView("list");
		view.display(books.select());
	}

	public void select(int low, int high) {
		view = getBookView("list");
		view.display(books.select(low, high));
	}
	
	public void select(String keyword) {
		view = getBookView("list");
		view.display(books.select(keyword));
	}
	
	public void totalCount() {
		view = getBookView("message");
		view.display("��ϵ� ��ü å ����:" + books.totalCount());
	}

}

