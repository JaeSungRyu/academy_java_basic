package api.collection.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericListTest {

	public static void main(String[] args) {
		Product adidas = 
				new Product("S001", "슈퍼스타", 87200, 5);
		Product reebok = 
				new Product("S002", "리복 로얄 테크큐 티", 42000, 20);
		Product nike = 
				new Product("S003", "나이키 탄준 샌들", 41300, 30);
		Product crocs = 
				new Product("S004", "라이트라이드 샌들 우먼", 40200, 7);
		Product birkenstock = 
				new Product("S005", "지제 에바", 29000, 15);
		//1.선언 : product만 저장하는 List로 선언
		List<Product> products;
		//2.초기화
		products = new ArrayList<Product>();
		
		
		//3.사용
		//(1) 리스트 아이템 추가 add 
		 
		// <Product> Generic 사용 때문에 String 타입 추가 불가능
		//products.add("1st Item");
		products.add(adidas);
		products.add(reebok);
		products.add(nike);
		products.add(crocs);
		products.add(birkenstock);
		
		//(2)아이템을 추출할 때 바로 Generic 적용 타입으로 꺼낼수 있다
		Product product = products.get(0);
		product.print();
		
		for (Product prod : products) {
			prod.buy(100);
			prod.print();
		}
	}

}
