package api.object;
/**
 * 캡슐화를 적용하기 위해 모든 데이터 필드는  private으로 선언
 * 
 * private String prodCode
 * private String prodName
 * private int price
 * private int quantity
 * @author win10
 *
 */
public class Product extends Object{
	private String prodCode;
	private String prodName;
	private int price;
	private int quantity;
	
	Product(){
		
	}
	Product(String prodCode){
		this.prodCode = prodCode;
	}
	Product(String prodCode,String prodName){
		this(prodCode);
		this.prodName = prodName;
	}
	Product(String prodCode,String prodName,int price){
		this(prodCode,prodName);
		this.price = price;
	}
	public Product(String prodCode,String prodName,int price, int quantity){
		this(prodCode,prodName,price);
		this.quantity = quantity;
	}
	/*//----------------------------------------------
	//멤버변수 필드의 가시성을 private으로 선언하면
	//다른 모든 클래스에서 접근이 불가능해진다
	//따라서 숨겨진 필드에 접근할 수 있는 전용 메소드 쌍을
	//정의해야 한다.
	//----------------------------------------------
	
	//접근자 메소드  getter
	//1.get으로 시작
	//2.get 뒤에 오는 이름은 접근하려는 멤버변수 명의 
	//  첫글자만 대문자화하여 정의
	//3.메소드 매개변수가 없다
	//4.메소드 리턴타입을 접근하려는 멤버변수 타입과 맞춘다
	//5.멤버변수의 타입이 boolean이면
	//  get이 아니라 is로 작성
	//6.getXxx(),isXxx() 형태로 정의
	 =================================================
	   
	//수정자 메소드 setter
	1.set으로 시작
	2.set뒤에 오는 이름은 수정하려는 멤버변수 명의
	   첫글자만 대문자화하여 정의한다
	3.메소드 매개변수는 수정하려는 멤버변수의 타입과 맞추고,
	    보통 같은 이름으로 설정한다.
	4.리턴 타입은 void로 설정
	5.보통 안쪽의 로직은
	  this.멤버변수 = 매개변수; 작성
	
	*/
	
	/*prodCode의 접근자*/
	 public String getProdCode() {
		 return this.prodCode;
	 }
	 /*prodCode의 수정자	  */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	 
	 
	 
	//prodName의 접근자
	
	public String getProdName() {
		return prodName;
	}
	//prodName의 수정자
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	//price의 접근자
	public int getPrice() {
		return price;
	}
	//price의 수정자
	public void setPrice(int price) {
		this.price = price;
	}
	//quantity의 접근자
	public int getQuantity() {
		return quantity;
	}
	//quantity의 수정자
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	//출력을 위한 메소드
	public void print() {
		System.out.printf("제품번호 : %s, 제품 명 : %s, 가격 : %d, 재고 : %d%n",prodCode,prodName,price,quantity);
	}
	//discount(double percentage) : int
	//==>입력된 퍼센트 만큼 할인가격 리턴
	public int discount(double percentage) {
		int price = this.price;
		
		if(percentage>0) {
			price = price-(int)(this.price * (percentage / 100));
			}
		return price;
	}
	//입력된 수만큼 재고 감소
	public void sell(int amount) {
		//재고 수량이 출고하려는 수량보다 크거나 같을때만
		//출고함
		if(this.quantity>=amount) {
			this.quantity -= amount;
			System.out.printf("감소된 재고 수 : %d,현재 재고 수 : %d%n",amount,quantity);
		}
		
	}
	//(입고)입력된 수만큼 재고 증가
	public void buy(int amount) {
		//입고된 만큼 재고 수량 증가
		this.quantity +=  amount;
		System.out.printf("증가된 재고 수 : %d,현재 재고 수 : %d%n",amount,quantity);

		//object 클래스에서 나도 모르는 사이 상속받은
				//toString() 메소드를 재정의 해보자
				//1.메소드 헤더가 동일 : 리턴 타입  메소드이름(매개변수 목록)

	}
	@Override
	public String toString() {
		String strProduct = String.format("제품번호 : %s, 제품 명 : %s, 가격 : %d, 재고 : %d%n"
										  ,prodCode,prodName,price,quantity);
		return super.toString();
	}
//
//	
//	//Product 의 객체들은 prodCode가 같으면
//	//동일 객체로 판단
//	
//	@Override
//	public boolean equals(Object obj) {
//		//1.동일 비교 결과 저장할 변수 선언
//		//2.초기화 : 기본 false로 설정
//		boolean isEqual = false;
//		//3.사용 : 동일 객체인지 판단
//		//(1)비교 대상인 obj가 Product타입인지 검사
//		if(obj instanceof Product) {
//			//(2)비교하려는 this 객체와
//			//비교대상인 obj 간 각각의 필드가 동일한지 비교
//			Product product = (Product)obj;
//			//prodCode만 같으면 같은 객체로 인정
//			if(this.prodCode.equals(product.prodCode)) {
//			isEqual = true;	
//			}
//		}
//		return isEqual;
//	}
//	
//	@Override
//	public int hashCode() {
//		//입력이 동일하면 출력도 동일함 보장하는 수학적 알고리즘
//		//출력이 다르면 입력이 다르다는 결론을 보장하는 함수
//		
//		//1.비교하려는 필드가 참조형이면 그 클래스의
//		//  hashCode()를 호출
//		//2.비교하려는 필드가 기본형이면 참조형으로 바꾸는
//		//  포장 클래스 객체로 변환 후에 hasgCode()를 호출
//		//3.1,2의 결과를 모두 ^(XOR)연산을 통과시킴
//		return this.prodCode.hashCode();
//	
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prodCode == null) ? 0 : prodCode.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (prodCode == null) {
			if (other.prodCode != null)
				return false;
		} else if (!prodCode.equals(other.prodCode))
			return false;
		return true;
	}

}
