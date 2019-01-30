package exception;

import java.util.Scanner;

/**
 * �Է°��� ���� 0���� ������ ��Ȳ�� �߻��� �� �ִ�
 * Divider Ŭ������ �׽�Ʈ�Ѵ�.
 * 
 * �׽�Ʈ �������� DivideZeroException�� 
 * try ~ catch �������� ó���Ѵ�.
 * 
 * @author PC38206
 *
 */
public class DividerTest {

	public static void main(String[] args) {
		// 1. ����
		Scanner scan;
		int input;
		Divider div;
		
		// 2. �ʱ�ȭ
		scan = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		input = scan.nextInt();
		
		div = new Divider();
		
		// 3. ���
		try {
			int result = div.divide(input);
			System.out.printf("������ ����:	%d%n", result);
			
		} catch (DivideZeroException e) {
			System.err.printf("������ ����: %s%n", e);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("���α׷� ����");
	}

}
