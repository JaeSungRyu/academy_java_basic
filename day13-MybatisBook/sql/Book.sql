--������ �߰� DML
INSERT INTO book(bookid,title,author,price,isbn,publish,redate,moddate) 
VALUSE(?,?,?,?,?,?,?,?);

--������ ����
UPDATE book b
   SET b.TITLE = ?
      ,b.AUTHOR = ?
      ,b.PRICE = ?
      ,b.ISBN = ?
      ,b.PUBLISH ?
      ,B.REGDATE = sysdate
 WHERE b.bookid = ?;
 
 --������ ����
 	 DELETE BOOK b 
     WHERE bookid = ?;