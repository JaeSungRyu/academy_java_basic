package io.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �̹��� ���Ϸ� �Է��� �޾Ƽ�
 * �̹��� ���Ϸ� ����ϴ� Ŭ���� (Stream���θ� �۾��ϴ� Ŭ����)
 * ---------------------------------------------------
 * --�Է�--
 * 1.node stream(FileInputStream)
 * 2.read �۾� : node stream �޼ҵ�� �۾� : read()
 * 
 * 
 * --���--
 * 3.node stream (FileOutputStream)
 * 4.write �۾� :  node stream �޼ҵ�� �۾� : write();
 * 
 * --����--
 * 5.�Է� node stream �ݱ�
 * 6.��� node stream �ݱ�
 * 
 * @author win10
 *
 */
public class ImageCopy {

	public static void main(String[] args) throws IOException {
		//1.input node stream (FileInputStream)
		FileInputStream in =  
			new FileInputStream("flower.jpg");
		
		//=========�Է� node stream ���� ,�ʱ�ȭ ��
		
		//3.output node stream(FileOutputStream)
		FileOutputStream out = 
				new FileOutputStream("flower-copied.jpg");
		//=========��� node 
		
		//2.read�۾� :  read()�޼ҵ� ���
		//node stream�� read() �� ������ ��
		//byte[] �� �Ű������� �޴� �޼ҵ带 ���
		
		//(1)BYTE �迭 :  buffer�� ����
		byte[] buffer = new byte[4096];

		//(2)��� ��Ʈ���� read()�޼ҵ�� �о���� ����Ʈ ��
		//	 �� ������ ����, ���� �����Ͱ� ������ -1����
		int readSize = 0;
		int repeat = 0;
		in.read();
		
		//(3)read()
		while((readSize = in.read(buffer))!=-1) {
			//(4)write()�۾� : node stream�޼ҵ�� ����
			out.write(buffer);
			//ȭ�鿡 �۾����� ���
			System.out.printf("���� ����Ʈ : %d\t"  
					+"�ݺ�Ƚ�� : %d%n",readSize,++repeat);
			
		}
		System.out.println("�̹��� ���� ���簡 �Ϸ� �Ǿ����ϴ�.");
		
		//5.6. ����¿� ���� ��带 �ݽ��ϴ�.
		in.close();
		out.close();
	}
	
}
