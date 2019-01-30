package clothing;

import java.util.ArrayList;
import java.util.List;

/**
 * =================================================================== ��� Ŭ����
 * HatTest �ۼ� ��Ű�� �̸� : clothing Ŭ���� �̸� : HatTest -------------------------- main
 * �޼ҵ� �ۼ�
 * 
 * ���� �޼ҵ� ���� Hat ��ü�� 3�� ���� Hat cap = new Hat(......); // type�� "�߱�����"�� ����,
 * hatId: HT001, ������ �ʵ�� ������ Hat fedora = new Hat(....);// type�� "�䵵��"�� ���� ,
 * hatId: HT002, ������ �ʵ�� ������ Hat sunCap = new Hat(....);// type�� "��ĸ" ���� ���� ,
 * hatId: HT003, ������ �ʵ�� ������
 * 
 * List<Hat> hats �� �����ϰ� �ռ� ������ cap, fedora, sunCap �� add() �Ѵ�. hats �� foreach ��
 * ���. ����� �� println() �޼ҵ� �ȿ� hat ��ü�� �ٷ� ���
 * 
 * @author win10
 *
 */
public class HatTest {  

	public static void main(String[] args) {
		// List<hat> hats����
		Hat[] hats2 = new Hat[0];
		List<Hat> hats = new ArrayList<Hat>();

//		GeneralShowcase showcase = new 
		GeneralShowcase showcase = new ListShowcase(hats);

		// 3���� Hat ��ü ����
		Hat cap = new Hat("HT001", "�߱�����", "õ", 57, "�Ķ�", 32, 30, 'M');
		Hat fedora = new Hat("HT002", "�䵵��", "��¤", 59, "����", 28, 15, 'F');
		Hat sunCap = new Hat("HT003", "��ĸ", "��¤", 58, "����", 30, 50, 'U');

		// ������ ��ü hats�� add
		hats.add(cap);
		hats.add(fedora);
		hats.add(sunCap);
 
		System.out.println("��ǰ����");
		// foreach������ hats ��ü���
		for (Hat hat : hats) {
			System.out.println(hat);
		}
			
			
			// ��ǰ����
			Hat cap2 = new Hat("HT001", "�߱�����", "õ", 30, "����", 20, 30, 'M');
			showcase.set(cap2);
			//������ ��ǰ Ȯ��
			System.out.println("================����");
			showcase.get(new Hat("HT001", null, null, 0.0, null, 0.0, 0, '\u0000')).print();
			// ��ǰ ����
			showcase.remove(new Hat("HT001", null, null, 0.0, null, 0.0, 0, '\u0000'));
			//��ü��� �� ��ȸ
			System.out.println("================����");
			for (Hat hat : showcase.getAllHat()) {
				hat.print();
			}

		} 
	
}

	


