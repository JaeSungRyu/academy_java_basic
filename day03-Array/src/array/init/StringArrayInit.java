package array.init;
/**
 * �������� ��ǥŸ����  String�� 
 * �����ϴ� �迭�� �����ϰ� �ʱ�ȭ ��
 * �������� �⺻������ �ʱ�ȭ�� �� ���Ҹ� Ȯ���Ѵ�
 * @author win10
 *
 */
public class StringArrayInit {

	public static void main(String[] args) {
		//1.����
		String[] names;
		//2.�ʱ�ȭ
		names = new String[10];
		//3.���
		for(String name : names) {
			System.out.printf("name = %s%n",name);
			
		}
		for(int idx=0;idx<names.length;idx++) {
			System.out.printf("name[%d]=%s%n",idx,names[idx]);
		}
	}
}
