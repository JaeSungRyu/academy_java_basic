package operator.binary;

import java.util.Scanner;

/**
 * �Էµ� ������ 0~100������ 
 * ��ȿ�� ������ �Ǵ��ϴ� Ŭ�����̴�.
 * @author win10
 *
 *�������� &&�� �׽�Ʈ
 *Scanner �� ����Ͽ� ������ Ű���� �Է����� ó���Ѵ�.
 *
 */
public class ScoreInput {

	public static void main(String[] args) {
		//1.����
		//��ĳ�� ����
		Scanner scan = new Scanner(System.in);
		
		//���� �ʱ�ȭ : ��ĳ�ʸ� ���ؼ� �Է�
		int score;
		
		//��������
		System.out.println("������ �Է� : ");
		score = scan.nextInt();
				
		//3.���
		//0<=score<100
				if(score >= 0 && score <=100){

					System.out.printf("%d�� ��ȿ�� �����Դϴ�.%n",score);
					}else {
						System.out.printf("%d�� ��ȿ�� ������ �ƴմϴ�.%n",score);
					
				} 	
				/**
				 * -----------------------------
				 * �׽�Ʈ ���� ������
				 * -----------------------------
				 * 1.�ùٸ� �����͸����� �׽�Ʈ �ϴ°��� ����
				 * 2.��谪 �׽�Ʈ�� �ݵ�� ����
				 * 3.�߸��� ����� �߻���ų ������
				 *   ����Ǵ� ������ �ݵ�� ����
				 *------------------------------   	
				 */
				}

	}

