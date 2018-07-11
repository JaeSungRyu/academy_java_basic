package product;

public class Product {
	String prodCode;
	String prodName;
	int price;
	int quantity;
	
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
	}
	
}
