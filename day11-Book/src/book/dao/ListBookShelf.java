package book.dao;

import java.util.ArrayList;

import java.util.List;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

public class ListBookShelf implements BookShelf {
	
	//멤버변수 선언
	private List<Book> books;
	
	//생성자 초기화
	
	//기본생성자
	public ListBookShelf() {
		books = new ArrayList<>();
	}
	
	//매개변수가 있는 생성자
	public ListBookShelf(List<Book> books) {
		this.books = books;
	}
	
	//접근자 수정자 생성
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
	
	/*
	 * 추가하는 과정에서 추가할 제품이 이미 존재하면 0을 리턴하고<br/>
	 * 동일 데이터가 존재하지 않아 추가에 성공하면 1을 리턴함 <br/>
	 */
	@Override
	public int insert(Book book) throws DuplicateException {
		int index = findbookIdx(book);
		int addCnt = 0;
		
		if(index == -1) {
			books.add(book);
			addCnt++;
		}else {
			throw new DuplicateException("insert",book);
		}
		return addCnt;
	}

	
	/*
	 * Product 1개의 정보를 수정함<br/> 수정하는 과정에서 수정할 제품 인덱스가<br/> -1 보다 크게 나와 성공한 경우 <br/>
	 * 수정 성공을 의미하는 1을 리턴<br/>
	 *
	 */
	@Override
	public int upadate(Book book) throws NotFoundException {
		int updateIndex = findbookIdx(book);
		int updateCnt = 0;
		
		if(updateIndex > -1) {
			books.set(updateIndex, book);
			updateCnt++;
		}else {
			throw new NotFoundException("update",book);
		}
		return updateCnt;
	}

	@Override
	public int delete(Book book) throws NotFoundException {
		int delIndex = findbookIdx(book);
		int delCnt = 0;
		
		if(delIndex > -1) {
			books.remove(delIndex);
			delCnt++;
		}else {
			throw new NotFoundException();
		}
		return delCnt;
	}
	/*
	 * product : 조회할 제품정보의 코드값(prodCode)만 담고있는 객체<br/>
	 * 매개변수로 입력된 product 와 동일한 제품정보<br/>
	 *         null : 조회할 제품정보가 존재하지 않음<br/>
	 */
	@Override
	public Book select(Book book) throws NotFoundException {
		int selecIndex = findbookIdx(book);
		Book found = null;
		
		if(selecIndex > -1) {
			found = books.get(selecIndex);
		}else {
			throw new NotFoundException();
		}
		return found;
	}

	@Override
	public List<Book> select() {
		return this.books;
	}

	// 리스트 안에 찾으려는 제품의 인덱스를 구하는 지원 메소드
	private int findbookIdx(Book book) {
		int index = -1;

		for (int idx = 0; idx < books.size(); idx++) {
			if (books.get(idx).equals(book)) {
				index = idx;
				break;
			}
		}
		
		return index;
	}

}

