package account.one;
/**
 * ���� ���¸� �����ϴ� Ŭ����
 * -------------------------------------------
 * ������ �Ӽ��� ��Ÿ���� ���Ͽ� �ΰ��� ��������� ����
 * ���¹�ȣ : accNumber
 * �����ܾ� : balance
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
	
	//2.������ �����(����)
	
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
