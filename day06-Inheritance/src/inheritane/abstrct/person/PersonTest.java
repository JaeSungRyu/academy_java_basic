package inheritane.abstrct.person;
/**
 * Person�� ��Ӱ����� Student��
 * �׽�Ʈ�ϴ� Ŭ�����̴�.
 * @author win10
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		
		//1.���� //2.�ʱ�ȭ
		Person[] persons = new Person[3];
		persons[0] = new Student("S02","ȫ�浿",18,"����");
		persons[1] = new Employee("E03","�����",25,"����");
		persons[2] = new Teacher("T04","���",48,"��ȭ���� ������");
				
		//3.���
		for(Person person: persons) {
			person.print();
		}	
	}
}
