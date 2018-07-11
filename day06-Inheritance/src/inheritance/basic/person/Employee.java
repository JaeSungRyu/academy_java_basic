package inheritance.basic.person;

public class Employee extends Person {
	//1.������� ����
	String dept;
	//2.������ ���� �ʱ�ȭ
	Employee(){
		
	}
	Employee(String dept){
		this.dept = dept;
	}
	Employee(String id,String name,int age,String dept){
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	@Override
	public String toString() {
		String deptStr = String.format("�μ� : %s", dept);
		return "�μ�����[" +super.toString() + deptStr+"]";
	}
}
