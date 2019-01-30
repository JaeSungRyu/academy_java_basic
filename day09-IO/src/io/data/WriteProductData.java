package io.data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * ��ü ���� �� ��ü�� ������ �ʵ�(��� ����)�� ���
 * -----------------------------------
 * --�Է�--
 * 1.Product ��ü ����
 * 
 * --���--
 * 2.node stream (���Ͽ� ���:FileOutputStream)
 * 3.filter stream (data ���� ��� : DataOutpupStream)
 * 4.write�۾� : filter steam �� �޼ҵ�� ���
 * 
 * --����--
 * 5.��� filter stream �ݱ�
 * 
 * 
 * @author win10
 *
 */
public class WriteProductData {

	public static void main(String[] args)throws IOException {
		//1.�Է´�� ��ü����
		Product adidas = 
				new Product("S001", "���۽�Ÿ", 87200, 5);
		//2.��� node stream
		 FileOutputStream fos = 
				 new FileOutputStream("adidas.data");
		 
		 //3.���: filter stream
		 DataOutputStream out
		 	= new DataOutputStream(fos);
		 
		 //4.write �۾� : filter stream�� �޼ҵ� ���
		 //	������ Ÿ�Ժ��� ��� �޼ҵ带 ����
		 out.writeUTF(adidas.getProdCode());
		 out.writeUTF(adidas.getProdName());
		 out.writeInt(adidas.getPrice());
		 out.writeInt(adidas.getQuantity());
		 
		 System.out.println("adidas.data������ ���� �Ǿ����ϴ�.");
		 
		 //5.out filter stream �ݱ�
		 out.close();
		 
	}

}
