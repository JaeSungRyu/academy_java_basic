package school;
/**
 * �л��� ������ ������ Ŭ����
 * ����� ���� ������ ��� Ŭ������ Person�� ����Ѵ�.
 * @author win10
 *
 */
public class Student extends Person implements Lesson{
	//1.������� �����
	private String major;
	
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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("==�л�==");
		System.out.println(this);
		
		
	}

	 	@Override 
	 	public String attend() { 
	 		String stdStr = String.format("�л� [%s](��)�� �⼮�Ͽ����ϴ�." 
	                                      , this.getId()); 
	 		return stdStr; 
	 	} 
	 
	 
	 	@Override 
	 	public String lesson() { 
	 		// �л�[���̵�] �̰� ����[�����] ������ ��� �ֽ��ϴ�. 
	 		return String.format("�л�[%s] (��)�� ����[%s] " 
	 				           + "������ ��� �ֽ��ϴ�." 
	 			                , this.getId(), this.getMajor()); 
	 	} 

}
