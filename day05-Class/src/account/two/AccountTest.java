package account.two;
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
		Account myAccount;
		Account yourAccount;
		//2.�ʱ�ȭ
		//�⺻ �����ڷ� �ʱ�ȭ
		myAccount  = new Account();
		//�Ű������� �޴� �����ڷ� �ʱ�ȭ
		yourAccount = new Account(1,10000);
		
		//3.���
		//(0)�ʱ����
		myAccount.print();
		yourAccount.print();
		
		//(1)�Ա� 1000��
		myAccount.deposit(1000);
		yourAccount.deposit(1000);
		
		//(2)�������
		myAccount.print();
		yourAccount.print();
		
		//(3)�Ա� 5000��
		myAccount.deposit(5000);
		yourAccount.deposit(5000);
		
		//(4)�������
		myAccount.print();
		yourAccount.print();
		
		
	}

}
