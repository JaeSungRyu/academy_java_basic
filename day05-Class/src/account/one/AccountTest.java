package account.one;
/**
 * ����(Account)Ŭ������ �ν��Ͻ�(��ü,��ü)��
 * �����ϰ� �Աݱ��,��������� ���µ��� ����غ���
 * �׽�Ʈ�ϴ� Ŭ����
 * @author win10
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		//1.���� : ������ ��ü ���� ����
		Account account;
		//2.�ʱ�ȭ
		account  = new Account();
		
		//3.���
		//(0)�ʱ����
		account.print();
		
		//(1)�Ա� 1000��
		account.deposit(1000);
		
		//(2)�������
		account.print();
		
		//(3)�Ա� 5000��
		account.deposit(5000);
		
		//(4)�������
		account.print();
		
		
	}

}
