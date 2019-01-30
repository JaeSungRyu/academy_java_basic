package shop;

import java.util.List;

import shop.reply.ErrorReply;
import shop.reply.ListReply;
import shop.reply.MessageReply;
import shop.reply.Reply;

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
	private GeneralWarehouse warehouse;
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
		int addCnt = warehouse.add(product);
		String message = null;
		
		if(addCnt > 0) {
			//�߰� ������ ���
			message = String.format("��ǰ����[%s]�߰��� �����Ͽ����ϴ�", product.getProdCode());
			reply = new MessageReply();
			reply.reply(message);
		}else {
			//�߰� ������ ���
			message = String.format("��ǰ����[%s]�߰��� �����Ͽ����ϴ�", product.getProdCode());
			reply = new ErrorReply();
			reply.reply(message);
		}
		reply.reply(message);
	}
	
	/**
	 * �Ŵ����� ��ǰ �Ѱ��� â��� �����
	 * â�� �ִ� ��ǰ ������ ������ �� �ִ�.
	 * @param product
	 */
	public void set(Product product) {
		int setIdx = warehouse.set(product);
		String message = null;
		
		if(setIdx > -1) {
			//������ ������ ���
			message = String.format("��ǰ����[%s]������ �����Ͽ����ϴ�", product.getProdCode());
			reply = new MessageReply();
			reply.reply(message);
		}else {
			//������ ������ ���
			message = String.format("��ǰ����[%s]������ �����Ͽ����ϴ�", product.getProdCode());
			reply = new ErrorReply();
			reply.reply(message);

		}
		reply.reply(message);
	}
	
	/**
	 * �Ŵ����� â�� ���� �� �̻� ���� �ʾ� �����
	 * ��ǰ ������ ������ �� �ִ�.
	 * �� ��, ������ ��ǰ�� ������ �˰� �־�� �Ѵ�.
	 * @param product
	 */
	public void remove(Product product) {
		int reIdx = warehouse.remove(product);
		String message = null;
		
		if(reIdx > 0) {
			//�߰� ������ ���
			message = String.format("��ǰ����[%s]������ �����Ͽ����ϴ�", product.getProdCode());
			reply = new MessageReply();
			reply.reply(message);
		}else {
			//�߰� ������ ���
			message = String.format("��ǰ����[%s]������ �����Ͽ����ϴ�", product.getProdCode());
			reply = new ErrorReply();
			reply.reply(message);
		}
		reply.reply(message);
	}	
	
	/**
	 * �Ŵ����� â�� ���� ��û�� ��ǰ �Ѱ���
	 * ������ �� �� �ִ�.
	 * @param product
	 * @return
	 */
 Product get(Product product) {
		return warehouse.get(product);
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

