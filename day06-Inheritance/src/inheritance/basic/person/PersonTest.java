package inheritance.basic.person;
/**
 * Person�� ��Ӱ����� Student��
 * �׽�Ʈ�ϴ� Ŭ�����̴�.
 * @author win10
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		
		//1.���� //2.�ʱ�ȭ
		Person person = new Person("P01","ȫ�浿",18);
		Student student = new Student("S02","ȫ�浿",18,"����");
		Employee employee = new Employee("E03","ȫ�浿",18,"��ȭ���� ������");
		Teacher teacher = new Teacher("T04","ȫ�浿",18,"����");
				
		//3.���
		System.out.println(person);
		System.out.println(student);
		System.out.println(teacher);
		System.out.println(employee);
	}

	
}
