package jdbc.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.Callable;

/**
 * JDBC에서 제공하는 CallableStatement 인터페이스를 테스트하는 클래스
 * 
 * 데이터베이스 내부에 정의되어있는 SP_INSER_CUSTOMER을 호출한다
 * 
 * @author win10
 *
 */
public class CustomerspTest {
	private static final String URL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";

	public static void main(String[] args) {
		//0.필요객체 선언
		Connection conn = null;
		CallableStatement cstmt = null;
		
		
		
		try {
			//1.드라이버 로드
			Class.forName(DRIVER);
			//2.커넥션
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			
			//3.쿼리 준비
			//(1)call 구문을 스티링 변수 sql로 작성
			String sql = "{call SP_INSERT_CUSTOMER(?,?,?,?)}";
			
			//(2)커넥션으로 부터  callable 객체 얻어냄
			cstmt = conn.prepareCall(sql);
			
			//(3)call 구문의 ? 를 맵핑(PrepareStatement와 유사)
			//IN모드 변수 세팅
			cstmt.setString(1, "유재성");
			cstmt.setString(2, "대전동구용운로 80");
			cstmt.setString(3, "010-6890-0238");
			
			//OUT모드 변수 세팅
			cstmt.registerOutParameter(4, java.sql.Types.VARCHAR);
			
			
			//4.쿼리 실행
			System.out.println("저장 프로시저 : sp_insert_customer실행 중");
			cstmt.execute();
			
			//5.결과 처리
			String outMsg = cstmt.getNString(4);
			System.out.println("프로시저 수행결과 :" + outMsg);
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 오류");
			e.printStackTrace();
			
		}catch (SQLException e) {
			System.out.println("sql수행오류");
			e.printStackTrace();
		}finally {
			//6.자원 해제
			try {
				if(cstmt!=null) {
					cstmt.close();
				}if(conn!=null) {
					conn.close();
				}	
			} catch (SQLException e){
				System.err.println("자원해제 오류");
				e.printStackTrace();
			}
			
		} 
		
	}
		
}


