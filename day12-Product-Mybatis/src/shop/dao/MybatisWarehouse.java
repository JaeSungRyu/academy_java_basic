package shop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import shop.exception.DuplicateException;
import shop.exception.NotFoundException;
import shop.mapper.ProductMapper;
import shop.mybatis.MybatisClient;
import shop.vo.Product;

public class MybatisWarehouse implements GeneralWarehouse {
	
	private SqlSessionFactory factory;
	
	public MybatisWarehouse() {
		factory = MybatisClient.getFactory(); 
	}

	@Override
	public int add(Product product) throws DuplicateException {
		if (isExists(product)) {
			throw new DuplicateException("�߰�",product);
		}
		
		//1.SqlSession���� : DML�۾��� auto-commit�� Ȱ��ȭ
		SqlSession session  = factory.openSession(true);
		int inCnt = 0;
		
		//2.Mapper �������̽� ��ü�� session���� ���
		ProductMapper mapper;
		mapper = session.getMapper(ProductMapper.class);
		try {
			inCnt = mapper.insert(product);
		} catch (Exception e) {

		}finally {
			if(session != null) {
				session.close();
			}
		}
		
		return inCnt;

	}

	@Override
	public Product get(Product product) throws NotFoundException {
		if (!isExists(product)) {
			throw new NotFoundException("��ȸ",product);
		}
		
		//1.SqlSession���� : DQL�۾���
//							non-auto-commit���� �����ص� �������
		SqlSession session  = factory.openSession(false);
		Product found = null;
		
		//2.Mapper �������̽� ��ü�� session���� ���
		ProductMapper mapper;
		mapper = session.getMapper(ProductMapper.class);
		try {
			product = mapper.selectOne(product);
		} catch (Exception e) {

		}finally {
			if(session != null) {
				session.close();
			}
		}
		
		return found;

	}

	@Override
	public int set(Product product) throws NotFoundException {
		if (!isExists(product)) {
			throw new NotFoundException("����",product);
		}
		
		//1.SqlSession���� : DML�۾��� auto-commit�� Ȱ��ȭ
		SqlSession session  = factory.openSession(true);
		int setCnt = 0;
		
		//2.Mapper �������̽� ��ü�� session���� ���
		ProductMapper mapper;
		mapper = session.getMapper(ProductMapper.class);
		try {
			setCnt = mapper.update(product);
		} catch (Exception e) {

		}finally {
			if(session != null) {
				session.close();
			}
		}
		
		return setCnt;
	
	}

	@Override
	public int remove(Product product) throws NotFoundException {
		//������ ��� ��ǰ�� �ִ��� ����ȸ
		if (!isExists(product)) {
			throw new NotFoundException("����",product);
		}
		
		//1.SqlSession���� : DML�۾��� auto-commit�� Ȱ��ȭ
		SqlSession session  = factory.openSession(true);
		int rmCnt = 0;
		
		//2.Mapper �������̽� ��ü�� session���� ���
		ProductMapper mapper;
		mapper = session.getMapper(ProductMapper.class);
		try {
			rmCnt = mapper.deleteOne(product);
		} catch (Exception e) {

		}finally {
			if(session != null) {
				session.close();
			}
		}
		
		return rmCnt;
	}

	@Override
	public List<Product> getAllProducts() {
		// 1. SqlSession ���
		SqlSession session = factory.openSession();
		
		// 2. Mapper �������̽� ��ü�� session���� ���
		ProductMapper mapper;
		mapper = session.getMapper(ProductMapper.class);
		
		List<Product> products = null;
		
		try {
			// 3. mapper �� ���Ͽ� ��ȸ
			products = mapper.selectAll();
		} finally {
			// 4. session �ݱ�
			if (session != null)
				session.close();
		}
		
		return products;
	}
	
	
	// isExists ���� �޼ҵ� �ۼ�
	private boolean isExists(Product product) {
		boolean isExists = false;
		
		// 1. SqlSession ���
		SqlSession session = factory.openSession();
		
		// 2. Mapper �������̽� ��ü�� session���� ���
		ProductMapper mapper;
		mapper = session.getMapper(ProductMapper.class);
		
		// 3. mapper ��ü�� �޼ҵ� ȣ��� ���� ����
		try {
			String prodCode = mapper.isExists(product);
			if (prodCode != null) {
				isExists = true;
			}
		} finally {
			// 4. session �ݱ�
			if (session != null)
				session.close();
		}
		
		return isExists;
	}
}







