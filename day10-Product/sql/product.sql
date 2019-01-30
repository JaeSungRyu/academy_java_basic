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
 ,regdate	DATE	DEFAULT	sysdate
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