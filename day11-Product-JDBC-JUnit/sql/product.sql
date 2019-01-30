--product.sql--

--1.PRODUCT ���̺� ���� ����--



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
 ,regdate	DATE	DEFAULT	sysdate-- product.sql 
/*
Product adidas = new Product("S001", "���۽�Ÿ", 87200, 5);
*/
-- 1. PRODUCT ���̺� ���� ����
/* prodcode     VARCHAR2(4)
 * prodname     VARCHAR2(50)
 * price        NUMBER(12)
 * quantity     NUMBER(3)
 * regdate      DATE    DEFAULT sysdate
 * moddate      DATE
 * pk_product : prodcode
 */
CREATE TABLE PRODUCT 
(  prodcode     VARCHAR2(4)         
  ,prodname     VARCHAR2(50)            
  ,price        NUMBER(12)              
  ,quantity     NUMBER(3)               
  ,regdate      DATE    DEFAULT sysdate 
  ,moddate      DATE                    
  ,CONSTRAINT pk_product PRIMARY KEY (prodcode) 
);


-- 2. isExists() : ���� �����Ͱ� �����ϴ��� ����ȸ
SELECT p.PRODCODE
  FROM product p
 WHERE p.PRODCODE = ?

-- 3. add() : �ű� ��ǰ ���� ���
INSERT INTO PRODUCT(PRODCODE, PRODNAME, price, quantity)
VALUES (?, ?, ?, ?)

-- 4. get() : ��ǰ ���� ��ȸ
SELECT p.prodcode
     , p.prodname
     , p.price
     , p.quantity
  FROM product p
 WHERE p.prodcode = ?  


-- 5. set() : ��ǰ ���� ����
UPDATE product p
   SET p.PRODNAME = ?
     , p.PRICE = ?
     , p.QUANTITY = ?
     , p.MODDATE = sysdate
 WHERE p.PRODCODE = ?

-- 6. remove() : ��ǰ ���� ����
DELETE product p
 WHERE p.PRODCODE = ? 

 
 
 
 
 
 
 


 ,moddate	DATE
 ,constraint pk_product PRIMARY KEY(prodCode)
);

--2.isExists(): ���� ���̰� �����ϴ��� ����ȸ
SELECT e.EMPNO
    FROM emp e
 WHERE e.EMPNO = ?;
 
 --5.�����ϱ� ���� ����
  UPDATE PRODUCT
    SET PRODNAME = ?,PRICE = ?,QUANTITY = ?,
  WHERE PRODCODE = ?