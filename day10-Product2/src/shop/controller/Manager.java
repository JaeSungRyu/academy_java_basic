package shop.controller;

import java.util.List;

import shop.dao.ArrayWarehouse;
import shop.dao.GeneralWarehouse;
import shop.exception.DuplicateException;
import shop.exception.NotFoundException;
import shop.view.ErrorReply;
import shop.view.ListReply;
import shop.view.MessageReply;
import shop.view.ProductReply;
import shop.view.Reply;
import shop.vo.Product;

/**
 * â��(Warehouse)�� ����ϴ�
 * ���� �Ŵ����� ��Ÿ���� Ŭ����
 * ------------------------------------------------
 * ���� �Ŵ�����
 * 1. ��ǰ�� â�� ����ϰų�
 * 2. â���� ������ ���ų�
 * 3. �����̳� ���������� �����ϰų�
 * 4. �� �̻� �Ǹ����� ���� ������ ��� �ϴ�
 * 
 * ���� �۾��� â���� ����
 * -------------------------------------------------
 * ���� ���� : �Ŵ����� �츮 ������ â�� ��� �ִ���
 *             �˰� �־�� �Ѵ�.
 * -------------------------------------------------
 * @author PC38206
 *
 */
public class Manager {
	
	// 1. ��� ���� �����
	// �۾��� â�� ���� ����
	private GeneralWarehouse warehouse;
	// �۾��� ���信 ���� ����
	private Reply reply;
	
	// 2. ������ �����
	// (1) �Ŵ��� �⺻ ������
	public Manager() {
		warehouse = new ArrayWarehouse();
	}
	
	// (2) �Ű������� �ִ� �Ŵ��� ������
	public Manager(GeneralWarehouse warehouse) {
		this.warehouse = warehouse;
	}
	
	// warehouse �ʵ��� ������ / ������ 
	public GeneralWarehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(GeneralWarehouse warehouse) {
		this.warehouse = warehouse;
	}

	// 3. �޼ҵ� �����
	/**
	 * �Ŵ����� ��ǰ �Ѱ��� â��� �����
	 * â�� ����� �� �� �ִ�
	 * @param product
	 */
	public void add(Product product) {
		int addCnt = 0;
		String message = null;
		
		try {
			addCnt = warehouse.add(product);
			
			message = String.format("��ǰ ����[%s]�߰��� �����Ͽ����ϴ�."
					, product.getProdCode());
			
			reply = new MessageReply();
				
		} catch (DuplicateException e) {
			message = String.format("��ǰ ����[%s]�߰��� �����Ͽ����ϴ�."
					, product.getProdCode());
			
			reply = new ErrorReply();
			e.printStackTrace();
			
		} finally {
			// ��ǰ �߰��� ���ܰ� �߻� �ص�, ���ص�
			// ��ǰ �߰��� ���� �޽����� ��µǾ�� �ϹǷ�
			// finally ��Ͽ� �ۼ�
			reply.reply(message);
			
		}
		
		
	}
	
	/**
	 * �Ŵ����� ��ǰ �Ѱ��� â��� �����
	 * â�� �ִ� ��ǰ ������ ������ �� �ִ�.
	 * @param product
	 */
	public void set(Product product) {
		int setCnt = 0;
		String message = null;
		
		try {
			setCnt = warehouse.set(product);
			
			message = String.format("��ǰ ����[%s]������ �����Ͽ����ϴ�."
					, product.getProdCode());
			
			reply = new MessageReply();
			
		} catch (NotFoundException e) {
			message = String.format("��ǰ ����[%s]������ �����Ͽ����ϴ�."
					, product.getProdCode());
			
			reply = new ErrorReply();
			e.printStackTrace();
			
		} finally {
			reply.reply(message);
			
		}
		
		
	}
	
	/**
	 * �Ŵ����� â�� ���� �� �̻� ���� �ʾ� �����
	 * ��ǰ ������ ������ �� �ִ�.
	 * �� ��, ������ ��ǰ�� ������ �˰� �־�� �Ѵ�.
	 * @param product
	 */
	public void remove(Product product) {
		int rmCnt = 0;
		String message = null;
		
		try {
			rmCnt = warehouse.remove(product);
			
			message = String.format("��ǰ ����[%s]������ �����Ͽ����ϴ�."
					, product.getProdCode());
			
			reply = new MessageReply();
			
		} catch (NotFoundException e) {
			message = String.format("��ǰ ����[%s]������ �����Ͽ����ϴ�."
					, product.getProdCode());
			
			reply = new ErrorReply();
			
		} finally {
			reply.reply(message);
			
		}
		
		
	}
	
	/**
	 * �Ŵ����� â�� ���� ��û�� ��ǰ �Ѱ���
	 * ������ �� �� �ִ�.
	 * @param product
	 * @return
	 */
	public void get(Product product) {
		Product found;
		
		try {
			found = warehouse.get(product);
			
			reply = new ProductReply();
			reply.reply(found);
			
		} catch (NotFoundException e) {
			reply = new ErrorReply();
			reply.reply("ã�� ��ǰ["
					+ product.getProdCode()
					+"]��(��) �������� �ʽ��ϴ�.");
			e.printStackTrace();
			
		}
		
	}
	
	
	/**
	 * �Ŵ����� ���� â�� ��ϵǾ� �����ִ� 
	 * ��ǰ ���� ��ü ����� ��ȸ�� �� �ִ�
	 * @return
	 */
	public void getAllProducts() {
		List<Product> products = warehouse.getAllProducts();
		reply = new ListReply();
		reply.reply(products);
	}
	
}








