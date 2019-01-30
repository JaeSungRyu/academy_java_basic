package book.test;

import static book.factory.BookWarehouse.getShelf;

import book.controller.BookManager;
import book.factory.BookShelf;
import book.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		BookShelf shelf = getShelf("jdbc");
//		BookShelf shelf = getShelf("list");
//		BookShelf shelf = getShelf("set");
//		BookShelf shelf = getShelf("map");
		
		
		
		BookManager manager = new BookManager(shelf);
		 
		Book moscow =
				new Book("bk001","��ũ���� �Ż�","���̸� ��ｺ",16200,"fsda254635","���빮��");
		   
		Book why =
				new Book("bk002","�� ���� �� ����ϴ°�","�˷� �� ����",10800,"jdpe254848","û�̷�");
		
		Book cat =
				new Book("bk003","cat","�������� ��������",11520,"type98554","����å��");
		 
		
//		manager.insert(moscow); 
//		manager.insert(why); 
//		manager.insert(cat);
//		
//		manager.select();
		manager.select(cat);
		
//		manager.delete(cat);
//		manager.delete(why);
//		manager.delete(moscow);
		
		
	}

}
