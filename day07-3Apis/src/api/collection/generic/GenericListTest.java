package api.collection.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericListTest {

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
		//1.���� : product�� �����ϴ� List�� ����
		List<Product> products;
		//2.�ʱ�ȭ
		products = new ArrayList<Product>();
		
		
		//3.���
		//(1) ����Ʈ ������ �߰� add 
		 
		// <Product> Generic ��� ������ String Ÿ�� �߰� �Ұ���
		//products.add("1st Item");
		products.add(adidas);
		products.add(reebok);
		products.add(nike);
		products.add(crocs);
		products.add(birkenstock);
		
		//(2)�������� ������ �� �ٷ� Generic ���� Ÿ������ ������ �ִ�
		Product product = products.get(0);
		product.print();
		
		for (Product prod : products) {
			prod.buy(100);
			prod.print();
		}
	}

}
