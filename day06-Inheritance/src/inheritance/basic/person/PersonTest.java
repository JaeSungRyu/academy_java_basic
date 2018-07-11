package inheritance.basic.person;
/**
 * Person과 상속관계인 Student를
 * 테스트하는 클래스이다.
 * @author win10
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		
		//1.선언 //2.초기화
		Person person = new Person("P01","홍길동",18);
		Student student = new Student("S02","홍길동",18,"도술");
		Employee employee = new Employee("E03","홍길동",18,"문화예술 지원부");
		Teacher teacher = new Teacher("T04","홍길동",18,"행정");
				
		//3.사용
		System.out.println(person);
		System.out.println(student);
		System.out.println(teacher);
		System.out.println(employee);
	}

	
}
