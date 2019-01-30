package mybatis.emp.test;

import static mybatis.emp.client.MybatisClient.getFactory;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;;

public class MybatisEmpSelectTest {

	public static void main(String[] args) {
		//0.sqlSession Factory积己
		SqlSessionFactory factory = getFactory();
		//1.sqlSession 掘扁
		SqlSession session = factory.openSession();
		
		try {
			//2.技记 按眉甫 烹秦辑 孽府 角青
			List<Map<String, Object>> emps = 
					session.selectList("mybatis.emp.mapper.EmpMapper.selectALl");
			
			for (Map<String, Object> emp : emps) {
				System.out.println(emp);
			}
		} finally {
			//3.技记摧扁
			session.close();
		}
		//3.sqlSession摧扁
		
		
	}

}
