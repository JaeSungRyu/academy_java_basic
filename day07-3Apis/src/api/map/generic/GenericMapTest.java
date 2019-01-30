package api.map.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import api.object.Product;

public class GenericMapTest {

	public static void main(String[] args) {
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
		
		// 1. ���� : Key : String, Value : Product ��
		//           Generic �� ������ Map ���� ����
		Map<String, Product> products;
		
		// 2. �ʱ�ȭ : Key : String, Value : Product ��
		//           Generic �� ������ HashMap ���� �ʱ�ȭ
		products = new HashMap<String, Product>();
		
		
		// 3. ���
		// (1) Key : prodCode �� �����Ͽ� �Է�
		//   Value : ��ǰ ��ü ��ü
		products.put(adidas.getProdCode(), adidas);
		products.put(reebok.getProdCode(), reebok);
		products.put(nike.getProdCode(), nike);
		products.put(crocs.getProdCode(), crocs);
		products.put(birkenstock.getProdCode(), birkenstock);
		
		// (2) map ���� Product ��ü �ϳ� ����
		Product product = products.get("S004");
		product.print();
		
		// (3) foreach �� ��� : key ���� ���� �� ��ü ���
		Set<String> productKeys = products.keySet();
		
		for (String key: productKeys) {
			Product prod = products.get(key);
			prod.buy(30);
			prod.print();
		}

	}

}








