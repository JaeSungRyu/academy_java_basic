package io.data;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * ��ü ������ ��� ������ �о
 * ������ ������ �Է� �ް�
 * �� �������� ��ü�� ����
 * ------------------------------------
 * --�Է�--
 * 1.node stream(���� : FileInputStream)
 * 2.filter stream(������ ���� �Է� : DataInputStream)
 * 3.read�۾� : filter stream �޼ҵ�� �۾�
 * 
 * --���--
 * 4. read �� ���� ���� �����ͷ� ��ü ����
 * 5. ǥ�� ���(�ܼ� : System.out)
 * 
 * --����--
 * 6.�Է� filter stream
 * 
 * @author win10
 *
 */
public class ReadProductData {

	public static void main(String[] args)throws IOException {
		//1.input node stream
		FileInputStream fin = 
				new FileInputStream("adidas.data");
		
		//2.input filter stream :  data input stream
		DataInputStream in = 
				new DataInputStream(fin);
		
		//3.read �۾�
		//(1)product ��ü ������ ���� �ʿ��� �����鿡 ���
		String prodCode = in.readUTF();
		String prodName = in.readUTF();
		int price = in.readInt();
		int quantity = in.readInt();
		
		//(2)���� ����ִ� ������  Product ��ü ����
		Product adidas = 
				new Product(prodCode,prodName,price,quantity);
		
		//4.ǥ�� ���
		System.out.println(adidas);
	
		//5.�Է� filter stream �ݱ�
		in.close();
		
		
		//��带 ���� ���� �Ҳ��� ���͸� ���� ���� �Ҳ��Ŀ� ���� 
		//�����ϴ°��� �����ϸ� �ڹ� api�� ����ϴµ� ����
	}

}
