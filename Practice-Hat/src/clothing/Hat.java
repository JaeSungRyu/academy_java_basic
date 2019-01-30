package clothing;

/**
 * 프로젝트명 : Practice-Hat 패키지 이름 : clothing 클래스 이름 : Hat
 * ---------------------------------- 
 * 멤버변수 : hatId : String : 모자제품의 일련 번호(ht001
 * 로 일련번호를 줄 용도) type : String : 모자의 종류(스포츠캡, 페도라, 중절모, 썬캡, 베레모, 후드, 카우보이 등)
 * material : String : 모자의 소재(가죽, 플라스틱, 천 등) size : double : 모자 둘레 길이(단위 : cm)
 * color : String : 모자의 색상 price : double : 모자의 가격 quantity : int : 재고 수량 gender
 * : char : 사용성별 (M:남성, F:여성, U:공용 으로 설정) 
 * -----------------------------------
 * 생성자 
 * 1. 기본생성자 2. 매개변수를 받는 생성자(멤버 변수 1개씩 증가시키며 모두) 중복 정의
 * --------------------------------------------- 
 * 메소드 
 * 1. public void print() : 모자정보 출력 
 * 2. public double disCount(int amount) : amount 만큼 가격을 할인. 원래 가격보다 큰 값을 할인은 불가능하도록 설정
 * 3. public String dye(String color) : 모자 색상을 입력된 color 로 염색하여 색상을 변경하고 변경된 색상을 리턴 
 * 4. public int sell(int amount) : amount 만큼 판매. 원래 수량보다 많이판매 불가 
 * 5. public int buy(int amount) : amount 만큼 구매 
 * 6. 각 필드에 대한 접근자/수정자 
 * 7. hatId 기준으로 equals(), hashCode() 재정의 
 * 8. toString() 재정의
 * @author win10
 *
 */
public class Hat {
	// 멤버변수 선언
	private String hatId;
	private String type;
	private String material;
	private double size;
	private String color;
	private double price;
	private int quantity;
	private char gender;

	// 생성자 선언부
	// 기본 생성자
	public Hat() {

	}

	// 생성자 필드 초기화 
	public Hat(String hatId) {
		this.hatId = hatId;
	}

	public Hat(String hatId, String type) {
		this(hatId);
		this.type = type;
	}

	public Hat(String hatId, String type, String material) {
		this(hatId, type);
		this.material = material;
	}

	public Hat(String hatId, String type, String material, double size) {
		this(hatId, type, material);
		this.size = size;
	}

	public Hat(String hatId, String type, String material, double size, String color) {
		this(hatId, type, material, size);
		this.color = color;
	}

	public Hat(String hatId, String type, String material, double size, String color, double price) {
		this(hatId, type, material, size, color);
		this.price = price;
	}
	
	public Hat(String hatId, String type, String material, double size, String color, double price, int quantity) {
		this(hatId, type, material, size, color,price);
		this.quantity = quantity;
	}

	public Hat(String hatId, String type, String material, double size, String color, double price, int quantity,
			char gender) {
		this(hatId, type, material, size, color, price,quantity);
		this.gender = gender;
	}

	// 6.사용자 접근자, 수정자 생성
	public String getHatid() {
		return hatId;
	}

	public void setHatid(String hatId) {
		this.hatId = hatId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	/*
	 * 1.print 메소드
	 */
	public void print() {
		System.out.printf("모자아이디:%s, 모자타입:%s, 모자소재:%s, 모자 사이즈:%fcm, "
				        + "모자색상:%s, 가격:%f, 재고 수량:%d, 사용 성별:%c%n"
				, hatId, type, material, size, color, price, quantity, gender);
	}

	/*
	 * 2.discount 메소드
	 */
	// amount 만큼 가격을 할인. 원래 가격보다 큰 값을 할인은 불가능하도록 설정
	public double discount(int amount) {
		double price = this.price;
		if (price > (this.price * (amount / 100))) {
			price = price - (int)(this.price * (amount / 100));
		}

		return price;
	}

	/*
	 * 3.색상을 바꾸는 메소드
	 */
	//모자 색상을 입력된 color 로 염색하여 색상을 변경하고 변경된 색상을 리턴
	public String dye(String color) {
//		if(this.color.equals(color)) {
			this.color = color;
//		}
		return this.color;
	}
	
	/*
	 *4.sell 메소드
	 */

	//amount 만큼 구매
	public int sell(int amount) {
		if (quantity >= amount) {
			this.quantity -= amount;
		}
		
		return quantity;

	}

	/*
	 * 5.buy 메소드
	 */
	//amount만큼 구매, 재고 증가
	public int buy(int amount) {
		this.quantity += amount;
	
		return quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hatId == null) ? 0 : hatId.hashCode());
		
		return result;
	}
	
	//7.hatId  기준으로 equals(), hashCode() 재정의
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hat other = (Hat) obj;
		if (hatId == null) {
			if (other.hatId != null)
				return false;
		} else if (!hatId.equals(other.hatId))
			return false;
		return true;
	} 
	
	//8.toString() 재정의
	@Override
	public String toString() {
		String strHat = String.format("모자아이디:%s, 모자타입:%s, 모자소재:%s, 모자 사이즈:%5.2fcm, "
				+ "모자색상:%s, 가격:%5.2f$, 재고 수량:%d, 사용 성별:%c"
				, hatId, type, material, size, color, price, quantity, gender);
		
		return strHat;
	}

}
