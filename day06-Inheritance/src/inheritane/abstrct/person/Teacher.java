package inheritane.abstrct.person;

public class Teacher extends Person {
		//멤버변수 선언
		String subject;
		//생성자 선언 초기화
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
			
			//메소드 선언
			
		}
		@Override
		public String toString() {
			String teacherStr = String.format("과목 : %s",subject);
			return "과목정보[" + super.toString() + teacherStr+"]";
		}
		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println("==교사==");
			System.out.println(this);
		}
	}
