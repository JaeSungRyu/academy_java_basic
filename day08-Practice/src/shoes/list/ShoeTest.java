package shoes.list;

/**
+

+

+

+
+8. ������ �Ź��� ������ shoes �� ���� ���� ���(��ü ���)
+
 */

import shoes.Shoe;

public class ShoeTest {

	public static void main(String[] args) {
		// 1. ���� : Shoe Ÿ�Ը� �����ϴ� List ����
		ShoeList shoes = new ShoeList();

		// 2. Shoe ��ü ���� �� ����
		Shoe adidas = new Shoe("SH001", "���۽�Ÿ", 260, 87200, "�ȭ", 5);
		Shoe reebok = new Shoe("SH002", "���� �ξ� ��ũť Ƽ", 270, 42000, "����ȭ", 20);
		Shoe nike = new Shoe("SH003", "����Ű ź�� ����", 235, 41300, "����", 30);
		Shoe crocs = new Shoe("SH004", "����Ʈ���̵� ���� ���", 220, 40200, "����", 7);
		Shoe birkenstock = new Shoe("SH005", "���� ����", 240, 29000, "������", 15);

		// 3. ����Ʈ �߰�
		shoes.add(adidas);
		shoes.add(reebok);
		shoes.add(nike);
		shoes.add(crocs);
		shoes.add(birkenstock);

		// 4. foreach�� ���
		System.out.println("==============3��====================");

		System.out.println(shoes.getAllShoes());

		System.out.println();

		System.out.println("==============4��====================");
		// 5. SH003 �� �ڵ�� ��ϵ� �Ź��� ���� 1���� ���
		System.out.println(shoes.get(new Shoe("SH003")));
		System.out.println();

		System.out.println("==============5��====================");
		Shoe nike2 = new Shoe("SH003", "����Ű ź�� ����", 235, 41300, "����", 0);
		shoes.set(nike2);
		System.out.println();

		System.out.println("==============���� �Ϸ�===================");
		System.out.println();

		System.out.println("==============6��====================");
		System.out.println(shoes.get(new Shoe("SH003", null, 0, 0, null, 0)));
		System.out.println();

		System.out.println("==============7��====================");
		System.out.println("���� �Ϸ� ? = " + shoes.remove(new Shoe("SH003", null, 0, 0, null, 0)));
		System.out.println();

		System.out.println("==============8��====================");
		System.out.println(shoes.getAllShoes());

	}
}