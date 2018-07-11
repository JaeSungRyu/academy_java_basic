package inheritance.basic.person;
/**
 * �Ϲ����� ����� ������ �����ϴ� Ŭ����
 * --------------------------------
 * id   : String
 * name : String
 * age  : int
 * --------------------------------
 * @author win10
 *
 */
public class Person {
	//1.������� �����
	String id;
	String name;
	int age;
	
	//2.������ �����
	//(1)�⺻������ : ������ ����θ� ������ �����ϸ� 
	//			     �ڵ����� �⺻������ ������ �����
	Person(){
		
	}
	//(2)�Ű������� �޴� �����ڰ� ����ǰ� 
	//   �⺻������ ������ �����Ǹ� �ڵ�����
	//	  �⺻ �����ڸ� ����� ���� ����
	Person(String id){
		this();
		this.id = id;
	}
	Person(String id, String name){
		this(id);
		this.name = name;
	}
	Person(String id, String name, int age){
		this(id,name);
		this.age = age;
	}
	//3.�޼ҵ� �����
	//toString() ������
	@Override
	public String toString() {
		
		return String.format("���̵� : %s, �̸� : %s, ���� : %d ",id,name,age);
	}
	
}
