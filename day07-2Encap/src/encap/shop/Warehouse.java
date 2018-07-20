package encap.shop;

import java.util.Arrays;

/**
 * 매장에서 판매되는 제품들을 모아두는 창고를 구현하는 클래스 제품정보를 저장하기 위해 배열로 관리한다.
 * -------------------------------------- 제품들이 올려져있거나 쌓여있는 창고의 선반은 각 창고마다 존재하기
 * 때문에 구현은 멤버변수로 선언해야 한다. -------------------------------------- 메소드 set(Product
 * prod) : void ==>창고에 있는 제품 1개의 정보를 수정하는 기능
 * 
 * print() : void ==>창고에 있는 제품 1개의 정보를 출력하는 기능
 * 
 * add(Product prod) : void ==>창고에 신제품 들여놓는 기능
 * 
 * remove(Product prod) : void 더 이상 판매하지 않는 제품을 폐기
 * 
 * getAllProduct() : Product[] 창고에 들어있는 전체 제품 목록을 가져오는 기능
 * 
 * 
 * 창고에 들어있는 전체 제품 목록을 출력하는 기능 창고에 있는 제품 1개의 정보를 수정하는 기능 신제품을 새로 들여놓는 기능 더 이상
 * 판매하지 않는 기능을 폐기 창고에 있는 제품 1개의 정보를 출력하는 기능
 * 
 * @author win10
 * 
 */
public class Warehouse {
	// 1.멤버변수 선언부 : 제품을 쌓아둘 배열 참조변수
	Product[] products;

	// 2.생성자 선언부
	/*
	 * 기본 생성자 : 창고를 처음 지을 때 어떻게 지을 것인지 방법을 알려주는 생성자*
	 */
	Warehouse() {
		// 옵션없이 창고를 지으면 선반 길이를 0으로 만듭니다
		this.products = new Product[0];
	}

	// 매개변수가 있는 생성자
	Warehouse(Product[] products) {
		this.products = products;
	}

	// 3.메소드 선언부
	/**
	 * 제품 선반 가장 마지막에 추가 제품 선반 크기를 1증가 시키면서 추가
	 * 
	 * @param prod
	 */
	public void add(Product prod) {
		// 이미 존재하는 배열의 크기 + 1 길이로 복사
		this.products = Arrays.copyOf(products, products.length + 1);
		// 마지막 인덱스에 신규 제품 정보 입력
		this.products[products.length - 1] = prod;
	}

	/**
	 * 파라미터로 전달된 정0보와 일치하는 제품이 있는지 검색하여(prodCode 필드가 같으면 같은 제품으로 처리) 일치하는 제품이 있으면 그
	 * 제품정보를 리턴 없으면 null을 리턴
	 * 
	 * @return
	 */
	public Product get(Product prod) {
		return findProduct(prod);
	}

	/**
	 * 매개변수로 넘겨진 제품 정보와 일치하는 제품코드를 가진 제품에 대해 입력된 값으로 수정하여 저장함
	 * 
	 * @param prod
	 * @return
	 */
	public void set(Product prod) {
		int setIndex = -1;
		if ((setIndex = findProductIdx(prod)) > -1) {
			products[setIndex] = prod;
		}

	}

	/**
	 * 판매하지 않을 제품 정보를 폐기
	 * 
	 * @param prod
	 */
	public void remove(Product prod) {
		// 폐기할 제품이 위치하는 인덱스
		int rmIndex = -1;
		rmIndex = findProductIdx(prod);

		// 삭제 안된 제품을 유지할 새 배열
		Product[] newProducts;
		if (rmIndex > -1) {
			newProducts = new Product[this.products.length];
			// 1.rmIndex가 배열 중간일 때
			if (rmIndex < (products.length - 1)) {

				// 삭제할 제품 앞 쪽까지 복사
				for (int idx = 0; idx < rmIndex; idx++) {
					newProducts[idx] = products[idx];
				}
				// 삭제할 제품 뒷 쪽부터 끝까지
				for (int idx = rmIndex; idx < newProducts.length; idx++) {
					newProducts[idx] = products[idx + 1];
				}

			} else {
				// 2.rmIndex가 마지막 일 때
				for (int idx = 0; idx < products.length - 1; idx++) {
					newProducts[idx] = products[idx];
				}
			}
			this.products = newProducts;

		}//outer if end
	}// method remove 끝

	/**
	 * 배열에 들어 잇는 제품들 전체 정보를 가져와서 리턴
	 * 
	 * @return
	 */
	public Product[] getAllProducts() {
		return this.products;
	}

	/**
	 * 찾는 제품이 있는지 검색하는 메소드
	 * 
	 * @param prod
	 * @return
	 */
	private Product findProduct(Product prod) {
		Product finded = null;
		for (Product prods : products) {
			// 배열에 존재하는 제품 정보(prod)가
			// 매개변수로 넘겨진 제품정보(product)와
			// 일치하는지 비교 : prodCode만 비교
			if (prods.prodCode.equals(prod.prodCode)) {
				finded = prod;
				break;
			}
		}
		return finded;
	}

	/**
	 * 매개변수로 입력된 제품이 배열 몇번째 위치에 존재하는지 그 인덱스를 찾는다.
	 * 
	 * @param product
	 * @return
	 */
	private int findProductIdx(Product prod) {
		int index = -1;

		for (int idx = 0; idx < products.length; idx++) {
			if (products[idx].prodCode.equals(prod.prodCode)) {
				index = idx;
				break;
			}
		}
		return index;
	}
	// 배열에 존재하지 않는 값으로 초기화
}
