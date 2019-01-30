package io.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * ǥ�� �Է��� Ű���� �Է��� �޾Ƽ�
 * ǥ�� ����� ����ͷ� ����ϴ� Ŭ����
 * -----------------------------------------
 * 1. node stream   (Ű���� = System.in : InputStream)
 * 2. filter stream (stream --> reader : InputStreamReader)
 *    1����Ʈ ��ǲ��Ʈ���� 2����Ʈ ���ڷ� ����
 *    (Ű����� ��� ���� �Է��̹Ƿ�)
 *    
 * 3. filter stream (reader --> reader : BufferedReader)
 *    2����Ʈ ����1���� 1�� ������ �о 
 *    ��Ʈ������ ���� �� �ִ� ���� �޼ҵ带 ����Ѵ�.
 *   
 * 4. 3���� ������� filter stream ��ü�� ����Ͽ� 
 *    read() �۾� ����
 *    
 * 5. ���� ������ ǥ�� ���(����� = System.out)
 * 
 * 6. ������ filter stream �ݱ�(�ڿ� ����)
 * 
 * @author PC38206
 *
 */
public class KeyboardInput2 {

	public static void main(String[] args) {
		// 1. �Է� ��� ��Ʈ��(ǥ�� �Է�:Ű����)
//		InputStream in = System.in;
		
		// 2. ��� ��Ʈ���� ������ ���� ��Ʈ��
//		InputStreamReader ir =
//				new InputStreamReader(System.in);
		
		// 3. 2�� ���� ��Ʈ���� ���� ����� ���Ͽ�
		//    �ѹ� �� ������ ���� ��Ʈ��
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���� �Է��ϼ���... (ctrl + z �Է½� �ߴ�) ");
		
		// 4. 3�� ���� ��Ʈ���� �޼ҵ带 ����Ͽ� 
		//    Ű���� �Է��� �о� ���δ�.
		String readData = null;
		
		try {
			while ((readData = br.readLine()) != null) {
				// 5. null �� �ƴϸ� ���� �����Ͱ� �����Ƿ� ���
				System.out.println("���� ������ : " + readData);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 6. �ڿ� ���� : ���� �߻� ���ο� �������
			//                �׻� ���������� ������ �̷������ �ϹǷ�
			//                �ڿ� ���� ���� ������ finally ���� ����
			try {
				if (br != null)
					br.close();
				
			} catch (IOException e) {
				System.err.println("�ڿ� �ݳ� ����!" + e.getMessage());
				e.printStackTrace();
			}
		}
		

	}

}












