package school;

public class Teacher extends Person implements Lesson{
		//������� ����
		private String subject;
		//������ ���� �ʱ�ȭ
		Teacher(){
			
		}
		Teacher(String subject){
			this.subject = subject;
		}
		Teacher(String id,String name,int age,String subject){
			super(id,name,age);
			this.subject = subject;
			
			//�޼ҵ� ����
			
		}
		//subject �ʵ� ������
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		
		
		@Override
		public String toString() {
			String teacherStr = String.format("���� : %s",subject);
			return "��������[" + super.toString() + teacherStr+"]";
		}
		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println("==����==");
			System.out.println(this);
			
			
		}
		 	@Override 
		 	public String attend() { 
		 		String tchStr = String.format("���� [%s](��)�� ����Ͽ����ϴ�." 
		                                      , this.getId()); 
		 		return tchStr; 
		 	} 
		 
		 
		 	@Override 
		 	public String lesson() { 
		 		// ���� [���̵�] (��)�� ����[�����] ������ �ϰ� �ֽ��ϴ�. 
		 		return String.format("���� [%s] (��)�� ����[%s] " 
		 						    + "������ �ϰ� �ֽ��ϴ�." 
		 						    , this.getId(), this.getSubject()); 
		 	} 
		 	 

		
	}
