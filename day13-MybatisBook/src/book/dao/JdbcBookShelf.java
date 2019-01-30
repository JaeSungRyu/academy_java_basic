package book.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.factory.BookShelf;
import book.vo.Book;

public class JdbcBookShelf implements BookShelf {
	
	private static final String URL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";

	public JdbcBookShelf() {
	
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
		System.err.println("����̹� �ε� ����");
		e.printStackTrace();  
		}
		
	}
	
	
	@Override
	public int insert(Book book) throws DuplicateException {
		if(isExists(book)) {
			throw new DuplicateException("�߰�",book);
		}
		
		
		int insertCnt = 0;
		Connection conn  = null;
		PreparedStatement pstmt = null;
		
		try {
			//1.����̹� �ε�
			Class.forName(DRIVER);
			
			//2.Ŀ�ؼ�
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			
			//3.���� �غ�
			String sql = " INSERT INTO book(bookid,title,author,price,isbn,publish)"  
					+ 	 " VALUES (?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookId());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setInt(4, book.getPrice());
			pstmt.setString(5, book.getIsbn());
			pstmt.setString(6, book.getPublish());
			
			//4.���� ����
			insertCnt = pstmt.executeUpdate();
			//5.���ó��
			
			//6.�ڿ�����
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		} catch (SQLException e) {
		e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
					
			} catch (SQLException e) {
			System.err.println("�ڿ����� ����");
			e.printStackTrace();
			}
		}
		return insertCnt;
	}

	@Override
	public int update(Book book) throws NotFoundException {
		//��ǰ ���� Ȯ��
		if (!isExists(book)) {
			throw new NotFoundException();
		}
		
		//0.�ʿ��� ��ü����
		int updateCnt = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		//1.����̹� �ε�
		try {
			Class.forName(DRIVER);
		//2.Ŀ�ؼ� ����
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		//3.���� �غ�
			String sql = "UPDATE book b"  
				+	"   SET b.TITLE = ?"  
				+	"      ,b.AUTHOR = ?"  
				+	"      ,b.PRICE = ?"  
				+	"      ,b.ISBN = ?"  
				+	"      ,b.PUBLISH = ?"
				+	" WHERE b.bookid = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setInt(3, book.getPrice());
			pstmt.setString(4, book.getIsbn());
			pstmt.setString(5, book.getPublish());
			pstmt.setString(6, book.getBookId());
		//4.���� ����
			pstmt.executeUpdate();
		//5.��� ó��
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//6.�ڿ� ����
			try {
				if(pstmt != null) {
					pstmt.close();
				}if (conn != null) {
					conn.close();
				}	
			} catch (SQLException e) {
			System.err.println("�ڿ� ���� ����");
			e.printStackTrace();
			}
			
		}
			return updateCnt;
	}	
		

		

	@Override
	public int delete(Book book) throws NotFoundException {
		//��ǰ ���� Ȯ��
				if (!isExists(book)) {
					throw new NotFoundException();
				}
				
				//0.�ʿ��� ��ü����
				int delCnt = 0;
				Connection conn = null;
				PreparedStatement pstmt = null;
				//1.����̹� �ε�
				try {
					Class.forName(DRIVER);
				//2.Ŀ�ؼ� ����
					conn = DriverManager.getConnection(URL, USER, PASSWORD);
				//3.���� �غ�
					String sql = "	   DELETE BOOK b "  
						+	     "     WHERE bookid = ?;";
					
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, book.getBookId());
					
				//4.���� ����
					pstmt.executeUpdate();
				//5.��� ó��
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}catch (SQLException e) {
					e.printStackTrace();
				}catch (Exception e) {
					e.printStackTrace();
				}finally {
					//6.�ڿ� ����
					try {
						if(pstmt != null) {
							pstmt.close();
						}if (conn != null) {
							conn.close();
						}	
					} catch (SQLException e) {
					System.err.println("�ڿ� ���� ����");
					e.printStackTrace();
					}
					
				}
					return delCnt;
			}	

	@Override
	public Book select(Book book) throws NotFoundException {
		if(!isExists(book)) {
			throw new NotFoundException("��ȸ",book);
		}
		//0.�ʿ䰴ü ����
		ResultSet result = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		Book found = null;
		//1.����̹� �ε�
		try {
		Class.forName(DRIVER);
		
			//2.Ŀ�ؼ� 
		conn = DriverManager.getConnection(URL,USER,PASSWORD);
		
			//3.�����غ�
		String sql = "     SELECT b.BOOKID"  
			+	"           ,b.TITLE"  
			+	"           ,b.AUTHOR" 
			+	"           ,b.PRICE"  
			+	"           ,b.PUBLISH"  
			+	"           ,b.ISBN"  
			+	"       FROM BOOK b"  
			+	"      WHERE b.BOOKID = ?";	
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookId());
			
			//4.���� ����
			result = pstmt.executeQuery();
				
			//5.���ó��
			while(result.next()) {
				String bookId = result.getString(1);
				String title = result.getString(2);
				String author = result.getString(3);
				int price = result.getInt(4);
				String publish = result.getString(5);
				String isbn = result.getString(6);
				
				found = new Book(bookId,title,author,price
						        ,publish,isbn);
			} 
			//6.�ڿ� ����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(result != null) {
					result.close();
				}if(pstmt != null) {
					pstmt.close();
				}if(conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
			System.err.println("�ڿ����� ����");
			e.printStackTrace();
			}
		} 
		
		return found;
		
		
	}

	@Override
	public List<Book> select() {
		//0.�ʿ䰴ü ����
		List<Book> books = new ArrayList<>();
		ResultSet result = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		//1.����̹� �ε�
		try {
		Class.forName(DRIVER);
		
			//2.Ŀ�ؼ� 
		conn = DriverManager.getConnection(URL,USER,PASSWORD);
		
			//3.�����غ�
		String sql = "     SELECT b.BOOKID"  
			+	"           ,b.TITLE"  
			+	"           ,b.AUTHOR" 
			+	"           ,b.PRICE"  
			+	"           ,b.PUBLISH"  
			+	"           ,b.ISBN"  
			+	"       FROM BOOK b";  
				
			pstmt = conn.prepareStatement(sql);
			
			//4.���� ����
			result = pstmt.executeQuery();
				
			
			
			//5.���ó��
			while(result.next()) {
				String bookId = result.getString(1);
				String title = result.getString(2);
				String author = result.getString(3);
				int price = result.getInt(4);
				String publish = result.getString(5);
				String isbn = result.getString(6);
				
				Book book = new Book(bookId,title,author,price
						        ,publish,isbn);
				
				books.add(book);
				
			} 
			//6.�ڿ� ����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(result != null) {
					result.close();
				}if(pstmt != null) {
					pstmt.close();
				}if(conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
			System.err.println("�ڿ����� ����");
			e.printStackTrace();
			}
		} 
		
		return books;

		
	}
	
	private boolean isExists(Book book) {
		boolean isExist = false;
		
		// 0. �ʿ䰴ü ����
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;		

		try {
			// 1. ����̹� �ε�
			Class.forName(DRIVER);
			
			// 2. Ŀ�ؼ�
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. ���� �غ�
			String sql = "SELECT b.bookid" 
			           + "  FROM BOOK b" 
					   + " WHERE b.bookid = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookId());
			
			// 4. ���� ����
			result = pstmt.executeQuery();
			
			// 5. ��� ó��
			while (result.next()) {
				// ��ȸ ����� �ִٴ� ���� ���� ��ǰ �ڵ尡 ��ϵǾ���
				isExist = true;
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			// 6. �ڿ� ����
			try {
				if (result != null) {
					result.close();
				}
				if (pstmt != null) {
					pstmt.close();					
				}
				if (conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				System.err.println("�ڿ� �ݳ� ����!");
				e.printStackTrace();
				
			}
		}
		
		return isExist;
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
