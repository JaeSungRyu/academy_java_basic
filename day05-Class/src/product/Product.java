package product;

public class Product {
	String prodCode;
	String prodName;
	int price;
	int quantity;
	
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
	}
	
}
