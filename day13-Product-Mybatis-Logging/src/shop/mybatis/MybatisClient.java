package shop.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 * Mybatis �� sqlSessionFactory ��ü��
 * �̱������� �����ϰ� �����ϴ� Ŭ����
 * 
 */
public class MybatisClient {
	
	//�̱������� ������ Ÿ���� static������ ����
	public static SqlSessionFactory factory;
	
	//sqlSessionFactory ��ü�� �ʱ�ȭ
	//�� Ŭ���� �����ڿ��� ����
	//Mybatis-config.xml ������ InputStream���� �о�鿩
	//�ʱ�ȭ ��
	
	private MybatisClient() {
		String resource = "mybatis-config.xml";
		InputStream in = null;
		
		try {
			in = Resources.getResourceAsStream(resource);	
			factory = new SqlSessionFactoryBuilder().build(in);
		
		} catch (IOException e) {
		System.err.println("mybatis ���� �б� ����"); 
		 e.printStackTrace();
		}
	}
//������ ����


//�̱������� ������ Ÿ���� �����ϴ� static�޼ҵ� ����

	public static SqlSessionFactory getFactory() {
		if(factory == null) {
			new MybatisClient(); 
		}
		return factory;
	}
	
}