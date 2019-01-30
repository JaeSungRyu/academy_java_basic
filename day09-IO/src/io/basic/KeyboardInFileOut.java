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
 * --�Է�--
 * 1.node stream(Ű���� : System.in : InputStream)
 * 2.filter reader (stream -> reader : InputStreamReader )
 * 3.filter stream (reader -> reader : BufferedReader)
 * 4.3�� filter stream�� ���Ͽ� 1�� ������
 * String �Է����� ó���ϴ� �޼ҵ� readLine()�� ���
 * 
 * --���--
 * 5.node stream(���� - �������� ����(writer) : FileWriter)
 * 6.filter stream(writer -> writer : PrintWriter)
 *   1�� ���� ����� �����ϴ� �޼ҵ�  println()�� ���
 * 7.6�� filter stream�� ���Ͽ� ���
 * 
 * 
 * --����--
 * 8.�Է¿��� ���������� ���� filter stream �ݱ�
 * 9.��¿��� ���������� ���� filter stream �ݱ�
 * 
 * @author win10
 *
 */
public class KeyboardInFileOut {

	public static void main(String[] args)throws IOException{
		//1.input node stream : System.in
		InputStream in = System.in;
		
		//2.node stream -> filter stream : inputStream -> reader
		InputStreamReader ir  
			= new InputStreamReader(in);
		
		//3filter -> filter
		BufferedReader br
			= new BufferedReader(ir);
		//=========�Է� ��ü�� ���� ����, �ʱ�ȭ ��
		
		//5.output node writer 
		FileWriter fw= new FileWriter("out.txt");
		
		//6.node -> filter : 1�� ���� ���
		PrintWriter pw = new PrintWriter(fw);
		//=========��� ��ü�� ���� ����,�ʱ�ȭ ��
		
		//4.�Է�
		System.out.println("���� �Է��ϼ���.... cltl + z �Է½� �ߴ�");
		String input = null;
		while((input = br.readLine()) != null) {
			//7.��� filter stream�� ����
			//	���� ����
			pw.println(input);
			//ȭ�鿡�� ���� ���
			System.out.println("���� ������" + input);
		}
		
		//8.�Է� filter stream �ݱ�
		br.close();
		
		//9.��� filter stream �ݱ�
		pw.close();
		
	}

}
