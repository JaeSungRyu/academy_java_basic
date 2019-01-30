package book.vo;

public class Book {

	private String bookId;
	private String title;
	private String author;
	private int price;
	private String isbn;
	private String publish;
	 
	public Book() {
		
	}
	public Book(String bookId) {
		this.bookId = bookId;
	}
	public Book(String bookId,String title) {
		this(bookId); 
	 	this.title = title;
	}
	public Book(String bookId,String title,String author) {
		this(bookId,title); 
		this.author = author;
	}
	public Book(String bookId,String title,String author,int price) {
		this(bookId,title,author); 
		this.price = price;
	}
	public Book(String bookId,String title,String author,int price
			   ,String isbn) {
		this(bookId,title,author,price); 
		this.isbn = isbn;
	}
	public Book(String bookId,String title,String author,int price
			,String isbn,String publish) {
		this(bookId,title,author,price,isbn); 
		this.publish = publish;
	
		//수정자, 접근자
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public void print() {
		System.out.printf("제품 정보 [책아이디 : %s, 책 제목 : %s, 저자명 : %s" 
				         + ", 가격 %d: ,ISBN : %s ,출판사 : %s]%n"
				         , bookId,title,author,price,isbn,publish );
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		String bookStr = String.format("책아이디 : %s , 책 제목 : %s, 저자명 : %s, 가격 : %d, ISBN : %s, 출판사 : %s"
				, bookId,title,author,price,isbn,publish); 
		return bookStr;
	}
	
	

}
