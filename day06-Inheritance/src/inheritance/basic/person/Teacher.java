package inheritance.basic.person;

public class Teacher extends Person {
		//������� ����
		String subject;
		//������ ���� �ʱ�ȭ
		Teacher(){
			
		}
		Teacher(String subject){
			this.subject = subject;
		}
		Teacher(String id,String name,int age,String subject){
			this.id = id;
			this.name = name;
			this.age  = age;
			this.subject = subject;
			
			//�޼ҵ� ����
			
		}
		@Override
		public String toString() {
			String teacherStr = String.format("���� : %s",subject);
			return "��������[" + super.toString() + teacherStr+"]";
		}
	}
