package inheritane.abstrct.person;

public class Employee extends Person {
	//1.멤버변수 선언
	String dept;
	//2.생정자 선언 초기화
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
		String deptStr = String.format("부서 : %s", dept);
		return "부서정보[" +super.toString() + deptStr+"]";
	}
	@Override
	public void print() {
		System.out.println("==직원==");
		System.out.println(this);
		
	}
}
