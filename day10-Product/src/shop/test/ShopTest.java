package shop.test;

import java.util.ArrayList;
import java.util.List;

import shop.controller.Manager;
import shop.dao.GeneralWarehouse;
import shop.dao.JdbcWarehouse;
import shop.dao.ListWarehouse;
import shop.vo.Product;

/**
 * ���忡�� �Ǹŵ� ������ �ű� �߰�/����/���� ��
 * ����� �׽�Ʈ�ϴ� Ŭ����
 * @author PC38206
 *
 */
public class ShopTest {

	public static void main(String[] args) {

		// 1. â�� �鿩���� ��ǰ ������ ���� �ʿ�
//		Product[] products = new Product[0];
//		List<Product> prods = new ArrayList<Product>();
//		Set<Product> prodsSet = new HashSet<Product>();
//		Map<String, Product> prodsMap = new HashMap<>();
		
		// 2. ������ ��ġ�� â�� ����� ��
//		GeneralWarehouse warehouse = new ArrayWarehouse(products);
//		GeneralWarehouse warehouse = new ListWarehouse(prods);
//		GeneralWarehouse warehouse = new SetWarehouse(prodsSet);
//		GeneralWarehouse warehouse = new MapWarehouse(prodsMap);
		GeneralWarehouse warehouse = new JdbcWarehouse();
		
		// 3. ������ ������ �Ŵ����� �����
		Manager manager = new Manager(warehouse);
		
		// 4. ������ ����
//		Shop manager = new Shop(manager);
		
		//--------------------------------------------------
		// ���忡 �԰��� �ű� ��ǰ(�Ź�) �� �����ߴ�. 
		Product adidas = 
				new Product("S001", "���۽�Ÿ", 87200, 5);
		Product reebok = 
				new Product("S002", "���� �ξ� ��ũť Ƽ", 42000, 20);
		Product nike = 
				new Product("S003", "����Ű ź�� ����", 41300, 30);
		Product crocs = 
				new Product("S004", "����Ʈ���̵� ���� ���", 40200, 7);
		Product birkenstock = 
				new Product("S005", "���� ����", 29000, 15);
		
		// 1. ���忡 ������ ��ǰ�� �԰�
		manager.add(adidas);
		manager.add(reebok);
		manager.add(nike);
		manager.add(crocs);
		manager.add(birkenstock);
		
		// 2. �԰�� ��ǰ ��ü Ȯ��
		manager.getAllProducts();

		// 3. �Ƶ�ٽ� ��ǰ ����
		Product adidas2 = 
				new Product("S001", "���۽�Ÿ", 75000, 5);
		manager.set(adidas2);
		
		// 4. ������ �Ƶ�ٽ� ��ǰ ���� Ȯ��		
		manager.get(new Product("S001", null, 0, 0));
		
		// 5. �Ǹ� ������ ��ǰ ���
		manager.remove(new Product("S001", null, 0, 0));
		
		// 6. ��� Ȯ���� ���� ��ü ��� �� ��ȸ
		System.out.println("====================");
		manager.getAllProducts();
		
		// 7. ���� �ڵ� ��ȸ ==> NotFoundException �߻� ��Ȳ
		Product p007 = new Product("P007");
		manager.get(p007);
		
		// 8. ���� ��ǰ ���� ==> NotFoundException �߻� ��Ȳ
		manager.set(p007);
		
		// 9. �ִ� ��ǰ �ߺ� �߰� ==> DuplicateException
		Product s002 = new Product("S002");
		manager.add(s002);
		
		//10.��ü 1�Ǿ� ����
		manager.remove(adidas);
		manager.remove(nike);
		manager.remove(crocs);
		manager.remove(reebok);
		manager.remove(birkenstock);
	}

}






