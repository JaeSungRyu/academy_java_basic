package io.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 표준 입력인 키보드 입력을 받아서 
 * 표준 출력인 모니터로 출력하는 클래스
 * ----------------------------
 * 1.node stream (키보드 = System.in : InputStream)
 * 2.filter stream (stream-->reader : InputStreamReader)
 * 	 1바이트 인풋스트림을 2바이트 문자로 변경
 * (키보드는 사실 문자 입력이므로)
 * 
 * 3.filter stream(reader->reader : BufferedReader)
 *   2바이트 문자 1개를 1줄단위로 읽어서 String으로 만들수 있는
 *   편리한 메소드를 사용한다
 *   
 * 4.3에서 만들어진 filter stream객체를 사용하여
 * 	 read() 작업을 진행
 * 5.읽은 내용을 표준 출력(모니터 = System.out)
 * 6.마지막 filter steam 닫기
 *   
 * @author win10
 *
 */
public class KeyboardInput {
	public static void main(String[] args) throws IOException {
		//1.입력 노드 스트림(표준 입력:키보드)
		InputStream  in = System.in;	
		
		//2.노드 스트림을 포장할 필터 스트림
		InputStreamReader ir = 
				new InputStreamReader(in);
		//3.2의 필터 스트림을 편리하 사용을 위하여 
		// 	한번 더 포장할 필터 스트림
		BufferedReader br = 
				new BufferedReader(ir);
		
		System.out.println("값을 입력하세요....(cltl + z 입력시 중단)");
		
		//4. 3의 필터 스트림의 메소드를 사용하여
		//	키도드 입력을 읽어 들인다.
		String readData = null;
		while((readData = br.readLine()) != null) {
			//5.null이 아니면 읽은 데이터가 있으므로 출력
			System.out.println("읽은 데이터 : " +  readData);
		}
		br.close();
	}
}
