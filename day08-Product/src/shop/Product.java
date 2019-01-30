package shop;

/**
 * ��ǰ �Ǹ� ���忡�� �����ϴ� �����
 * ��ǰ�� �����ϴ� Ŭ����
 * ------------------------------------------------------
 * ĸ��ȭ�� �����Ͽ� ��� ������ �ʵ�� private ���� ����
 * 
 * ��ǰ��ȣ : prodCode : String
 * ��ǰ ��  : prodName : String
 * ����     : price    : int
 * ������ : quantity : int
 * -------------------------------------------------------
 * �⺻������, �Ű������� �޴� ������ �� �ʵ� 1���� �÷�����
 * ������ �ߺ����Ƿ� 5���� �����ڸ� ���� this, this() ���
 * --------------------------------------------------------
 * �޼ҵ� 
 * print() : void 
 *    ==> ��ǰ�� ���� ���
 * discount(double percentage) : int 
 *    ==>�Էµ� �ۼ�Ʈ��ŭ ���ΰ��� ����
 * sell(int amount) : void 
 *    ==> ���忡�� �Ǹ�(���)�Ǿ� �������� �پ��
 * buy(int amount) : void
 *    ==> ���忡 �԰�Ǿ� �������� �þ
 * ---------------------------------------------------------
 * @author PC38206
 *
 */
public class Product {
	
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
	
	/**
	 * ��� �ʵ带 �ʱ�ȭ�ϴ� ������
	 * @param prodCode
	 * @param prodName
	 * @param price
	 * @param quantity
	 */
	public Product(String prodCode, String prodName, int price, int quantity) {
		this(prodCode);
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}
	
	/* -----------------------------------------------
 	 * ��� ���� �ʵ��� ���ü��� private ���� �����ϸ�
	 * �ٸ� ��� Ŭ�������� ������ �Ұ���������.
	 * ���� ������ �ʵ忡 ������ �� �ִ� ���� �޼ҵ� ����
	 * �����ؾ� �Ѵ�.
	 * ================================================
	 * ������ �޼ҵ� : getter 
	 * ------------------------------------------------
	 * 1. get ���� ����
	 * 2. get �ڿ� ���� �̸��� �����Ϸ��� ������� ����
	 *    ù ���ڸ� �빮��ȭ �Ͽ� �����Ѵ�.
	 * 3. �޼ҵ� �Ű������� ����.
	 * 4. �޼ҵ� ���� Ÿ���� �����Ϸ��� ������� Ÿ�԰� �����.
	 * 5. ��������� Ÿ���� boolean �̸� 
	 *    get �� �ƴ϶� is �� �����ϵ��� �ۼ�
	 * 6. getXxx() , isXxx() ���·� ����
	 * ================================================
	 * ������ �޼ҵ� : setter
	 * ------------------------------------------------
	 * 1. set ���� ����
	 * 2. set �ڿ� ���� �̸��� �����Ϸ��� ������� ����
	 *    ù ���ڸ� �빮��ȭ�Ͽ� �����Ѵ�.
	 * 3. �޼ҵ� �Ű� ������ �����Ϸ��� ��������� Ÿ�԰�
	 *    ���߰�, ���� ���� �̸����� ����
	 * 4. ���� Ÿ���� void �� �Ѵ�.
	 * 5. ���� ������ ������ 
	 *    this.������� = �Ű�����; �ۼ�
	 * ================================================
	 * */
	
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
	/**
	 * ��ǰ ������ ���
	 */
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


	// Object Ŭ�������� ���� �𸣴� ���� ��ӹ���
	// toString() �޼ҵ带 ������ �غ���.
	// 1. �޼ҵ� ����� ���� : ����Ÿ�� �޼ҵ��̸� (�Ű����� ���)
	@Override
	public String toString() {
		String strProduct = String.format(
				"��ǰ ���� [��ǰ�ڵ� : %s, ��ǰ�� : %s"
		                 + ", ���� %,d: , ������ : %d]%n"
		         , prodCode, prodName, price, quantity);
		return strProduct;
	}

//	// Product �� ��ü���� prodCode �� ������ 
//	// ���� ��ü�� �Ǵ�
//	@Override
//	public boolean equals(Object obj) {
//		// 1. ���� �� ��� ���� ���� ����
//		// 2. �ʱ�ȭ : �⺻ false ����
//		boolean isEqual = false;
//		
//		// 3. ��� : ������ ��ü���� �Ǵ�
//		// (1) �� ����� obj �� Product Ÿ������ �˻�
//		if (obj instanceof Product) {
//			// (2) �� �Ϸ��ϴ� this ��ü��
//			//     �� ����� obj �� ������ �ʵ尡 ��������
//			//     ��
//			Product product = (Product)obj;
//			//     prodCode �� ������ ���� ��ü�� ����
//			if (this.prodCode.equals(product.prodCode)) {
//				isEqual = true;
//			}
//		}
//		
//		return isEqual;
//	}
//
//	@Override
//	public int hashCode() {
//		// �Է��� �����ϸ� ��µ� ������ �����ϴ� ������ �˰���
//		// ����� �ٸ��� �Է��� �ٸ��ٴ� ����� �����ϴ� �Լ�
//		
//		// 1. ���Ϸ��� �ʵ尡 �������̸� �� Ŭ������
//		//    hashCode() �� ȣ��
//		// 2. ���Ϸ��� �ʵ尡 �⺻���̸� ���������� �ٲٴ�
//		//    ���� Ŭ���� ��ü�� ��ȯ �Ŀ� hashCode() �� ȣ��
//		// 3. 1, 2 �� ����� ��� ^ (XOR) ������ �����Ų��.
//		
//		return this.prodCode.hashCode();
//	}
	
	
	
	
	
	
	
	
	

}

