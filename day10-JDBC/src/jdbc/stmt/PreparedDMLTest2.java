package jdbc.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class PreparedDMLTest2 {

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
		System.out.println("추가할 직원의 사번을 숫자 4로 입력");
		Scanner scan = new Scanner(System.in);
		int eno = scan.nextInt();
		
		System.out.println("추가할 직원의 이름을 입력");
		String ename = scan.nextLine();
		
		String sql = "INSERT INTO emp (EMPNO,ENAME) VALUES (?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		//4.쿼리 실행
		//(1)
		//prepare statement는 execute전에
		//?에 해당하는 위치에
		//각각의 값들을 매핑하는 단계가 추가됨
		pstmt.setInt(1, eno);
		pstmt.setString(2, ename);
		
		
		int insertCnt = pstmt.executeUpdate();
		
		
		//5.DML결과 처리 : insertCnt를 통해서 몇행이 작업되었는지
		//				정도의 정보만 확인가능
		if(insertCnt>0) {
			System.out.println(insertCnt + "행이 입력 되없습니다");
		}
		
		
		//6.자원 해제(resultSet이 발생하지 않음)
		// 순서 : 오픈한 반대순서
		//  stmt -> conn
		
		if(pstmt != null)
			pstmt.close();
		
		if(conn != null)
			conn.close();
		
	}

}
