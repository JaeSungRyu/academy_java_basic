package eraser.three;
/**
 * ĥ�����찳�� �׽�Ʈ�ϴ� Ŭ����
 * @author win10
 *
 */
public class EraserTest {

	public static void main(String[] args) {
		//1.���� : ĥ�����찳 ��ü �������� ����
		Eraser eraser1;
		Eraser eraser2;
		
		//2.�ʱ�ȭ 
		eraser1 = new Eraser(13.0, 4.5, 2, 5);
		eraser2 = new Eraser(13.0, 4.5, 2, 5);
		
		//3.���
		//(1)�� ���찳�� �ʱ���� ���
		eraser1.print();
		eraser2.print();
		
		//(2)eraser2�� �Ѱ��� ����
		eraser2.peer();
		
		//(3)�� ���찳 ���� ���
		eraser1.print();
		eraser2.print();
		
		//(4)eraser2�� �Ѱ��� ����
		eraser2.peer();
		
		//(5)�� ���찳 ���� ���
		eraser1.print();
		eraser2.print();
		
		//(6)���� ���� ���� ������ ���� �ʴ��� Ȯ��
		eraser2.peer();
		eraser2.print();
		eraser2.peer();
		eraser2.print();
		eraser2.peer();
		eraser2.print();
		eraser2.peer();
		eraser2.print();
		eraser2.peer();
		eraser2.peer();
		eraser2.print();
		
	}

}
