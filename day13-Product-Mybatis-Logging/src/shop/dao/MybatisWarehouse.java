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
		// �߰��� ��� ��ǰ�� �ִ��� �� ��ȸ
		if (isExists(product)) {
			throw new DuplicateException("�߰�", product);
		}
		
		// 1. SqlSession ��� : DML �۾��� auto-commit�� Ȱ��ȭ
		SqlSession session = factory.openSession(true);
		int addCnt = 0;
		
		// 2. Mapper �������̽� ��ü�� session���� ���
		ProductMapper mapper;
		mapper = session.getMapper(ProductMapper.class);
		
		try {
			// 3. mapper�� ���Ͽ� ���� ����
			addCnt = mapper.insert(product);
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return addCnt;
	}

	@Override
	public Product get(Product product) throws NotFoundException {
		// ��ȸ�� ��� ��ǰ�� �ִ��� �� ��ȸ
		if (!isExists(product)) {
			throw new NotFoundException("��ȸ", product);
		}
		
		// 1. SqlSession ��� : DQL �۾��� 
		//                      non-auto-commit ���� �����ص� �������.
		SqlSession session = factory.openSession(false);
		Product found = null;
		
		// 2. Mapper �������̽� ��ü�� session���� ���
		ProductMapper mapper;
		mapper = session.getMapper(ProductMapper.class);
		
		try {
			// 3. mapper�� ���Ͽ� ���� ����
			found = mapper.selectOne(product);
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return found;
	}

	@Override
	public int set(Product product) throws NotFoundException {
		// ������ ��� ��ǰ�� �ִ��� �� ��ȸ
		if (!isExists(product)) {
			throw new NotFoundException("����", product);
		}
		
		// 1. SqlSession ��� : DML �۾��� auto-commit�� Ȱ��ȭ
		SqlSession session = factory.openSession(true);
		int setCnt = 0;
		
		// 2. Mapper �������̽� ��ü�� session���� ���
		ProductMapper mapper;
		mapper = session.getMapper(ProductMapper.class);
		
		try {
			// 3. mapper�� ���Ͽ� ���� ����
			setCnt = mapper.update(product);
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return setCnt;
	}

	@Override
	public int remove(Product product) throws NotFoundException {
		// ������ ��� ��ǰ�� �ִ��� �� ��ȸ
		if (product != null && !isExists(product)) {
			throw new NotFoundException("����", product);
		}
		
		// 1. SqlSession ��� : DML �۾��� auto-commit�� Ȱ��ȭ
		SqlSession session = factory.openSession(true);
		int rmCnt = 0;
		
		// 2. Mapper �������̽� ��ü�� session���� ���
		ProductMapper mapper;
		mapper = session.getMapper(ProductMapper.class);
		
		try {
			// 3. mapper�� ���Ͽ� ���� ����
			rmCnt = mapper.delete(product);
		} finally {
			if (session != null) {
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







