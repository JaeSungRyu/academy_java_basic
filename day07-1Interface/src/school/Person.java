package school;

/**
 * 일반적인 사람의 정보를 저장하는 클래스
 * --------------------------------
 * 캡슐화를 적용하여 멤버변수 필드를 모두 private으로 선언
 * id   : String
 * name : String
 * age  : int
 * --------------------------------
 * 
 * @author win10
 *
 */

public abstract class Person implements Attendance{
	//1.멤버변수 선언부
	private String id;
	private String name;
	private int age;
	
	//2.생성자 선언부
	//(1)기본생성자 : 생성자 선언부를 완전히 생략하면 
	//			     자동으로 기본생성자 선언이 들어짐
	Person(){
		
	}
	//(2)매개변수를 받는 생성자가 선언되고 
	//   기본생성자 선언이 누락되면 자동으로
	//	  기본 생성자를 만들어 주지 않음
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
	
	//접근자 수정자 생성
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//3.메소드 선언부
	//toString() 재정의
	@Override
	public String toString() {
		
		return String.format("아이디 : %s, 이름 : %s, 나이 : %d ",id,name,age);
	}
	//person의 정보 출력 메소드
	/**
	 * person의 정보 출력 : 메소드 head만 있고
	 * 구현부인 메소드 body를 생성하면 추상메소드로
	 * 만들수 있다.
	 */
	public abstract void print();
	
	
	
}
