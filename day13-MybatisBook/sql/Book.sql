--데이터 추가 DML
INSERT INTO book(bookid,title,author,price,isbn,publish,redate,moddate) 
VALUSE(?,?,?,?,?,?,?,?);

--데이터 수정
UPDATE book b
   SET b.TITLE = ?
      ,b.AUTHOR = ?
      ,b.PRICE = ?
      ,b.ISBN = ?
      ,b.PUBLISH ?
      ,B.REGDATE = sysdate
 WHERE b.bookid = ?;
 
 --데이터 제거
 	 DELETE BOOK b 
     WHERE bookid = ?;