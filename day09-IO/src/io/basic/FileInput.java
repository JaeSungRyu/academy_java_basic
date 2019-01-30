package io.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * ���Ϸ� �Է��� �޾Ƽ�
 * ǥ�� ���(�ܼ�â)�� �ϴ� Ŭ����
 * ----------------------------------------------
 * -- �Է� --
 * 1. node stream (����(���� ����:reader) : FileReader)
 * 2. filter stream (reader -> reader : BufferdReader)
 * 3. filter stream �޼ҵ� ��� : readLine()
 * 
 * -- ��� --
 * 4. node stream (ǥ�� ��� : System.out : PrintStream)
 * 5. 1�� ��� : println() �޼ҵ� ���  
 * 
 * -- ���� --
 * 6. �Է� filter stream �ݱ�
 * 
 * @author PC38206
 *
 */
public class FileInput {

	public static void main(String[] args) throws IOException {

		// 1. input node stream : file reader
		FileReader fr = new FileReader("out.txt");
		
		// 2. input filter stream : reader -> reader
		BufferedReader br =
				new BufferedReader(fr);
		
		// 3. filter stream �޼ҵ�� �б� : readLine();
		String input = null;
		
		while ((input = br.readLine()) != null) {
			// 4. 5.
			System.out.println("���Ͽ��� ���� ������:" + input);
		}
		
		// 6. input filter stream �ݱ�
		br.close();
		
	}

}







