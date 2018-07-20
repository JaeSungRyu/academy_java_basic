package encap.product;
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
	Product(String prodCode,String prodName,int price, int quantity){
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
	
}
