package jdbc.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * SCOTT계정의 EMP 테이블 내용을 조회하여
 * 데이터베이스 접속을 테스트하는 클래스
 * =======================================
 * 1.드라이버 로드
 * 2.커넥션 맺기
 * 3.쿼리 생성'
 * 4.쿼리 실행
 * 5.결과 처리
 * 6.자원 해제
 * =======================================
 */
public class StatementTest {

	private static final String URL = 
			"jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	
	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		
		//1.드라이버 로드 : 방법 1 : 클래스를 바로 메모리에 로드
		Class.forName(DRIVER);
		
		//2.커넥션 맺기
		Connection conn = 
				DriverManager.getConnection(URL, USER, PASSWORD);

		//3.쿼리 준비 :empno의 값을 변경해가며 1명의 정보를 조회
		System.out.println("조회할 직원의 사번을 숫자 4로 입력");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		String sql = "SELECT e.empno"
				+ "			,e.ename"
				+ "	  FROM emp e"
				+ "   WHERE e.EMPNO = " + input;
		
		Statement stmt = conn.createStatement();
		
		//4.쿼리 실행
		//ResultSet이 발생하면 해당 변수는 컬럼을 가르키고 있음
		//컬럼 행이 없더라도 컬럼자체는 존재
		ResultSet result = stmt.executeQuery(sql);
		
		//5.결과 처리 : 반복수행
		//		(DQL 실행결과는 여러 행이 있기 때문에)
		
		//결과 셋의 정보
		ResultSetMetaData meta = result.getMetaData();
		String empnoCol = meta.getColumnName(1);
		String enameCol = meta.getColumnName(2);
		
		System.out.printf("%6s | %6s%n",empnoCol,enameCol);
		
		while(result.next()) {
			int empno = result.getInt(1);
			String ename = result.getString(2);
			System.out.printf("%6s | %6s%n",empno,ename);
		}
		
		//6.자원 해제
		// 순서 : 오픈한 반대순서
		// result -> stmt -> conn
		if(result != null)
			result.close();
		
		if(stmt != null)
			stmt.close();
		
		if(conn != null)
			conn.close();
		
	}

}
