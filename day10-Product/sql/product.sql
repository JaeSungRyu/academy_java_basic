--product.sql--

--1.PRODUCT 테이블 생성 구문--



/**
 *prodCode	NUMBER(4);
 *prodname	VARCHAR2(50);
 *price		NUMBER(12);
 *quantity	NUMBER(3); 
 *regdate	DATE	DEFAULT	sysdate
 *moddate	DATE
 *pk_product : prodCode
 *
 */
 
 
CREATE TABLE PRODUCT(
  prodCode	NUMBER(4)
 ,prodname	VARCHAR2(50)
 ,price		NUMBER(12)
 ,quantity	NUMBER(3) 
 ,regdate	DATE	DEFAULT	sysdate
 ,moddate	DATE
 ,constraint pk_product PRIMARY KEY(prodCode)
);

--2.isExists(): 동일 데이가 존재하는지 선조회
SELECT e.EMPNO
    FROM emp e
 WHERE e.EMPNO = ?;
 
 --5.수정하기 위한 쿼리
  UPDATE PRODUCT
    SET PRODNAME = ?,PRICE = ?,QUANTITY = ?,
  WHERE PRODCODE = ?