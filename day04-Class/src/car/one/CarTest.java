package car.one;
/**
 * �ڵ��� ��� Ÿ���� ��ü ��ü�� �����ϰ�
 * �׽�Ʈ�ϴ� Ŭ����
 * @author win10
 *
 */
public class CarTest {

	public static void main(String[] args) {
		//Car��� Ÿ���� ��ü�� ����ϱ� ���� ������ �ʿ���
		//1.���� :
		Car myCar;
		//2.�ʱ�ȭ
		myCar = new Car();
		//3.��� : Car Ÿ�� �ȿ� ���ǵ� �޼ҵ带 ȣ��
		System.out.println("1.�ʱ� myCar�� �ӵ�");
		myCar.print();
		System.out.println("=================\n");
		
		System.out.println("100��ŭ ���� �� �ӵ�");
		myCar.accelerate(100);
		myCar.print();
		System.out.println("=================\n");
		
		System.out.println("3.���� �� �ӵ�");
		myCar.stop();
		myCar.print();
	}

}

