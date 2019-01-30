package api.object;
/**
 * ĸ��ȭ�� �����ϱ� ���� ��� ������ �ʵ��  private���� ����
 * 
 * private String prodCode
 * private String prodName
 * private int price
 * private int quantity
 * @author win10
 *
 */
public class Product extends Object{
	private String prodCode;
	private String prodName;
	private int price;
	private int quantity;
	
	Product(){
		
	}
	Product(String prodCode){
		this.prodCode = prodCode;
	}
	Product(String prodCode,String prodName){
		this(prodCode);
		this.prodName = prodName;
	}
	Product(String prodCode,String prodName,int price){
		this(prodCode,prodName);
		this.price = price;
	}
	public Product(String prodCode,String prodName,int price, int quantity){
		this(prodCode,prodName,price);
		this.quantity = quantity;
	}
	/*//----------------------------------------------
	//������� �ʵ��� ���ü��� private���� �����ϸ�
	//�ٸ� ��� Ŭ�������� ������ �Ұ���������
	//���� ������ �ʵ忡 ������ �� �ִ� ���� �޼ҵ� ����
	//�����ؾ� �Ѵ�.
	//----------------------------------------------
	
	//������ �޼ҵ�  getter
	//1.get���� ����
	//2.get �ڿ� ���� �̸��� �����Ϸ��� ������� ���� 
	//  ù���ڸ� �빮��ȭ�Ͽ� ����
	//3.�޼ҵ� �Ű������� ����
	//4.�޼ҵ� ����Ÿ���� �����Ϸ��� ������� Ÿ�԰� �����
	//5.��������� Ÿ���� boolean�̸�
	//  get�� �ƴ϶� is�� �ۼ�
	//6.getXxx(),isXxx() ���·� ����
	 =================================================
	   
	//������ �޼ҵ� setter
	1.set���� ����
	2.set�ڿ� ���� �̸��� �����Ϸ��� ������� ����
	   ù���ڸ� �빮��ȭ�Ͽ� �����Ѵ�
	3.�޼ҵ� �Ű������� �����Ϸ��� ��������� Ÿ�԰� ���߰�,
	    ���� ���� �̸����� �����Ѵ�.
	4.���� Ÿ���� void�� ����
	5.���� ������ ������
	  this.������� = �Ű�����; �ۼ�
	
	*/
	
	/*prodCode�� ������*/
	 public String getProdCode() {
		 return this.prodCode;
	 }
	 /*prodCode�� ������	  */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	 
	 
	 
	//prodName�� ������
	
	public String getProdName() {
		return prodName;
	}
	//prodName�� ������
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	//price�� ������
	public int getPrice() {
		return price;
	}
	//price�� ������
	public void setPrice(int price) {
		this.price = price;
	}
	//quantity�� ������
	public int getQuantity() {
		return quantity;
	}
	//quantity�� ������
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	//����� ���� �޼ҵ�
	public void print() {
		System.out.printf("��ǰ��ȣ : %s, ��ǰ �� : %s, ���� : %d, ��� : %d%n",prodCode,prodName,price,quantity);
	}
	//discount(double percentage) : int
	//==>�Էµ� �ۼ�Ʈ ��ŭ ���ΰ��� ����
	public int discount(double percentage) {
		int price = this.price;
		
		if(percentage>0) {
			price = price-(int)(this.price * (percentage / 100));
			}
		return price;
	}
	//�Էµ� ����ŭ ��� ����
	public void sell(int amount) {
		//��� ������ ����Ϸ��� �������� ũ�ų� ��������
		//�����
		if(this.quantity>=amount) {
			this.quantity -= amount;
			System.out.printf("���ҵ� ��� �� : %d,���� ��� �� : %d%n",amount,quantity);
		}
		
	}
	//(�԰�)�Էµ� ����ŭ ��� ����
	public void buy(int amount) {
		//�԰�� ��ŭ ��� ���� ����
		this.quantity +=  amount;
		System.out.printf("������ ��� �� : %d,���� ��� �� : %d%n",amount,quantity);

		//object Ŭ�������� ���� �𸣴� ���� ��ӹ���
				//toString() �޼ҵ带 ������ �غ���
				//1.�޼ҵ� ����� ���� : ���� Ÿ��  �޼ҵ��̸�(�Ű����� ���)

	}
	@Override
	public String toString() {
		String strProduct = String.format("��ǰ��ȣ : %s, ��ǰ �� : %s, ���� : %d, ��� : %d%n"
										  ,prodCode,prodName,price,quantity);
		return super.toString();
	}
//
//	
//	//Product �� ��ü���� prodCode�� ������
//	//���� ��ü�� �Ǵ�
//	
//	@Override
//	public boolean equals(Object obj) {
//		//1.���� �� ��� ������ ���� ����
//		//2.�ʱ�ȭ : �⺻ false�� ����
//		boolean isEqual = false;
//		//3.��� : ���� ��ü���� �Ǵ�
//		//(1)�� ����� obj�� ProductŸ������ �˻�
//		if(obj instanceof Product) {
//			//(2)���Ϸ��� this ��ü��
//			//�񱳴���� obj �� ������ �ʵ尡 �������� ��
//			Product product = (Product)obj;
//			//prodCode�� ������ ���� ��ü�� ����
//			if(this.prodCode.equals(product.prodCode)) {
//			isEqual = true;	
//			}
//		}
//		return isEqual;
//	}
//	
//	@Override
//	public int hashCode() {
//		//�Է��� �����ϸ� ��µ� ������ �����ϴ� ������ �˰���
//		//����� �ٸ��� �Է��� �ٸ��ٴ� ����� �����ϴ� �Լ�
//		
//		//1.���Ϸ��� �ʵ尡 �������̸� �� Ŭ������
//		//  hashCode()�� ȣ��
//		//2.���Ϸ��� �ʵ尡 �⺻���̸� ���������� �ٲٴ�
//		//  ���� Ŭ���� ��ü�� ��ȯ �Ŀ� hasgCode()�� ȣ��
//		//3.1,2�� ����� ��� ^(XOR)������ �����Ŵ
//		return this.prodCode.hashCode();
//	
//	}
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

}
