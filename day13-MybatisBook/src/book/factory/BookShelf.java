package book.factory;

import java.util.List;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

/**
 * å(Book) ������ ������ å���� ��Ÿ���� �������̽�  
 * @author PC38206
 *
 */
public interface BookShelf {

	/**
	 * �Ű������� ���޵� book ���� 1���� �űԷ� �߰���<br/> 
	 * @param book : �űԷ� �߰��� å ������ ���� ��ü<br/>
	 * @return �߰��� å ������ ����<br/> �߰� ������ 1 ����<br/>
	 * @throws DuplicateException �̹� ������ ���̵� ���� å������ ��ϵǾ��ִ� ��� �߻�<br/>
	 */
	int insert(Book book) throws DuplicateException;
	
	/**
	 * �Ű������� ���޵� book ���� 1���� ������<br/>
	 * @param book : ������ å ������ ���� ��ü<br/>
	 * @return ������ å ������ ����<br/> ���� ������ 1 ����<br/>
	 * @throws NotFoundException �����Ϸ��� ���̵� �ش��ϴ� å������ ���� ��� �߻�<br/>
	 */
	int update(Book book) throws NotFoundException;
	
	/**
	 * �Ű������� ���޵� book ���� 1���� ������<br/>
	 * @param book : ������ å ������ ���� ��ü<br/>
	 * @return ������ å ������ ����<br/> ���� ������ 1 ����<br/>
	 * @throws NotFoundException �����Ϸ��� ���̵� �ش��ϴ� å������ ���� ��� �߻�<br/>
	 */
	int delete(Book book) throws NotFoundException;
	
	/**
	 * �Ű������� ���޵� book ���� 1���� ����ȸ ��<br/>
	 * @param book : ��ȸ�� å�� ���̵� ��� �ִ� ��ü<br/>
	 * @return ��ȸ�� å�� ��ü �� ������ ���� ��ü
	 * @throws NotFoundException ��ȸ�Ϸ��� ���̵� �ش��ϴ� å������ ���� ��� �߻�<br/>
	 */
	Book select(Book book) throws NotFoundException;
	
	/**
	 * ��ϵǾ� �ִ� å ��ü ����� ��ȸ
	 * @return ��ü å ���
	 */
	List<Book> select();
	
	/**
	 * �Ű������� ���޵� ������(low) ���� �ְ�(high) ������ ���ݴ뿡 �ش��ϴ�<br/>
	 * å�� �˻��Ͽ� ������� �����Ѵ�
	 * @param low  : �˻����� ������
	 * @param high : �˻����� �ְ�
	 * @return ���� ���ǿ� �´� å�� ���
	 */
	List<Book> select(int low, int high);
	
	/**
	 * �Ű������� ���޵� �˻���(keyword)�� ���� ���Ե�<br/> 
	 * å�� �˻��Ͽ� ������� �����Ѵ�
	 * @param keyword : �˻���
	 * @return �˻� ���ǿ� �´� å�� ���
	 */
	List<Book> select(String keyword);
	
	/**
	 * ��ϵ� å�� ������ �����Ѵ�
	 * @return ��ϵ� å�� ����
	 */
	int totalCount();
	
}

