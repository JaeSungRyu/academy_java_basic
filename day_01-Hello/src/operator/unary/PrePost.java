package operator.unary;
/**
 * ���� ������ : ����������(++,--)�� �׽�Ʈ �ϴ� Ŭ����
 * ���� �������� ��ġ�� ���� ���� ��ȭ�� Ȯ��
 * ----------------------------------------
 * 
 * ���� �տ� ���̴� ���� �� ���� ����� ���
 * ���� �ڿ� ���̸� �����Ǳ� ���� ���� ����� ����.
 * @author win10
 *
 */
public class PrePost {

	public static void main(String[] args) {
		//1.����
		int count = 0;
		//3.���
//		System.out.println(++count); //0->1
//		System.out.println(count++); //ȭ�� ��� �� 1->2 
//		System.out.println(--count); //2->1
//		System.out.println(count--); //ȭ�� ��� �� 1->0
		
		
		System.out.println("���� �� ||"+"���� �� ��"); //0->1
		System.out.println(++count+"       "+count); //0->1
		System.out.println(count+++"       "+count); //ȭ�� ��� �� 1->2 
		System.out.println(--count+"       "+count); //2->1
		System.out.println(count--+"       "+count); //ȭ�� ��� �� 1->0
		
	
	}

}
