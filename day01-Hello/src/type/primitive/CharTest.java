package type.primitive;

/**
 * ���� 1���� �����ϴ� Ÿ�� : char
 * 
 * ���������� ���ڷ� �����ϴ� Ư¡�� �ִ�.
 *
 */

public class CharTest {

	public static void main(String[] args) {
		//1.ĳ���� Ÿ�� ����
		char input;
		
		//2.�ʱ�ȭ
		input = 'a';
		
		//3.���
		System.out.println("input : " + input);
		
		//4.char�� ���������� ���ڷ� ����Ǵ� ���� Ȯ��
		int code = input;
		System.out.println("code : "+ code);
		 
		code = code + 1;
		System.out.println("code : "+ code);
		
		System.out.println("(char)code="+(char)code);
		
	}

}
