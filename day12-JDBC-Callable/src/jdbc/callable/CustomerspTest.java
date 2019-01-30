package jdbc.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.Callable;

/**
 * JDBC���� �����ϴ� CallableStatement �������̽��� �׽�Ʈ�ϴ� Ŭ����
 * 
 * �����ͺ��̽� ���ο� ���ǵǾ��ִ� SP_INSER_CUSTOMER�� ȣ���Ѵ�
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
		//0.�ʿ䰴ü ����
		Connection conn = null;
		CallableStatement cstmt = null;
		
		
		
		try {
			//1.����̹� �ε�
			Class.forName(DRIVER);
			//2.Ŀ�ؼ�
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			
			//3.���� �غ�
			//(1)call ������ ��Ƽ�� ���� sql�� �ۼ�
			String sql = "{call SP_INSERT_CUSTOMER(?,?,?,?)}";
			
			//(2)Ŀ�ؼ����� ����  callable ��ü ��
			cstmt = conn.prepareCall(sql);
			
			//(3)call ������ ? �� ����(PrepareStatement�� ����)
			//IN��� ���� ����
			cstmt.setString(1, "���缺");
			cstmt.setString(2, "������������ 80");
			cstmt.setString(3, "010-6890-0238");
			
			//OUT��� ���� ����
			cstmt.registerOutParameter(4, java.sql.Types.VARCHAR);
			
			
			//4.���� ����
			System.out.println("���� ���ν��� : sp_insert_customer���� ��");
			cstmt.execute();
			
			//5.��� ó��
			String outMsg = cstmt.getNString(4);
			System.out.println("���ν��� ������ :" + outMsg);
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
			
		}catch (SQLException e) {
			System.out.println("sql�������");
			e.printStackTrace();
		}finally {
			//6.�ڿ� ����
			try {
				if(cstmt!=null) {
					cstmt.close();
				}if(conn!=null) {
					conn.close();
				}	
			} catch (SQLException e){
				System.err.println("�ڿ����� ����");
				e.printStackTrace();
			}
			
		} 
		
	}
		
}


