package account.two;
/**
 * ���� ���¸� �����ϴ� Ŭ����
 * -------------------------------------------
 * ������ �Ӽ��� ��Ÿ���� ���Ͽ� �ΰ��� ��������� ����
 * ���¹�ȣ : accNumber
 * �����ܾ� : balance
 * -------------------------------------------
 * �⺻ ������ : �Ű������� ����ִ� ������
 * �Ű������� �޴� �����ڸ� �ߺ� ����
 * -------------------------------------------
 * ������ �ܾ��� ������Ű�� �Ա� �޼ҵ� : deposit(account)
 * ������ ������¸� ����ϴ� �޼ҵ� : print()
 */
public class Account {
	//1.�������(��ü����) �����
	/*���¹�ȣ*/
	int accNumber;
	/*�ܾ�*/
	int balance;
	
	//2.������ �����
	/**
	 * �⺻ ������ : Ŭ���� �̸��� �����ϰ�(��ҹ��� ��ġ)
	 * �Ű����� ����� ����ִ� ������
	 */
	Account (){
		
	}
	/**
	 * ���¹�ȣ,���� �ܾ��� �Ű������� �޾Ƽ�
	 * �Էµ� ������ ���¸� �ʱ�ȭ�ϴ� ������
	 * @param newAccNumber : ���� ������ ������ ��ȣ
	 * @param newBalance   : ���� ������ ������ �ܾ�
	 */
	Account (int newAccNumber,int newBalance){
		accNumber = newAccNumber;
		balance = newBalance;
	}
	
	//3.�޼ҵ� �����
	/**
	 * �Էµ� amount��ŭ 
	 * �� ������ �ܾ��� �߰�
	 * @param amount : �Ա��� �ݾ�
	 */
	public void deposit(int amount) {
		balance += amount;
	}
	public void print() {
		System.out.printf("���¹�ȣ : %d | \t ���� �ܾ� : %d%n",
				          accNumber,balance);
	}
}
