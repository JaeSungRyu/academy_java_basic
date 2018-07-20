package encap.person;

public class Teacher extends Person {

	// 1. �������
	private String subject;
	
	// 2. ������
	Teacher() {
		
	}
	
	Teacher(String id, String name, int age, String subject) {
		super(id, name, age);
		this.subject = subject;
	}

	/** subject �ʵ� ������ */
	public String getSubject() {
		return subject;
	}

	/** subject �ʵ� ������ */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	// 3. �޼ҵ�
	@Override
	public String toString() {
		String tcStr = String.format(", ����:%s", this.subject);
		return "���� ����[" + super.toString() + tcStr + "]";
	}

	@Override
	public void print() {
		System.out.println("== ���� ==");
		System.out.println(this);
	}
	
	
}










