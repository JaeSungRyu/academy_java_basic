-- day12-JDBC-Callable

--Customer ���̺��� ���� �� �۾�
--�����ϴ� ��ü ���� drop

drop table customer;
drop procedure sp_insert_customer;
drop sequence seq_cust_userid;

DROP TABLE CUSTOMER;

--1.Customer table DDL
 CREATE TABLE customer
 (userid    VARCHAR2(4)
 ,name      VARCHAR2(15) NOT NULL
 ,birthyear NUMBER(4)
 ,address   VARCHAR2(50)
 ,phone     VARCHAR2(13)
 ,grade     VARCHAR2(6) DEFAULT  'SILVER'
 ,regdate   DATE
 ,moddate   DATE
 ,CONSTRAINT pk_customer_userid PRIMARY KEY (userid)
 ,CONSTRAINT ck_customer_grade CHECK(grade IN ('SILVER','GOLD','VIP'))
 );
 
--2.SEQ_CUST_sequence DDL
CREATE SEQUENCE seq_cust_userid
START WITH 1
NOCYCLE;

--3.SP_INSERT_CUSTOMER procedure DDL
CREATE OR REPLACE PROCEDURE SP_INSERT_CUSTOMER
( v_name        IN customer.name%TYPE
, v_address     IN customer.address%TYPE
, v_phone       IN customer.phone%TYPE
, v_msg         OUT VARCHAR2
)
IS
    -- �űԷ� �ڵ� �����Ǵ� �������̵� ������ ����
    v_new_userid    customer.userid%TYPE;
    
BEGIN
    -- ���� ���̵� �ڵ� ����
    v_new_userid := 'C' || LPAD(seq_cust_userid.nextval, 3, '0');
    
    -- ������ ���̵�, �Ű������� �Էµ� �̸�, �ּ�, ��ȭ��ȣ�� INSERT
    INSERT INTO customer(userid, name, address, phone)
    VALUES (v_new_userid, v_name, v_address, v_phone)
    ;
    
    -- Ŀ��
    commit;
    
    -- ����� ���̵� �� ���� ���� ��� �޽��� �ۼ�
    v_msg := v_new_userid || ':' || v_name || ' ������ ����Ǿ����ϴ�.';
    
END SP_INSERT_CUSTOMER;
/

SELECT * FROM CUSTOMER;

set serveroutput on

show errors

        SELECT e.empno
            , e.ename
            , e.job
            , e.hiredate
           , e.comm
           , e.mgr
           , e.sal
           , e.deptno
        FROM emp e
        where e.empno = #{}
        
INSERT INTO emp e(e.EMPNO, e.ENAME, e.HIREDATE, e.JOB)
VALUES()
;
select * from emp;


DELETE PRODUCT;


SELECT * FROM PRODUCT;

DROP TABLE PRODUCT;

CREATE TABLE PRODUCT 
(  prodcode     VARCHAR2(4)         
  ,prodname     VARCHAR2(50)            
  ,price        NUMBER(12)              
  ,quantity     NUMBER(3)               
  ,regdate      DATE    DEFAULT sysdate 
  ,moddate      DATE                    
  ,CONSTRAINT pk_product PRIMARY KEY (prodcode) 
);

desc book;
desc product;
select * from book;

INSERT INTO BOOK(bookid, title, author, price,isbn, publish) 
VALUES ('bk001', '������ �ٴ�', '����', 26450, 'ajs578221','â�̷�');

select * from book;
delete book;
drop table book;



                UPDATE book b  
					   SET b.TITLE = '���ΰ� �ٴ�' 
                          ,b.AUTHOR = '���'  
					      ,b.PRICE = 24560  
					      ,b.ISBN = 'tuis22'  
					      ,b.PUBLISH = 'asdd'
					 WHERE b.bookid = 'bk001';
                     
                     
                     commit;
                     
                     
                     select * from product;
                     delete product;
                     
                     drop table product;