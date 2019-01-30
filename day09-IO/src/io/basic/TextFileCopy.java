package io.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;

/**
 * ���� �Է��� �޾Ƽ�
 * ���Ϸ� ����ϴ� Ŭ����
 * ----------------------------------
 * --�Է�--
 * node stream(����(reader)����: FileReader )
 * 2.filter stream (reader -> reader : BufferReader)
 * 3.filter stream�� �޼ҵ� ���

 * --���--
 * 4.node stream (����(writer)���� : FileWriter)
 * 5.filter stream (writer -> writer : PrintWriter)
 * 6.write�۾� : filter stream �� �޼ҵ� ��� : println
 * 
 * --����--
 * 7.�Է� filter stream�ݱ�
 * 8.��� filter stream�ݱ�
 * 
 * @author win10
 *
 */
public class TextFileCopy {

	public static void main(String[] args)throws IOException {
		//1.input node stream 
		FileReader fr = new FileReader("out.txt");
		
		//2.intput filter stream 
		BufferedReader br =
				new BufferedReader(fr);
		
		//===========�Է� ��ü ���� ��
		
		//4. output node stream
		FileWriter fw = new FileWriter("copied.txt");
		
		//5.output filter stream
		PrintWriter pw =  new PrintWriter(fw);
		
		//=========��� ��ü ����, �ʱ�ȭ ��
		String input = null;
		
		while((input = br.readLine())!=null) {
			//6.write �۾�
			pw.println(input);
			//ȭ�� ��� ����
			System.out.println("���Ͽ��� ���� ������ : " + input);
		}
		
		System.out.println("���� ���簡 �Ϸ� �Ǿ����ϴ�");
		//input filter stream �ݱ�
		br.close();
		//output filter stream �ݱ�
		pw.close();
	}

}
