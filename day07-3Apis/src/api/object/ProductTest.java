package api.object;

public class ProductTest {

	public static void main(String[] args) {
		//1.선언 : 제품을 사용하기 위한 객체 참조 변수
		Product prod;
		
		//2.초기화
		prod = new Product("P0001","MS-아크터치 마우스"
				           ,51330,33); 
		
		//3.사용
		//(1)제품상태 출력
		
		//초기 상태
		prod.print();
		//20퍼센트 할인하면 할인가는?
		int cdprod = prod.discount(20);
		System.out.printf("제품가격 : %d, 20퍼센트 할인가 : %d%n",prod.getPrice(),cdprod);
		
		//(2)2개판매 sell
		prod.sell(2);
		
		//(3)10개 입고
		prod.buy(10);
		
		System.out.println("============================");
		System.out.println(prod.toString());
		System.out.println(prod);
		
		System.out.println("============================");
		
	}
}