package mybatis.emp.test;

import static mybatis.emp.client.MybatisClient.getFactory;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.vo.Emp;;

/**
 * ��ȸ���� 1���� ����� �޴� ������ �׽�Ʈ
 * @author win10
 *
 */

public class MybatisEmpInsertTest {

	public static void main(String[] args) {
		//0.sqlSession Factory����
		SqlSessionFactory factory = getFactory();
		//1.sqlSession ���
		//DML �۾��� �� ���� ������ ���� �� ��
		//�ڹ� ���ø����̼ǿ��� commit�� �̷�� ������ �ؾ���
		//JDBC�� �⺻ auto-commit�̹Ƿ� �Ű� ���� ������
		//mybatis�� non auto-commit�̹Ƿ� auto-commit���� �����ؾ���
		
		//optionSession �޼ҵ��� �Ű� ������ true��
		//�����ؾ� auto-commit�� ��
		SqlSession session = factory.openSession(true);
		
		try {
			//2.���� ��ü�� ���ؼ� ���� ����
			
			//insert�� parameter����
			Emp emp = new Emp();
			emp.setEmpno(3334);
			emp.setEname("ȫ�浿");
			emp.setJob("����");
			
			//insert �����ϸ� emp��ü�� ����
			int addCnt = 
			session.insert("mybatis.emp.mapper.EmpMapper.insert",emp)  ;
			
			System.out.println("�Էµ� ���� ���� : " + addCnt);
		} finally {
			//3.���Ǵݱ�
			session.close();
		}
		//3.sqlSession�ݱ�
	}

}
