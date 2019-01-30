
package shoes;

/**
 * ----------------------------------------------------- shoe : class 신발의 정보를
 * 저장하는 클래스 -----------------------------------------------------
 * 
 * @author win10
 *
 */
public class Shoe {
	// 1.멤버변수 선언
	private String shoeCode;
	private String shoeName;
	private int size;
	private int price;
	private String type;
	private int quantity;

	public Shoe() {

	}

	public Shoe(String shoeCode) {
		this.shoeCode = shoeCode;
	}

	public Shoe(String shoeCode, String shoeName) {
		this(shoeCode);
		this.shoeName = shoeName;
	}

	public Shoe(String shoeCode, String shoeName, int size) {
		this(shoeCode, shoeName);
		this.size = size;
	}

	public Shoe(String shoeCode, String shoeName, int size, int price) {
		this(shoeCode, shoeName, size);
		this.price = price;
	}

	public Shoe(String shoeCode, String shoeName, int size, int price, String type) {
		this(shoeCode, shoeName, size, price);
		this.type = type;
	}

	public Shoe(String shoeCode, String shoeName, int size, int price, String type, int quantity) {
		this(shoeCode, shoeName, size, price, type);
		this.quantity = quantity;
	}

	public String getShoeCode() {
		return shoeCode;
	}

	public void setShoeCode(String shoeCode) {
		this.shoeCode = shoeCode;
	}

	public String getShoeName() {
		return shoeName;
	}

	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// toString 재정의
	@Override
	public String toString() {
		String strShoe = String.format("신발정보[신발코드:%s, 신발이름:%s, 사이즈:%d, 가격 : %d, 타입 : %s, 수량 : %d]", shoeCode, shoeName,
				size, price, type, quantity);
		return strShoe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + quantity;
		result = prime * result + ((shoeCode == null) ? 0 : shoeCode.hashCode());
		result = prime * result + ((shoeName == null) ? 0 : shoeName.hashCode());
		result = prime * result + size;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Shoe other = (Shoe) obj;
		if (shoeCode == null) {
			if (other.shoeCode != null)
				return false;
		} else if (!shoeCode.equals(other.shoeCode))
			return false;
		return true;
	}

}