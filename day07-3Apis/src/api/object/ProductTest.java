package api.object;

public class ProductTest {

	public static void main(String[] args) {
		//1.���� : ��ǰ�� ����ϱ� ���� ��ü ���� ����
		Product prod;
		
		//2.�ʱ�ȭ
		prod = new Product("P0001","MS-��ũ��ġ ���콺"
				           ,51330,33); 
		
		//3.���
		//(1)��ǰ���� ���
		
		//�ʱ� ����
		prod.print();
		//20�ۼ�Ʈ �����ϸ� ���ΰ���?
		int cdprod = prod.discount(20);
		System.out.printf("��ǰ���� : %d, 20�ۼ�Ʈ ���ΰ� : %d%n",prod.getPrice(),cdprod);
		
		//(2)2���Ǹ� sell
		prod.sell(2);
		
		//(3)10�� �԰�
		prod.buy(10);
		
		System.out.println("============================");
		System.out.println(prod.toString());
		System.out.println(prod);
		
		System.out.println("============================");
		
	}
}