package jdbc.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * SCOTT������ EMP ���̺� ������ ��ȸ�Ͽ�
 * �����ͺ��̽� ������ �׽�Ʈ�ϴ� Ŭ����
 * =======================================
 * 1.����̹� �ε�
 * 2.Ŀ�ؼ� �α�
 * 3.���� ����'
 * 4.���� ����
 * 5.��� ó��
 * 6.�ڿ� ����
 * =======================================
 */
public class StatementTest {

	private static final String URL = 
			"jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	
	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		
		//1.����̹� �ε� : ��� 1 : Ŭ������ �ٷ� �޸𸮿� �ε�
		Class.forName(DRIVER);
		
		//2.Ŀ�ؼ� �α�
		Connection conn = 
				DriverManager.getConnection(URL, USER, PASSWORD);

		//3.���� �غ� :empno�� ���� �����ذ��� 1���� ������ ��ȸ
		System.out.println("��ȸ�� ������ ����� ���� 4�� �Է�");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		String sql = "SELECT e.empno"
				+ "			,e.ename"
				+ "	  FROM emp e"
				+ "   WHERE e.EMPNO = " + input;
		
		Statement stmt = conn.createStatement();
		
		//4.���� ����
		//ResultSet�� �߻��ϸ� �ش� ������ �÷��� ����Ű�� ����
		//�÷� ���� ������ �÷���ü�� ����
		ResultSet result = stmt.executeQuery(sql);
		
		//5.��� ó�� : �ݺ�����
		//		(DQL �������� ���� ���� �ֱ� ������)
		
		//��� ���� ����
		ResultSetMetaData meta = result.getMetaData();
		String empnoCol = meta.getColumnName(1);
		String enameCol = meta.getColumnName(2);
		
		System.out.printf("%6s | %6s%n",empnoCol,enameCol);
		
		while(result.next()) {
			int empno = result.getInt(1);
			String ename = result.getString(2);
			System.out.printf("%6s | %6s%n",empno,ename);
		}
		
		//6.�ڿ� ����
		// ���� : ������ �ݴ����
		// result -> stmt -> conn
		if(result != null)
			result.close();
		
		if(stmt != null)
			stmt.close();
		
		if(conn != null)
			conn.close();
		
	}

}
