package io.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Product ��ü�� �����ϰ� ��ü ���� ����� �Ͽ�
 * adidas.obj ������ ����
 * --------------------------------------
 * --�Է�--
 * 1.Product ��ü ����
 * 
 * --���--
 * 2.node stream (���� : FileOutputStream)
 * 3.filter stream (��ü��� : ObjectOutputStream)
 * 4.write �۾�  : filter stream �޼ҵ� ���
 * 
 * --����--
 * 5.��� filter stream �ݱ�
 * 
 * 
 * @author win10
 *
 */
public class WriteProductObject {

	public static void main(String[] args) throws IOException {
		//1.�Է¿� Product ��ü����
		Product adidas = 
				new Product("S001", "���۽�Ÿ", 87200, 5);
		
		//2.output node stream
		FileOutputStream fos = 
				new FileOutputStream("adidas.obj");
		
		//3.output filter stream
		ObjectOutputStream out = 
				new ObjectOutputStream(fos);
		
		//4.write�۾�
		out.writeObject(adidas);
		
		System.out.println("==�Ƶ�ٽ� ��ü ��� �Ϸ�");
		
		//5.��� filter stream
		out.close();
		
		
	}

}
