package type.primitive;
/**
 * 1byte�� �ش��ϴ� ������ŭ
 * ������ �����ϴ� Ÿ����
 * byteŸ���� �׽�Ʈ�ϴ� Ŭ�����̴�.
 * 
 * 1byte = 8bit
 * @author win10
 * 
 */
public class ByteTest {

	public static void main(String[] args) {
		//1.����
		byte buffer;
		//2.�ʱ�ȭ
		buffer = 0;
		//3.����
		for (int idx = 0; idx < 257; idx++) {
			System.out.print(buffer++);
			System.out.println(" , ");
		}
		//������ �� �ִ� ���� ������ �Ѿ�� ����
		//�����Ҵ��ϴ� ���� �Ұ���
//		buffer = 128; -�����ڵ�
	}
}