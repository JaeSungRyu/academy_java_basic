package shop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.exception.DuplicateException;
import shop.exception.NotFoundException;
import shop.vo.Product;

/**
 * ��ǰ ������ JDBC �� ���Ͽ�
 * ����Ŭ �����ͺ��̽��� PRODUCT ���̺�� �����ϴ�
 * Ŭ���� 
 * @author PC38206
 *
 */
public class JdbcWarehouse implements GeneralWarehouse {
	
	// DB Ŀ�ؼ��� ���� ����
	private static final String URL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";

	// 2. ������ ����
	public JdbcWarehouse() { }
	

	@Override
	public int add(Product product) throws DuplicateException {
		// �߰��Ϸ��� ��ǰ�� �̹� �����ϴ��� �˻�
		if (isExists(product)) {
			throw new DuplicateException("�߰�", product);
		}
		
		// 0. �ʿ� ��ü ����
		int addCnt = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. ����̹� �ε�
			Class.forName(DRIVER);
			
			// 2. Ŀ�ؼ� �α�
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. ���� �غ�
			String sql = " INSERT INTO product(prodcode, prodname, price, quantity)"
			           + " VALUES (?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProdCode());
			pstmt.setString(2, product.getProdName());
			pstmt.setInt(3, product.getPrice());
			pstmt.setInt(4, product.getQuantity());
			
			// 4. ���� ����
			addCnt = pstmt.executeUpdate();
			
			// 5. ��� ó��
			//   ==> ���� ���� �� �ߺ� ���� �˻��ϹǷ� Ư����
			//       ��� ó���� �ʿ� ����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			// 6. �ڿ� ����
			try {
				if (pstmt != null) {
					pstmt.close();					
				}
				if (conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				System.err.println("�ڿ� �ݳ� ����!");
				e.printStackTrace();
				
			}
		}
		
		return addCnt;
	}


	@Override
	public Product get(Product product) throws NotFoundException {
		// ��ȸ�Ϸ��� ��ǰ ���翩�� �˻� : isExists()
		if (!isExists(product)) {
			throw new NotFoundException("��ȸ", product);
		}
		
		// 0. �ʿ� ��ü ����
		Product found = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		
		try {
			// 1. ����̹� �ε�
			Class.forName(DRIVER);
			
			// 2. Ŀ�ؼ� �α�
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. ���� �غ�
			String sql = "SELECT p.prodcode" 
			           + "     , p.prodname" 
					   + "     , p.price   " 
			           + "     , p.quantity" 
					   + "  FROM product p " 
			           + " WHERE p.prodcode = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProdCode());
			
			// 4. ���� ����
			result = pstmt.executeQuery();
			
			// 5. ��� ó��
			while (result.next()) {
				String prodCode = result.getString(1);
				String prodName = result.getString(2);
				int price = result.getInt(3);
				int quantity = result.getInt(4);
				
				found = new Product(prodCode, prodName, price, quantity);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			// 6. �ڿ� ����
			try {
				if (result != null) {
					result.close();
				}
				if (pstmt != null) {
					pstmt.close();					
				}
				if (conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				System.err.println("�ڿ� �ݳ� ����!");
				e.printStackTrace();
			}
		}
		
		return found;
	}

	@Override
	public int set(Product product) throws NotFoundException {
		// �߰��Ϸ��� ��ǰ�� �̹� �����ϴ��� �˻�
		if (!isExists(product)) {
			throw new NotFoundException("����", product);
		}
		
		// 0. �ʿ� ��ü ����
		int setCnt = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. ����̹� �ε�
			Class.forName(DRIVER);
			
			// 2. Ŀ�ؼ� �α�
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. ���� �غ�
			String sql = "UPDATE product p     "  
					   + "   SET p.PRODNAME = ?" 
					   + "     , p.PRICE    = ?" 
					   + "     , p.QUANTITY = ?" 
					   + "     , p.MODDATE  = sysdate" 
					   + " WHERE p.PRODCODE = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProdName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setInt(3, product.getQuantity());
			pstmt.setString(4, product.getProdCode());
			
			// 4. ���� ����
			setCnt = pstmt.executeUpdate();
			
			// 5. ��� ó��
			//   ==> ���� ���� �� �ߺ� ���� �˻��ϹǷ� Ư����
			//       ��� ó���� �ʿ� ����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			// 6. �ڿ� ����
			try {
				if (pstmt != null) {
					pstmt.close();					
				}
				if (conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				System.err.println("�ڿ� �ݳ� ����!");
				e.printStackTrace();
				
			}
		}
		
		return setCnt;
	}

	@Override
	public int remove(Product product) throws NotFoundException {
		// �߰��Ϸ��� ��ǰ�� �̹� �����ϴ��� �˻�
		if (!isExists(product)) {
			throw new NotFoundException("����", product);
		}
		
		// 0. �ʿ� ��ü ����
		int rmCnt = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. ����̹� �ε�
			Class.forName(DRIVER);
			
			// 2. Ŀ�ؼ� �α�
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. ���� �غ�
			String sql = "DELETE product p ";			
			sql       += " WHERE p.prodcode = ?";
				
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1, product.getProdCode());
			
			// 4. ���� ����
			rmCnt = pstmt.executeUpdate();
			
			// 5. ��� ó��
			//   ==> ���� ���� �� �ߺ� ���� �˻��ϹǷ� Ư����
			//       ��� ó���� �ʿ� ����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			// 6. �ڿ� ����
			try {
				if (pstmt != null) {
					pstmt.close();					
				}
				if (conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				System.err.println("�ڿ� �ݳ� ����!");
				e.printStackTrace();
				
			}
		}
		
		return rmCnt;
	}

	@Override
	public List<Product> getAllProducts() {
		
		// 0. �ʿ� ��ü ����
		List<Product> products = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		
		try {
			// 1. ����̹� �ε�
			Class.forName(DRIVER);
			
			// 2. Ŀ�ؼ� �α�
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. ���� �غ�
			String sql = "SELECT p.prodcode" 
			           + "     , p.prodname" 
					   + "     , p.price   " 
			           + "     , p.quantity" 
					   + "  FROM product p ";
			
			pstmt = conn.prepareStatement(sql);
			
			// 4. ���� ����
			result = pstmt.executeQuery();
			
			// 5. ��� ó��
			while (result.next()) {
				String prodCode = result.getString(1);
				String prodName = result.getString(2);
				int price = result.getInt(3);
				int quantity = result.getInt(4);
				
				Product product = 
						new Product(prodCode, prodName
								  , price, quantity);
				
				products.add(product);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			// 6. �ڿ� ����
			try {
				if (result != null) {
					result.close();
				}
				if (pstmt != null) {
					pstmt.close();					
				}
				if (conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				System.err.println("�ڿ� �ݳ� ����!");
				e.printStackTrace();
			}
		}
		
		return products;
	}
	
	
	// ���� �޼ҵ� : ���, ����, ����, ��ȸ�� ��� ��ǰ��
	//               ���翩�θ� Ȯ���ϴ� �޼ҵ�
	private boolean isExists(Product product) {
		boolean isExist = false;
		
		// 0. �ʿ䰴ü ����
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;		

		try {
			// 1. ����̹� �ε�
			Class.forName(DRIVER);
			
			// 2. Ŀ�ؼ�
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. ���� �غ�
			String sql = "SELECT p.prodcode" 
			           + "  FROM product p" 
					   + " WHERE p.prodcode = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProdCode());
			
			// 4. ���� ����
			result = pstmt.executeQuery();
			
			// 5. ��� ó��
			while (result.next()) {
				// ��ȸ ����� �ִٴ� ���� ���� ��ǰ �ڵ尡 ��ϵǾ���
				isExist = true;
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			// 6. �ڿ� ����
			try {
				if (result != null) {
					result.close();
				}
				if (pstmt != null) {
					pstmt.close();					
				}
				if (conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				System.err.println("�ڿ� �ݳ� ����!");
				e.printStackTrace();
				
			}
		}
		
		return isExist;
	}

}










