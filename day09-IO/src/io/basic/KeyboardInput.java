package io.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * ǥ�� �Է��� Ű���� �Է��� �޾Ƽ� 
 * ǥ�� ����� ����ͷ� ����ϴ� Ŭ����
 * ----------------------------
 * 1.node stream (Ű���� = System.in : InputStream)
 * 2.filter stream (stream-->reader : InputStreamReader)
 * 	 1����Ʈ ��ǲ��Ʈ���� 2����Ʈ ���ڷ� ����
 * (Ű����� ��� ���� �Է��̹Ƿ�)
 * 
 * 3.filter stream(reader->reader : BufferedReader)
 *   2����Ʈ ���� 1���� 1�ٴ����� �о String���� ����� �ִ�
 *   ���� �޼ҵ带 ����Ѵ�
 *   
 * 4.3���� ������� filter stream��ü�� ����Ͽ�
 * 	 read() �۾��� ����
 * 5.���� ������ ǥ�� ���(����� = System.out)
 * 6.������ filter steam �ݱ�
 *   
 * @author win10
 *
 */
public class KeyboardInput {
	public static void main(String[] args) throws IOException {
		//1.�Է� ��� ��Ʈ��(ǥ�� �Է�:Ű����)
		InputStream  in = System.in;	
		
		//2.��� ��Ʈ���� ������ ���� ��Ʈ��
		InputStreamReader ir = 
				new InputStreamReader(in);
		//3.2�� ���� ��Ʈ���� ���� ����� ���Ͽ� 
		// 	�ѹ� �� ������ ���� ��Ʈ��
		BufferedReader br = 
				new BufferedReader(ir);
		
		System.out.println("���� �Է��ϼ���....(cltl + z �Է½� �ߴ�)");
		
		//4. 3�� ���� ��Ʈ���� �޼ҵ带 ����Ͽ�
		//	Ű���� �Է��� �о� ���δ�.
		String readData = null;
		while((readData = br.readLine()) != null) {
			//5.null�� �ƴϸ� ���� �����Ͱ� �����Ƿ� ���
			System.out.println("���� ������ : " +  readData);
		}
		br.close();
	}
}
