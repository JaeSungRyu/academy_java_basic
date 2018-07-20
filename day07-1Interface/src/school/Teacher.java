package school;

public class Teacher extends Person implements Lesson{
		//멤버변수 선언
		private String subject;
		//생성자 선언 초기화
		Teacher(){
			
		}
		Teacher(String subject){
			this.subject = subject;
		}
		Teacher(String id,String name,int age,String subject){
			super(id,name,age);
			this.subject = subject;
			
			//메소드 선언
			
		}
		//subject 필드 접근자
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
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
		 	@Override 
		 	public String attend() { 
		 		String tchStr = String.format("교사 [%s](이)가 출근하였습니다." 
		                                      , this.getId()); 
		 		return tchStr; 
		 	} 
		 
		 
		 	@Override 
		 	public String lesson() { 
		 		// 교사 [아이디] (이)가 과목[과목명] 수업을 하고 있습니다. 
		 		return String.format("교사 [%s] (이)가 과목[%s] " 
		 						    + "수업을 하고 있습니다." 
		 						    , this.getId(), this.getSubject()); 
		 	} 
		 	 

		
	}
