package operator.binary;
/**
 * ���迬���� : ��Һ�,��� �����ڸ� �׽�Ʈ
 * ��Һ� : > , < , >= , <=
 * ��� : ==,!=
 * 
 * ���迬���� ����� boolean Ÿ������ �����
 * @author win10
 *
 */
public class RelationalTest {

	public static void main(String[] args) {
		//1.���� 2.�ʱ�ȭ
		int a = 1;
		int b = -5;
		
		//3.���
		System.out.printf("(%d == %d) : %b%n",a,b,(a==b));
		System.out.printf("(%d != %d) : %b%n",a,b,(a!=b));
		System.out.printf("(%d > %d) : %b%n",a,b,(a>b));
		System.out.printf("(%d < %d) : %b%n",a,b,(a<b));
		System.out.printf("(%d >= %d) : %b%n",a,b,(a>=b));
		System.out.printf("(%d <= %d) : %b%n",a,b,(a<=b));
		
		
		/**-----------------------------------------------
		 * printf()�޼ҵ忡�� ����ϴ� ���� ��Ʈ���� ����
		 *------------------------------------------------
		 *%d : ����ǥ��,decimal�� ����
		 *%f : �Ǽ�ǥ��,float�� ����
		 *%b : boolean�� ǥ��,boolean�� ����
		 *%s : ���ڿ� ǥ��,String�� ����
		 *%x : 16���� ǥ��,hexa�� ����
		 *%% : %��ȣ ��ü�� �߷���
		 *%n : new-line,����Ű �Է°� ���� ȿ��
		 *------------------------------------------------
		 */
		
		 //���� ī�� : ctrl + alt + up/down
		 //���� �̵� : alt + up/down
		 //���� ���� ��� ���� : alt + shift + a
	
	
	}    

}
