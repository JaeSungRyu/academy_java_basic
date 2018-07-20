package encap.product;
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
	Product(String prodCode,String prodName,int price, int quantity){
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
	
}
