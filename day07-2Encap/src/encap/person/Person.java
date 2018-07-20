package encap.person;

/**
 * �Ϲ����� ����� ������ �����ϴ� Ŭ����
 * ------------------------------------------------
 * ĸ��ȭ�� �����Ͽ� ������� �ʵ带 ��� private ���� ����
 * id   : String
 * name : String
 * age	: int
 * -------------------------------------------------
 * �� �ʵ帶�� ������/������(getter/setter) �ۼ�
 * @author PC38206
 *
 */
public abstract class Person {
	
	// 1. ��� ���� �����
	private String id;
	private String name;
	private int age;
	
	// 2. ������ �����
	// (1) �⺻ ������ : ������ ����θ� ������ �����ϸ�
	//                   �ڵ����� �⺻������ ������ ����
	Person() {
		
	}
	
	// (2) �Ű������� �޴� �����ڰ� ����ǰ�
	//     �⺻ ������ ������ ������ ���� �ڵ����� 
	//     �⺻ �����ڸ� ��������� ����
	Person(String id) {
		this();
		this.id = id;
	}
	
	Person(String id, String name) {
		this(id);
		this.name = name;
	}

	Person(String id, String name, int age) {
		this(id, name);
		this.age = age;
	}
	
	// ������ ������ ����

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 3. �޼ҵ� �����
	// toString() ������
	@Override
	public String toString() {
		return String.format("ID:%s, NAME:%s, AGE:%d"
				            , id, name, age);
	}
	
	
	// person �� ���� ��� �޼ҵ�
	/**
	 * Person�� ������ ��� : �޼ҵ� header �� �ְ�
	 * �������� �޼ҵ� body �� �����ϸ� �߻�޼ҵ��
	 * ���� �� �ִ�.
	 */
	public abstract void print();
}












