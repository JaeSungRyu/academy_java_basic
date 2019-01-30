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
				new Book("bk001","모스크바의 신사","에이모 토울스",16200,"fsda254635","현대문학");
		   
		Book why =
				new Book("bk002","왜 나는 널 사랑하는가","알랭 드 보통",10800,"jdpe254848","청미래");
		
		Book cat =
				new Book("bk003","cat","베르나르 베르베르",11520,"type98554","열린책들");
		 
		
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
