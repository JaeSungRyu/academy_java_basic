package io.object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * adidas.obj ������ �о ��ü�� �����ϰ�
 * ǥ�� ������� ������ ��ü�� ������ Ȯ��
 * ------------------------------
 * --�Է�--
 * 1.node stream (���� : FileInputStream)
 * 2.filter stream (��ü�Է� :  ObjectInputStream)
 * 3.read�۾� :  filter stream �޼ҵ� ���
 * 
 * 
 * --���--
 * 4.ǥ�� ��� (�ܼ�:System.out)
 * 
 * --����--
 * 5.�Է� filter stream �ݱ�
 * 
 * @author win10
 *
 */
public class ReadProductObject {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		//1.input node stream
		FileInputStream fin = 
				new FileInputStream("adidas.obj");
		
		//2.input filter stream
		ObjectInputStream in = 
				new ObjectInputStream(fin);
		//3.read�۾�
		Product adidas = (Product)in.readObject();
		
		
		//4.��ü ǥ�� ���
		System.out.println(adidas);
		
		//5.�Է� filter stream �ݱ�
		in.close();
	}

}
