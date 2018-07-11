package inheritane.abstrct.person;
/**
 * Person과 상속관계인 Student를
 * 테스트하는 클래스이다.
 * @author win10
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		
		//1.선언 //2.초기화
		Person[] persons = new Person[3];
		persons[0] = new Student("S02","홍길동",18,"도술");
		persons[1] = new Employee("E03","정약용",25,"행정");
		persons[2] = new Teacher("T04","허균",48,"문화예술 관광부");
				
		//3.사용
		for(Person person: persons) {
			person.print();
		}	
	}
}
