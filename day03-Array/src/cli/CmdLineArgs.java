package cli;
/**
 * Eclipse IDE���� ����� �μ��� ����ϴ� ���
 * �ҽ��ڵ� ==> ������ ���콺 ��ư Ŭ��
 *       ==> Run as..
 *       ==> Run Configuration
 *       ==> ����� �μ��� ������ Ŭ������ ���� ��Ͽ��� ����
 *       ==> (x) Arguments �ǿ� �����͸� ��ĭ ���� �Է�
 *       ==> apply ==> run 
 * @author win10
 *
 */
public class CmdLineArgs {

	public static void main(String[] args) {
		//main �޼ҵ��� �Ű������� ������ �̹� �Ǿ� �ִ�
		//args ������ ���
		for(String input:args){
			System.out.printf("%s \t",input);
		}
		
	}

}
