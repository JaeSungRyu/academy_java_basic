package api.collection.generic;

import java.util.HashSet;
import java.util.Set;

public class GenericSetTest {

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
		
		//1.���� : Product�� �����ϴ� Set���� ����
		Set<Product> products;
		
		//2.�ʱ�ȭ : Product�� �����ϴ� HashSet���� �ʱ�ȭ
		products = new HashSet<Product>();
		//3.���
		//(1)set�� ������ �߰�
		products.add(adidas);
		products.add(reebok);
		products.add(nike);
		products.add(crocs);
		products.add(birkenstock);
		
		for (Product prod : products) {
			prod.buy(50);
			prod.print();
			
		}
		
	}

}
