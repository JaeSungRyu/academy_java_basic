package book.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import book.dao.JdbcBookShelf;
import book.dao.ListBookShelf;
import book.dao.MapBookShelf;
import book.dao.SetBookShelf;
import book.vo.Book;

public class BookWarehouse {

	public static BookShelf getShelf(String type) {
		BookShelf shelf = null;

		if ("jdbc".equals(type)) {
			shelf = new JdbcBookShelf();
		
		} else if ("list".equals(type)) {
			List<Book> books = new ArrayList<>();
			shelf = new ListBookShelf();
		
		} else if ("set".equals(type)) {
			Set<Book> books = new HashSet<>();
			shelf = new SetBookShelf(); 
		} else if ("map".equals(type)) {
			Map<String,Book> books = new HashMap<>();
			shelf = new MapBookShelf(); 
		}
		

		return shelf;
	}

}
