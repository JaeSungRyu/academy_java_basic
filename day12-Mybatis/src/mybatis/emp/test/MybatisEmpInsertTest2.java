package mybatis.emp.test;

import static mybatis.emp.client.MybatisClient.getFactory;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.mapper.EmpMapper;
import mybatis.emp.vo.Emp;;

/**
 * 직원 정보 1건을 데이터베이스 테이블
 * emp에 삽입하는 클래스
 * 메퍼 인터페이스를 사용하여 작업
 * @author win10
 *
 */

public class MybatisEmpInsertTest2 {

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
			emp.setEmpno(3335);
			emp.setEname("홍길동");
			emp.setJob("도적");
			
			//mapper 인터페이스 객체를 선언
			EmpMapper mapper;
			//session으로 부터 매퍼 객체를 얻어냄
			mapper = session.getMapper(EmpMapper.class);
			
			//매퍼인터페이스 객체를 통하여 메소드 호출
			int addCnt = mapper.insert(emp);
			
			
			System.out.println("입력된 행의 개수 : " + addCnt);
		} finally {
			//3.세션닫기
			session.close();
		}
		//3.sqlSession닫기
	}

}
