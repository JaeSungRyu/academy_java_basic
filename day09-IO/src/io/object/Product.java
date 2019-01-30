package io.object;

import java.io.Serializable;

/**
 * ��ǰ �Ǹ� ���忡�� �����ϴ� �����
 * ��ǰ�� �����ϴ� Ŭ����
 * ----------------------------
 * ��ü ����� �����ϱ� ���ؼ��� ��ü ����ȭ�� �ʿ���
 * java.io.Serializable �������̽��� �����ϵ��� �Ǿ�����.
 *
 * java.io.Serializable �������̽��� ��ü ����ȭ�� �����ϴ�
 * �������̽��� �����ؾ� �� �޼ҵ带 ������ ���� �ʴ�.
 * 
 *
 * 
 * @author win10
 *
 */
public class Product implements Serializable{
	
	// 1. ��� ���� �����
	/** ��ǰ �ڵ� */
	private String prodCode;
	/** ��ǰ �� */
	private String prodName;
	/** ��ǰ ���� */
	private int price;
	/** ��� ���� */
	private int quantity;
	
	// 2. ������ �����
	/**
	 * �⺻ ������
	 */
	public Product() {
		
	}
	
	/**
	 * ��ǰ �ڵ� �ʵ常 �ʱ�ȭ�ϴ� ������
	 * @param prodCode
	 */
	public Product(String prodCode) {
		this.prodCode = prodCode;
	}
	
	public Product(String prodCode, String prodName, int price, int quantity) {
		this(prodCode);
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}
	
	/** prodCode �� ������ */
	public String getProdCode() {
		return this.prodCode;
	}
	
	/** prodCode �� ������ */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	
	/** prodName �� ������ */
	public String getProdName() {
		return prodName;
	}

	/** prodName �� ������ */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	/** price �� ������ */
	public int getPrice() {
		return price;
	}

	/** price �� ������ */
	public void setPrice(int price) {
		this.price = price;
	}

	/** quantity �� ������ */
	public int getQuantity() {
		return quantity;
	}

	/** quantity �� ������ */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// 3. �޼ҵ� �����
	public void print() {
		System.out.printf("��ǰ ���� [��ǰ�ڵ� : %s, ��ǰ�� : %s"
				         + ", ���� %d: , ������ : %d]%n"
				         , prodCode, prodName, price, quantity);
	}
	
	/**
	 * �Էµ� percentage��ŭ ������ ������ ���
	 * �Ǹ� ������ �󸶰� �Ǵ��� ����Ͽ� ����
	 * @param percentage
	 * @return
	 */
	public int discount(double percentage) {
		int price = this.price;
		
		if (percentage > 0) {
			price = price - (int)(this.price * (percentage / 100));
		}
		
		return price;
	}

	/**
	 * ��ǰ�� ���(�Ǹ�)�ϰ� ��� ������ ���ҽ�Ų��.	 
	 * @param amount
	 */
	public void sell(int amount) {
		// ��� ������ ����Ϸ��� �������� ũ�ų� ��������
		// �����.
		if (this.quantity >= amount) {
			this.quantity -= amount;
		}
	}
	
	/**
	 * ��ǰ�� �԰�Ǿ� ��� ������ ������Ų��.
	 * @param amount
	 */
	public void buy(int amount) {
		// �԰�� ��ŭ ������ ���� �� ����ݿ�
		this.quantity += amount;		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prodCode == null) ? 0 : prodCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (prodCode == null) {
			if (other.prodCode != null)
				return false;
		} else if (!prodCode.equals(other.prodCode))
			return false;
		return true;
	}


	@Override
	public String toString() {
		String strProduct = String.format(
				"��ǰ ���� [��ǰ�ڵ� : %s, ��ǰ�� : %s"
		                 + ", ���� %,d: , ������ : %d]%n"
		         , prodCode, prodName, price, quantity);
		return strProduct;
	}


}

