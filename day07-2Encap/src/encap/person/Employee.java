package encap.person;

public class Employee extends Person {

	// 1. ��� ����
	private String dept;
	
	// 2. ������
	Employee() {
		
	}
	
	Employee(String id, String name, int age, String dept) {
		super(id, name, age);
		this.dept = dept;
	}

	/** dept �ʵ��� ������ */
	public String getDept() {
		return dept;
	}

	/** dept �ʵ��� ������ */
	public void setDept(String dept) {
		this.dept = dept;
	}

	// 3. �޼ҵ�
	@Override
	public String toString() {
		String empStr = String.format(", �μ�:%s", this.dept);
		return "���� ����[" + super.toString() + empStr + "]";
	}

	@Override
	public void print() {
		System.out.println("== ���� ==");
		System.out.println(this);
	}
	
	
}








