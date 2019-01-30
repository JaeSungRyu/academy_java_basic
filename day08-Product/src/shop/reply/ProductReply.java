package shop.reply;

import shop.Product;

/**
 * 매니저가 한건의 제품정보를 가지고 왔을 때
 * 출력할 응답을 구현 
 * @author win10
 *
 */
public class ProductReply implements Reply {

	@Override
	public void reply(Object object) {
		//object 로 들어오는 대상이 product 타입인것이
		//확실하다
		Product product = (Product)object;
		product.print();
		
	}

}
