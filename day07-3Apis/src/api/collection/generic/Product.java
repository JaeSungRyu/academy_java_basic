package api.collection.generic;

/**
 * ��ǰ �Ǹ� ���忡�� �����ϴ� �����
 * ��ǰ�� �����ϴ� Ŭ����
 * -------------------------------------------
 * ��ǰ��ȣ : prodCode : String
 * ��ǰ ��  : prodName : String
 * ����     : price    : int
 * ������ : quantity : int
 * -------------------------------------------
 * �⺻������, �Ű������� �޴� ������ �� �ʵ� 1���� �÷�����
 * ������ �ߺ����Ƿ� 5���� �����ڸ� ���� this, this() ���
 * -------------------------------------------
 * �޼ҵ� 
 * print() : void 
 *    ==> ��ǰ�� ���� ���
 * discount(double percentage) : int 
 *    ==>�Էµ� �ۼ�Ʈ��ŭ ���ΰ��� ����
 * 
 * sell(int amount) : void 
 *    ==> ���忡�� �Ǹ�(���)�Ǿ� �������� �پ��
 * buy(int amount) : void
 *    ==> ���忡 �԰�Ǿ� �������� �þ
 * 
 * set(Sting prodCode, String prodName
 *    , int price, int quantity) : void
 *    ==> �� ���� �ʵ忡 ���Ͽ� �Էµ� ������ ����
 *  
 * @author PC38206
 *
 */
public class Product {
	
	// 1. ��� ���� �����
	/** ��ǰ �ڵ� */
	String prodCode;
	/** ��ǰ �� */
	String prodName;
	/** ��ǰ ���� */
	int price;
	/** ��� ���� */
	int quantity;
	
	// 2. ������ �����
	/**
	 * �⺻ ������
	 */
	Product() {
		
	}
	
	/**
	 * ��ǰ �ڵ� �ʵ常 �ʱ�ȭ�ϴ� ������
	 * @param prodCode
	 */
	Product(String prodCode) {
		this.prodCode = prodCode;
	}
	
	/**
	 * ��� �ʵ带 �ʱ�ȭ�ϴ� ������
	 * @param prodCode
	 * @param prodName
	 * @param price
	 * @param quantity
	 */
	Product(String prodCode, String prodName, int price, int quantity) {
		this(prodCode);
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}
	
	// 3. �޼ҵ� �����
	/**
	 * ��ǰ ������ ���
	 */
	public void print() {
		System.out.printf("��ǰ ���� [��ǰ�ڵ� : %s, ��ǰ�� : %s"
				         + ", ���� : %,6d , ������ : %2d]%n"
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
	
	/**
	 * �Էµ� ������ ��ǰ ������ �����Ͽ� ����
	 * @param prodCode
	 * @param prodName
	 * @param price
	 * @param quantity
	 */
	public void set(String prodCode, String prodName
			       , int price, int quantity) {
		
		if (!this.prodCode.equals(prodCode)) {
			this.prodCode = prodCode;
		}
		
		if (!this.prodName.equals(prodName)) {
			this.prodName = prodName;
		}
		
		if (this.price != price) {
			this.price = price;
		}
		
		if (this.quantity != quantity) {
			this.quantity = quantity;
		}
	}
	
	
	
	
	
	
	
	

}

