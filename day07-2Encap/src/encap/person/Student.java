package encap.person;

/**
 * �л��� ������ ������ Ŭ����
 * ����� ���� ������ ��� Ŭ������ Person�� ����Ѵ�.
 * @author PC38206
 *
 */
public class Student extends Person {
	
	// 1. ������� �����
	private String major;
	
	// 2. ������ �����
	Student() { }
	
	Student(String major) {
		this.major = major;
	}
	
	Student(String id, String name, int age, String major) {
		super(id, name, age);
		// �θ� Ŭ������ �������� �ʱ�ȭ ����� ��������
		// super() Ű����� ������ ���� ù�ٿ� 1���� ����
		this.major = major;
	}
	
	/** major �ʵ��� ������ */
	public String getMajor() {
		return major;
	}

	/** major �ʵ��� ������ */
	public void setMajor(String major) {
		this.major = major;
	}

	// 3. �޼ҵ� �����
	@Override
	public String toString() {
		String studentStr = String.format(", ����:%s", major);
		return "�л� ����[" + super.toString() + studentStr + "]";
	}

	@Override
	public void print() {
		System.out.println("== �л� ==");
		System.out.println(this);
	}

}








