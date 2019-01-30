package mybatis.emp.test;

import static mybatis.emp.client.MybatisClient.getFactory;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.vo.Emp;;

/**
 * ��ȸ���� 1���� ����� �޴� ������ �׽�Ʈ
 * @author win10
 *
 */

public class MybatisEmpSelectTest2 {

	public static void main(String[] args) {
		//0.sqlSession Factory����
		SqlSessionFactory factory = getFactory();
		//1.sqlSession ���
		SqlSession session = factory.openSession();
		
		try {
			//2.���� ��ü�� ���ؼ� ���� ����
			Emp emp = session.selectOne("mybatis.emp.mapper.EmpMapper.selectOne",7839);
			
				System.out.println(emp);
			
		} finally {
			//3.���Ǵݱ�
			session.close();
		}
		//3.sqlSession�ݱ�
	}

}
