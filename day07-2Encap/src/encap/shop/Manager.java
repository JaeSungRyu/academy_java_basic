package encap.shop;
/**
 * 창고(Warehouse)를 사용하는
 * 매장 매니저를 나타내는 클래스
 * ---------------------------------------------
 * 매장 매니저는 
 * 1.제품을 창고에 등록을 하거나
 * 2.창고에서 가지고 오거나
 * 3.수량이나 가격정보를 수정하거나
 * 4.더이상 판매하지 않을 물건을 폐기
 * 
 * 등의 작업을 창고에서 진행
 * ---------------------------------------------
 * 전제조건 : 매니저는 우리 매장의 창고가 어디있는지 알아야 한다.
 * ---------------------------------------------
 * 
 * @author win10
 *
 */

public class Manager {
	//1.멤버 변수 선언부'
	Warehouse warehouse;
	//2.생성자 선언부
	//(1)매니저 기본 생성자
	Manager(){
		warehouse = new Warehouse();
	}
	//(2)매개변수가 있는 매니저 생성자
	Manager(Warehouse warehouse){
		this.warehouse = warehouse;
	}
	
	//3.메소드 선언부
	/**
	 * 매니저는 제품 한개를 창고로 들고가서 
	 * 창고에 등록을 할수 있다
	 * @param prod
	 */
	public void add(Product prod) {
		warehouse.add(prod);
	}
	/**
	 * 매니저는 제품한개를 창고로 들고가서
	 * 창고에 있던 제품 정보를 수정할 수 있다
	 * @param prod
	 */
	public void set(Product prod) {
		warehouse.set(prod);
	}
	/**
	 *  매니저는 창고에 가서 더 이상 팔지 않아 폐기할
	 *  제품 정보를 제거할 수 있다.
	 *  이 때, 제거할 제품의 정보는 알고 있어야 한다
	 * @param prod
	 */
	public void remove(Product prod) {
		warehouse.remove(prod);
	}
	/*
	 * 매니저가 창고에 가서 요청된 재품 한개를 
	 * 가지고 오는 기능
	 */
	public Product get(Product prod) {
		return warehouse.get(prod);
	}
	/**
	 * 매니저는 현재 창고에 등록되어 남아잇는
	 * 제품 정보 전체 목록을 조회할 수 있다.
	 * @return
	 */
	public Product[] getAllProducts() {
		return warehouse.getAllProducts();
	}
}
