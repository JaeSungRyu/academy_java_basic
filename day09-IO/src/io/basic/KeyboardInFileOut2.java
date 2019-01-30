package io.basic;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * ǥ�� �Է��� Ű���� �Է��� �޾Ƽ�
 * �Էµ� ������ ���Ϸ� ����ϴ� Ŭ����
 * ---------------------------------------
 * -- �Է� --
 * 1. node stream (Ű���� = System.in : InputStream)
 * 2. filter stream (stream -> reader : InputStreamReader)
 * 3. filter stream (reader -> reader : BufferedReader)
 * 4. 3�� filter stream �� ���Ͽ� 1�� ������
 *    String �Է����� ó���ϴ� �޼ҵ� readLine() �� ���
 * 
 * -- ��� --
 * 5. node stream (���� - ��������(writer) : FileWriter)
 * 6. filter stream (writer -> writer : PrintWriter)     
 * 7. 6�� filter stream �� ���Ͽ� 
 *    1�� ���� ����� �����ϴ� �޼ҵ� println() �� ���     
 * 
 * -- ���� --
 * 8. �Է¿��� ���������� ���� filter stream �ݱ�
 * 9. ��¿��� ���������� ���� filter stream �ݱ� 
 *  
 * @author PC38206
 *
 */
public class KeyboardInFileOut2 {

	public static void main(String[] args) {

		// 1. Input node stream : System.in
//		InputStream in = System.in;
		
		// 2. node stream -> filter stream : inputStream -> reader
//		InputStreamReader ir
//			= new InputStreamReader(System.in);
		
		// 3. filter -> filter : 1�� ���� �Է�
		BufferedReader br 
		 	= new BufferedReader(new InputStreamReader(System.in));
		
		// ======== �Է� ��ü�� ���� ����, �ʱ�ȭ ��
		
		// 5. output node writer
//		FileWriter fw = new FileWriter("out.txt");
		
		// 6. node -> filter : 1�� ���� ���
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter("out.txt"));
			// ========= ��� ��ü�� ���� ����, �ʱ�ȭ ��
			
			// 4. �Է� filter stream ���� �б�
			System.out.println("���� �Է��ϼ���... (ctrl + z �Է½� �ߴ�) ");
			String input = null;
			
			while ((input = br.readLine()) != null) {
				// 7. ��� filter stream �� ����
				//    ���� ����
				pw.println(input);
				//    ȭ�鿡�� ���� ��� (Ȯ���� ���� ����)
				System.out.println("���� ������:" + input);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
			// 8. �Է� filter stream  �ݱ�
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			// 9. ��� filter stream �ݱ�
			if (pw != null)
				pw.close();
			
		} // end try ~ catch ~ finally
		
	} // end main

} // end class









