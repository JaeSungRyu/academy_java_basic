package inheritance.basic.person;
/**
 * �л��� ������ ������ Ŭ����
 * ����� ���� ������ ��� Ŭ������ Person�� ����Ѵ�.
 * @author win10
 *
 */
public class Student extends Person {
	//1.������� �����
	String major;
	
	//2.������ �����
	Student(){
		
	}
	
	Student(String major){
		this.major = major;
	}
	Student(String id,String name,int age,String major){
		super(id,name,age);
		//�θ� Ŭ������ �������� �ʱ�ȭ ����� ��������
		//super()Ű����� ������ ���� ù�ٿ� �ѹ��� ��밡��
		this.major = major;
	}

	//this,this() /super,super()
	
	//3.�޼ҵ� �����
	@Override
	public String toString() {
		String studentStr = String.format("���� : %s",major);
		return "�л�����["+ super.toString() + studentStr+"]";
	}
}
