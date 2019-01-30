package mybatis.emp.mapper;

import java.util.List;
import java.util.Map;

import mybatis.emp.vo.Emp;

/**
 * EmpMapper.xml에 정의되어 있는
 * 각 쿼리 아이디를 메소드로 매핑하는 인터페이스
 * @author win10
 *
 */
public interface EmpMapper {
	/**emp테이블의 전체 목록 조회 
	 * emp전체를 map으로 리턴
	 * 
	 * @return
	 */
	public abstract List<Map<String,Object>> selectAll();
	/**
	 * 매개변수로 입력된 empno에 해당하는 직원한명의
	 * 모든 정보를 조회
	 * @param empno
	 * @return 직원 1명의 상세정보
	 */
	public abstract Emp selectOne(int empno);
	/**
	 * 직원의 정보 1건을 insert
	 * 
	 * @param emp : 추가할 정보가 담긴 emp객체
	 * @return : 추가에 성공한 행의 개수
	 */
	
	public abstract int insert(Emp emp);
}
