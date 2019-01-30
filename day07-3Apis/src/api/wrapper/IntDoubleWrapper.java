package api.wrapper;
import static java.lang.Integer.*;
import static java.lang.Double.*;

/**
 * �⺻���� ��ü������ �����ϴ� ����Ŭ������
 *  int : Integer
 *  double : Double
 *  �ΰ����� �׽�Ʈ�ϴ� Ŭ�����̴�.
 * @author win10
 *
 */
public class IntDoubleWrapper {

	public static void main(String[] args) {
		//(0)����� ���ڿ� ���� ����
		String intInput = "100";
		String dblInput = "200.0";
		
		//(1)String Ÿ�� --> �⺻��
		//(.1)parseType() : static �޼ҵ� ����ϴ� ���
		//import�� �����ָ� parseInt �ȳ־ ��.
		String intfrm = String.format("���ڿ�[%s]�� �⺻�� [%d]�� ����%n]"
				      , intInput,Integer.parseInt(intInput));
		
		System.out.println(intfrm);
		
		String dblfrm = String.format("���ڿ�[%s]�� �⺻�� [%f]�� ����]"
				, dblInput,Double.parseDouble(dblInput));
		
		System.out.println(dblfrm);
		
		
		//(.2)typeValue() : non-static �޼ҵ� ���
		intfrm = String.format("���ڿ�[%s]�� �⺻�� [%d]�� ����%n]"
			      , intInput,new Integer(intInput).intValue());
	
		System.out.println(intfrm);
		dblfrm = String.format("���ڿ�[%s]�� �⺻�� [%f]�� ����%n]"
				, intInput,new Double(dblInput).doubleValue());
		
		System.out.println(dblfrm);
	
		//(2)�⺻�� ------> String
		int ten = 10;
		double sixty = 60.0;
		
		String tenStr = new Integer(ten).toString();
		String sixtyStr = new Double(sixty).toString();
		//String  ���� Ȯ���� ���� ���ڿ� ����
		tenStr += "�Դϴ�.";
		sixtyStr += "�Դϴ�.";
		
		//���� ���� ��� ���
		System.out.println(tenStr);
		System.out.println(sixtyStr);
		
		
		//(3)�⺻�� <------> ��ü��
		Integer ObjTen = new Integer(ten);
		Double ObjSixty = new Double(sixty);
		
		System.out.println(ten + "�� ��ü�� ������ : " + ObjTen);
		System.out.println(sixty + "�� ��ü�� ������ : " + ObjSixty);
		
	}

}