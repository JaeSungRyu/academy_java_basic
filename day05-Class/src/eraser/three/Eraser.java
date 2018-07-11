package eraser.three;
/**
 * ĥ�� ���찳�� �����ϴ� Ŭ����
 * -------------------------------------
 * ĥ�� ���찳�� �Ӽ��� �����ϱ� ����
 * ���� : width  : double
 * ���� : height : double
 * ���� : depth  : double
 * ��    : layer  : int
 * �װ��� ������ ����
 * -------------------------------------
 * �⺻ ������ : �Ű������� ���� �ʴ� ������
 * �Ű������� �޴� ������ �ΰ��� ����
 * �Ű������� �޴� �����ڴ� �� ���� �ʵ� ��ο� ���ؼ�
 * �Ű������� �޵��� �����Ѵ�
 * -------------------------------------
 * ĥ�� ���찳�� ���¸� ��� : print() : void
 * ���찳�� �� ���� ���� : peel() : void
 * -------------------------------------
 */
public class Eraser {
	//1.��� ��������
	/*���α���*/
	double width;
	/*���α���*/
	double height;
	/*����*/
	double depth;
	/*��*/
	int layer;
	/*���찳 �Ϸù�ȣ*/
	int serial;
	
	/*���찳�� �Ϸ� ��ȣ�� ������� Ŭ���� ����*/
	static int count = 0;
	
	
	//2.������ ����
	
	Eraser(){
		this.serial = ++count;
	}
	/**
	 * width�ʵ常 �ʱ�ȭ �ϴ� ����
	 */
	Eraser(double width){
		this();
		this.width = width;
	}
	
	/*width,height �ʵ常 �ʱ�ȭ�ϴ� ������
	 * 
	 */
	Eraser(double width,double height){
		this(width);
		this.height = height;
	}
	/*
	 * width,height,depth
	 */
	Eraser(double width,double height,double depth){
		this(width,height);
		this.depth = depth;
	}
	/*
	 * ��� �ʵ� �ʱ�ȭ�ϴ� ������
	 */
	Eraser(double width,double height,double depth,int layer){
		this(width,height,depth);
		//this()������ ������ ù��° �ٿ� �����ؾ��ϰ� 1ȸ�� ��밡��
		this.depth = layer;
	}
	
	
	
//	Eraser(double width, double height,double depth,int layer){
//		this.width = width;
//		this.height = height;
//		this.depth = depth;
//		this.layer = layer;
//	}
	
	//3.�޼ҵ� ����
	
	//���찳 �Ѱ��� ����
	public void peer() {
		//�����ִ� ���� ���� -���� �� ���� �����Ƿ�
		//if������ ����Ͽ� ���� üũ
		if(layer - 1 >= 0) {
			layer -= 1;
		}
	}
	public void print() {
		System.out.printf("�Ϸù�ȣ : %d,���찳 ���� : %4.2f, ���� : %4.2f, ���� : %4.2f, ���� �� : %d%n",serial,width,height,depth,layer);		
	}
}
