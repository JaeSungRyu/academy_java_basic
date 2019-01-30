package book.dao;

import java.util.List;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

public interface BookShelf {
	
	//�߰��� ���� �������̽�
	public abstract int insert(Book book)throws DuplicateException;
	
	//������ ���� �������̽�
	public abstract int upadate(Book book)throws NotFoundException;
	
	//������ ���� �������̽�
	public abstract int delete(Book book)throws NotFoundException;
	
	//��ȸ�� ���� �������̽�
	public abstract Book select(Book book)throws NotFoundException;
	
	//��ü ��ȸ�� ���� �������̽�
	public abstract List<Book> select();
	
	
	
}
