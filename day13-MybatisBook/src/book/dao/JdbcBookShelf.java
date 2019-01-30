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
		System.err.println("드라이버 로드 오류");
		e.printStackTrace();  
		}
		
	}
	
	
	@Override
	public int insert(Book book) throws DuplicateException {
		if(isExists(book)) {
			throw new DuplicateException("추가",book);
		}
		
		
		int insertCnt = 0;
		Connection conn  = null;
		PreparedStatement pstmt = null;
		
		try {
			//1.드라이버 로드
			Class.forName(DRIVER);
			
			//2.커넥션
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			
			//3.쿼리 준비
			String sql = " INSERT INTO book(bookid,title,author,price,isbn,publish)"  
					+ 	 " VALUES (?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookId());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setInt(4, book.getPrice());
			pstmt.setString(5, book.getIsbn());
			pstmt.setString(6, book.getPublish());
			
			//4.쿼리 실행
			insertCnt = pstmt.executeUpdate();
			//5.결과처리
			
			//6.자원해제
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
			System.err.println("자원해제 오류");
			e.printStackTrace();
			}
		}
		return insertCnt;
	}

	@Override
	public int update(Book book) throws NotFoundException {
		//제품 존재 확인
		if (!isExists(book)) {
			throw new NotFoundException();
		}
		
		//0.필요한 객체생성
		int updateCnt = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		//1.드라이버 로드
		try {
			Class.forName(DRIVER);
		//2.커넥션 생성
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		//3.쿼리 준비
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
		//4.쿼리 생성
			pstmt.executeUpdate();
		//5.결과 처리
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//6.자원 해제
			try {
				if(pstmt != null) {
					pstmt.close();
				}if (conn != null) {
					conn.close();
				}	
			} catch (SQLException e) {
			System.err.println("자원 해제 오류");
			e.printStackTrace();
			}
			
		}
			return updateCnt;
	}	
		

		

	@Override
	public int delete(Book book) throws NotFoundException {
		//제품 존재 확인
				if (!isExists(book)) {
					throw new NotFoundException();
				}
				
				//0.필요한 객체생성
				int delCnt = 0;
				Connection conn = null;
				PreparedStatement pstmt = null;
				//1.드라이버 로드
				try {
					Class.forName(DRIVER);
				//2.커넥션 생성
					conn = DriverManager.getConnection(URL, USER, PASSWORD);
				//3.쿼리 준비
					String sql = "	   DELETE BOOK b "  
						+	     "     WHERE bookid = ?;";
					
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, book.getBookId());
					
				//4.쿼리 실행
					pstmt.executeUpdate();
				//5.결과 처리
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}catch (SQLException e) {
					e.printStackTrace();
				}catch (Exception e) {
					e.printStackTrace();
				}finally {
					//6.자원 해제
					try {
						if(pstmt != null) {
							pstmt.close();
						}if (conn != null) {
							conn.close();
						}	
					} catch (SQLException e) {
					System.err.println("자원 해제 오류");
					e.printStackTrace();
					}
					
				}
					return delCnt;
			}	

	@Override
	public Book select(Book book) throws NotFoundException {
		if(!isExists(book)) {
			throw new NotFoundException("조회",book);
		}
		//0.필요객체 선언
		ResultSet result = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		Book found = null;
		//1.드라이버 로드
		try {
		Class.forName(DRIVER);
		
			//2.커넥션 
		conn = DriverManager.getConnection(URL,USER,PASSWORD);
		
			//3.쿼리준비
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
			
			//4.쿼리 실행
			result = pstmt.executeQuery();
				
			//5.결과처리
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
			//6.자원 해제
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
			System.err.println("자원해제 오류");
			e.printStackTrace();
			}
		} 
		
		return found;
		
		
	}

	@Override
	public List<Book> select() {
		//0.필요객체 선언
		List<Book> books = new ArrayList<>();
		ResultSet result = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		//1.드라이버 로드
		try {
		Class.forName(DRIVER);
		
			//2.커넥션 
		conn = DriverManager.getConnection(URL,USER,PASSWORD);
		
			//3.쿼리준비
		String sql = "     SELECT b.BOOKID"  
			+	"           ,b.TITLE"  
			+	"           ,b.AUTHOR" 
			+	"           ,b.PRICE"  
			+	"           ,b.PUBLISH"  
			+	"           ,b.ISBN"  
			+	"       FROM BOOK b";  
				
			pstmt = conn.prepareStatement(sql);
			
			//4.쿼리 실행
			result = pstmt.executeQuery();
				
			
			
			//5.결과처리
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
			//6.자원 해제
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
			System.err.println("자원해제 오류");
			e.printStackTrace();
			}
		} 
		
		return books;

		
	}
	
	private boolean isExists(Book book) {
		boolean isExist = false;
		
		// 0. 필요객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;		

		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			
			// 2. 커넥션
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = "SELECT b.bookid" 
			           + "  FROM BOOK b" 
					   + " WHERE b.bookid = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookId());
			
			// 4. 쿼리 실행
			result = pstmt.executeQuery();
			
			// 5. 결과 처리
			while (result.next()) {
				// 조회 결과가 있다는 뜻은 동일 제품 코드가 등록되었음
				isExist = true;
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			// 6. 자원 해제
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
				System.err.println("자원 반납 오류!");
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
