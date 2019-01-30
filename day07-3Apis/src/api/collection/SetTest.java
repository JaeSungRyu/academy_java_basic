package api.collection;
import java.util.HashSet;
import java.util.Set;

/**
 * ��ü�� ��ҷ� �����ϴ� �÷��� �߿���
 * 1.�ߺ��� ������ϰ�
 * 2.�����������
 * 
 * ���� �����ϴ� Set Ÿ���� �׽�Ʈ �Ѵ�.
 * @author win10
 *
 */
public class SetTest {

	public static void main(String[] args) {
		//1.Set ����
		Set set;
		//2.Set �ʱ�ȭ : Set �������̽� ����Ŭ������
		//  		   HashSet���� ����
		 set = new HashSet();
		 
		 //3.���
		 //(1)�¿� ������ �߰�
		 System.out.println(set.add("1st Item"));
		 System.out.println(set.add(2));
		 System.out.println(set.add(new Double(3.0)));
		 System.out.println(set.add(new Boolean(true)));
		
		 //����� ���� Ÿ�� ��ü�� �߰�
		 Product product = new Product("P0001","MS-��ũ��ġ ���콺"
		           ,51330,33);
		 
		 //������ ������ �߰��õ�
		 System.out.println("===������ ������ �߰��õ�===");
		 System.out.println(set.add("1st Item"));
		 
		 //(2)set���� ���
		 System.out.println("===���� ���� ���===");
		 System.out.println(set);
		 
		 System.out.println("=========foreach�� ���=========");
		 for(Object obj:set) {
			 System.out.println(obj);
		 }
	}

}
