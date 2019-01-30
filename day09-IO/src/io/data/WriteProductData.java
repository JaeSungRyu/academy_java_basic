package io.data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * 객체 생성 후 객체의 데이터 필드(멤버 변수)를 출력
 * -----------------------------------
 * --입력--
 * 1.Product 객체 생성
 * 
 * --출력--
 * 2.node stream (파일에 출력:FileOutputStream)
 * 3.filter stream (data 단위 출력 : DataOutpupStream)
 * 4.write작업 : filter steam 의 메소드로 출력
 * 
 * --정리--
 * 5.출력 filter stream 닫기
 * 
 * 
 * @author win10
 *
 */
public class WriteProductData {

	public static void main(String[] args)throws IOException {
		//1.입력대신 객체생성
		Product adidas = 
				new Product("S001", "슈퍼스타", 87200, 5);
		//2.출력 node stream
		 FileOutputStream fos = 
				 new FileOutputStream("adidas.data");
		 
		 //3.출력: filter stream
		 DataOutputStream out
		 	= new DataOutputStream(fos);
		 
		 //4.write 작업 : filter stream의 메소드 사용
		 //	데이터 타입별로 출력 메소드를 지원
		 out.writeUTF(adidas.getProdCode());
		 out.writeUTF(adidas.getProdName());
		 out.writeInt(adidas.getPrice());
		 out.writeInt(adidas.getQuantity());
		 
		 System.out.println("adidas.data파일이 생성 되었습니다.");
		 
		 //5.out filter stream 닫기
		 out.close();
		 
	}

}
