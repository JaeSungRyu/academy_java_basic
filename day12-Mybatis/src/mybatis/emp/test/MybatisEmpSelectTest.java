package mybatis.emp.test;

import static mybatis.emp.client.MybatisClient.getFactory;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;;

public class MybatisEmpSelectTest {

	public static void main(String[] args) {
		//0.sqlSession Factory����
		SqlSessionFactory factory = getFactory();
		//1.sqlSession ���
		SqlSession session = factory.openSession();
		
		try {
			//2.���� ��ü�� ���ؼ� ���� ����
			List<Map<String, Object>> emps = 
					session.selectList("mybatis.emp.mapper.EmpMapper.selectALl");
			
			for (Map<String, Object> emp : emps) {
				System.out.println(emp);
			}
		} finally {
			//3.���Ǵݱ�
			session.close();
		}
		//3.sqlSession�ݱ�
		
		
	}

}
