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
public class PreparedDMLTest2 {

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
		System.out.println("�߰��� ������ ����� ���� 4�� �Է�");
		Scanner scan = new Scanner(System.in);
		int eno = scan.nextInt();
		
		System.out.println("�߰��� ������ �̸��� �Է�");
		String ename = scan.nextLine();
		
		String sql = "INSERT INTO emp (EMPNO,ENAME) VALUES (?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		//4.���� ����
		//(1)
		//prepare statement�� execute����
		//?�� �ش��ϴ� ��ġ��
		//������ ������ �����ϴ� �ܰ谡 �߰���
		pstmt.setInt(1, eno);
		pstmt.setString(2, ename);
		
		
		int insertCnt = pstmt.executeUpdate();
		
		
		//5.DML��� ó�� : insertCnt�� ���ؼ� ������ �۾��Ǿ�����
		//				������ ������ Ȯ�ΰ���
		if(insertCnt>0) {
			System.out.println(insertCnt + "���� �Է� �Ǿ����ϴ�");
		}
		
		
		//6.�ڿ� ����(resultSet�� �߻����� ����)
		// ���� : ������ �ݴ����
		//  stmt -> conn
		
		if(pstmt != null)
			pstmt.close();
		
		if(conn != null)
			conn.close();
		
	}

}
