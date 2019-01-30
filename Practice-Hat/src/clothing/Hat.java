package clothing;

/**
 * ������Ʈ�� : Practice-Hat ��Ű�� �̸� : clothing Ŭ���� �̸� : Hat
 * ---------------------------------- 
 * ������� : hatId : String : ������ǰ�� �Ϸ� ��ȣ(ht001
 * �� �Ϸù�ȣ�� �� �뵵) type : String : ������ ����(������ĸ, �䵵��, ������, ��ĸ, ������, �ĵ�, ī�캸�� ��)
 * material : String : ������ ����(����, �ö�ƽ, õ ��) size : double : ���� �ѷ� ����(���� : cm)
 * color : String : ������ ���� price : double : ������ ���� quantity : int : ��� ���� gender
 * : char : ��뼺�� (M:����, F:����, U:���� ���� ����) 
 * -----------------------------------
 * ������ 
 * 1. �⺻������ 2. �Ű������� �޴� ������(��� ���� 1���� ������Ű�� ���) �ߺ� ����
 * --------------------------------------------- 
 * �޼ҵ� 
 * 1. public void print() : �������� ��� 
 * 2. public double disCount(int amount) : amount ��ŭ ������ ����. ���� ���ݺ��� ū ���� ������ �Ұ����ϵ��� ����
 * 3. public String dye(String color) : ���� ������ �Էµ� color �� �����Ͽ� ������ �����ϰ� ����� ������ ���� 
 * 4. public int sell(int amount) : amount ��ŭ �Ǹ�. ���� �������� �����Ǹ� �Ұ� 
 * 5. public int buy(int amount) : amount ��ŭ ���� 
 * 6. �� �ʵ忡 ���� ������/������ 
 * 7. hatId �������� equals(), hashCode() ������ 
 * 8. toString() ������
 * @author win10
 *
 */
public class Hat {
	// ������� ����
	private String hatId;
	private String type;
	private String material;
	private double size;
	private String color;
	private double price;
	private int quantity;
	private char gender;

	// ������ �����
	// �⺻ ������
	public Hat() {

	}

	// ������ �ʵ� �ʱ�ȭ 
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

	// 6.����� ������, ������ ����
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
	 * 1.print �޼ҵ�
	 */
	public void print() {
		System.out.printf("���ھ��̵�:%s, ����Ÿ��:%s, ���ڼ���:%s, ���� ������:%fcm, "
				        + "���ڻ���:%s, ����:%f, ��� ����:%d, ��� ����:%c%n"
				, hatId, type, material, size, color, price, quantity, gender);
	}

	/*
	 * 2.discount �޼ҵ�
	 */
	// amount ��ŭ ������ ����. ���� ���ݺ��� ū ���� ������ �Ұ����ϵ��� ����
	public double discount(int amount) {
		double price = this.price;
		if (price > (this.price * (amount / 100))) {
			price = price - (int)(this.price * (amount / 100));
		}

		return price;
	}

	/*
	 * 3.������ �ٲٴ� �޼ҵ�
	 */
	//���� ������ �Էµ� color �� �����Ͽ� ������ �����ϰ� ����� ������ ����
	public String dye(String color) {
//		if(this.color.equals(color)) {
			this.color = color;
//		}
		return this.color;
	}
	
	/*
	 *4.sell �޼ҵ�
	 */

	//amount ��ŭ ����
	public int sell(int amount) {
		if (quantity >= amount) {
			this.quantity -= amount;
		}
		
		return quantity;

	}

	/*
	 * 5.buy �޼ҵ�
	 */
	//amount��ŭ ����, ��� ����
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
	
	//7.hatId  �������� equals(), hashCode() ������
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
	
	//8.toString() ������
	@Override
	public String toString() {
		String strHat = String.format("���ھ��̵�:%s, ����Ÿ��:%s, ���ڼ���:%s, ���� ������:%5.2fcm, "
				+ "���ڻ���:%s, ����:%5.2f$, ��� ����:%d, ��� ����:%c"
				, hatId, type, material, size, color, price, quantity, gender);
		
		return strHat;
	}

}
