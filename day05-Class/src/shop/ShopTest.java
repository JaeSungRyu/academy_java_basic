package shop;
/**
 * ���忡�� �Ǹŵ� ������ �ű� �߰�/����/���� ��
 * ����� �׽�Ʈ�ϴ� Ŭ����
 * @author win10
 *
 */
public class ShopTest {

	public static void main(String[] args) {
		//1.â�� �鿩���� ��ǰ ������ ���� �ʿ�
		Product[] prods = new Product[0];
		//2.������ ��ġ�� â�� ����� ��
		Warehouse warehouse = new Warehouse(prods);
		//3.������ ������ �Ŵ����� �����
		Manager manager = new Manager(warehouse);
		//4.������ ���� 
		Shop abcMart = new Shop(manager);

		//---------------------------------------------
		//���忡 �԰��� �ű� ��ǰ(�Ź�) �� ���忡 �����ߴ�.
		Product adidas = 
				new Product("S001","���۽�Ÿ",87200,5);
		Product reebok =
				new Product("S002","���� �ξ� ��ũť Ƽ",42000,20);
		Product nike =
				new Product("S003","����Ű ź�� ����",41300,30);
		Product crocs =
				new Product("S004","����Ʈ���̵� ���� ���",40200,7);
		Product birkenstock =
				new Product("S005","���� ����",29000,15);
		
		//1.���忡 ������ ��ǰ�� �԰�
		abcMart.add(adidas);
		abcMart.add(reebok);
		abcMart.add(nike);
		abcMart.add(crocs);
		abcMart.add(birkenstock);
		
		//2.�԰�� ��ǰ Ȯ��
		Product[] allProducts = abcMart.getAllProducts();
		for(Product prod: allProducts) {
			prod.print();
			
		};
		//3.�Ƶ�ٽ� ��ǰ ����
		Product adidas2 = 
				new Product("S001","���۽�Ÿ",75000,5);
		abcMart.set(adidas2);
		
		//4.������ �Ƶ�ٽ� ��ǰ ���� Ȯ��
		System.out.println();
		abcMart.get(new Product("S001",null,0,0)).print();
	
		//5.�Ǹ� ������ ��ǰ ���
		abcMart.remove(new Product("S001",null,0,0));
		
		//6.���Ȯ���� ���� ��ü ��� �� ��ȸ
		System.out.println();
		for(Product prod : abcMart.getAllProducts()) {
			prod.print();
		}
		
	}
		
}
