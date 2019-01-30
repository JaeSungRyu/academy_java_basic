package book.dao;

import java.util.ArrayList;

import java.util.List;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

public class ListBookShelf implements BookShelf {
	
	//������� ����
	private List<Book> books;
	
	//������ �ʱ�ȭ
	
	//�⺻������
	public ListBookShelf() {
		books = new ArrayList<>();
	}
	
	//�Ű������� �ִ� ������
	public ListBookShelf(List<Book> books) {
		this.books = books;
	}
	
	//������ ������ ����
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
	
	/*
	 * �߰��ϴ� �������� �߰��� ��ǰ�� �̹� �����ϸ� 0�� �����ϰ�<br/>
	 * ���� �����Ͱ� �������� �ʾ� �߰��� �����ϸ� 1�� ������ <br/>
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
	 * Product 1���� ������ ������<br/> �����ϴ� �������� ������ ��ǰ �ε�����<br/> -1 ���� ũ�� ���� ������ ��� <br/>
	 * ���� ������ �ǹ��ϴ� 1�� ����<br/>
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
	 * product : ��ȸ�� ��ǰ������ �ڵ尪(prodCode)�� ����ִ� ��ü<br/>
	 * �Ű������� �Էµ� product �� ������ ��ǰ����<br/>
	 *         null : ��ȸ�� ��ǰ������ �������� ����<br/>
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

	// ����Ʈ �ȿ� ã������ ��ǰ�� �ε����� ���ϴ� ���� �޼ҵ�
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

