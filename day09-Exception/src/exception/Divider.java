package exception;

/**
 * int �� �Է� �� �ϳ��� �޾Ƽ�
 * ������ ������ ����ϴ� �޼ҵ带 ���� Ŭ����
 * 
 * �� �޼ҵ�� �Է� ���� 1, 0 �� ���� 0���� ������
 * ��Ȳ�� �߻��ϴ� ������ ó���Ѵ�.
 * �Է� ���� ���� 0���� ������ ��Ȳ�� �߻��� ���� �ְ�
 * �߻����� ���� ���� �ִ�.
 * 
 * 0���� ������ ��Ȳ�� �߻��ϴ� ��� 
 * DivideZeroException�� ����Ͽ�
 * ������ ó���ϵ��� ����.
 * 
 * 
 * @author PC38206
 *
 */
public class Divider {

	// 2. ������ �����
	// �⺻������ ���
	public Divider() { }
	
	// 3. �޼ҵ� �����
	public int divide(int x) throws DivideZeroException {
		switch (x) {
		case 0: case 1:
			throw new DivideZeroException();
			
		default:
			break;
		}
		
		int result = (int)(100 / (x * (x - 1)));
		return result;
		
	}
}
