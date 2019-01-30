package mybatis.emp.test;

import static mybatis.emp.client.MybatisClient.getFactory;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.vo.Emp;;

/**
 * 조회조건 1개로 사번을 받는 쿼리를 테스트
 * @author win10
 *
 */

public class MybatisEmpInsertTest {

	public static void main(String[] args) {
		//0.sqlSession Factory생성
		SqlSessionFactory factory = getFactory();
		//1.sqlSession 얻기
		//DML 작업을 할 때는 세션을 오픈 할 때
		//자바 애플리케이션에서 commit이 이루어 지도록 해야함
		//JDBC는 기본 auto-commit이므로 신경 쓰지 않지만
		//mybatis는 non auto-commit이므로 auto-commit으로 변경해야함
		
		//optionSession 메소드의 매개 변수로 true를
		//전송해야 auto-commit이 됨
		SqlSession session = factory.openSession(true);
		
		try {
			//2.세션 객체를 통해서 쿼리 실행
			
			//insert의 parameter설정
			Emp emp = new Emp();
			emp.setEmpno(3334);
			emp.setEname("홍길동");
			emp.setJob("도적");
			
			//insert 수행하며 emp객체를 전달
			int addCnt = 
			session.insert("mybatis.emp.mapper.EmpMapper.insert",emp)  ;
			
			System.out.println("입력된 행의 개수 : " + addCnt);
		} finally {
			//3.세션닫기
			session.close();
		}
		//3.sqlSession닫기
	}

}
