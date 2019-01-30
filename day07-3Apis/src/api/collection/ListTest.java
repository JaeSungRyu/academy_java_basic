package api.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ü�� ���(Element)�� �����ϴ� �÷��� �߿���
 * 
 * 1.�ߺ����� ���
 * 2.�����������
 * 
 * ���� �����͸� �����ϴ� ListŸ���� �׽�Ʈ�Ѵ�
 * @author win10
 *
 */
public class ListTest {

	public static void main(String[] args) {
		/*---------------------------------
		 * ArrayList �迭�� ������ ������ ���� Ŭ����
		 * 1.ó�� �����Ҷ� ũ�Ⱑ �����Ǵ� ��
		 * 2.������ �߰��� �������� ũ�⺯�� �Ұ��� �� ��
		 * 3.������ ������ �� �ε��� ó���� �ȵǴ°�
		 * 
		 * ���� ���� 
		 * --------------------------------
		 */
		//1.����
		List list;
		
		//2.�ʱ�ȭ
		list = new ArrayList();
		
		//3.���
		//(1)����Ʈ�� ������ �߰�
		 System.out.println(list.add("1st Item"));
		 System.out.println(list.add(2));	//auto - boxing �ڵ����� wrapper�� ������
		 System.out.println(list.add(new Double(3.0)));
		 System.out.println(list.add(new Boolean(true)));
		 System.out.println(list.add(false)); //auto - boxing
		 
		 /*
		  * ---------------------------------------------------
		  * auto - boxing : �÷��� �⺻�� ������ �߰���
		  * 				�ڵ����� ��ü�� �����ͷ� ����
		  * 				(wrapper Ŭ���� �۵�)
		  * 				�Ǵ� ���
		  * 				1.5�������� ����
		  * ---------------------------------------------------
		  * auto-unboxing : �÷��ǿ��� ����� �⺻�� �����͸� �̾��� �� 
		  * 				�� ��ȯ ���� �ٷ� �⺻�� ������ �����ϴ� ���
		  * 				1.5�������� ����
		  * ---------------------------------------------------
		  */
		 
		 int two = (Integer)list.get(1);
		 
		 
		 
		//������ ������ �߰��õ�
		 System.out.println("===������ ������ �߰��õ�===");
		 System.out.println(list.add("1st Item"));
		 
		
		//(2)����Ʈ ���
		System.out.println("====list ���� ���====");
		System.out.println(list);

		System.out.println("=========foreach�� ���=========");
		 for(Object obj:list) {
			 System.out.println(obj);
		 }

		System.out.println("====index ��� for�� ���====");
		for (int idx = 0; idx < list.size(); idx++) {
			System.out.println(list.get(idx));
		}
	}
}
