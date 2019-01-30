package shop.test.juint;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import shop.dao.GeneralWarehouse;
import shop.exception.DuplicateException;
import shop.exception.NotFoundException;
import shop.factory.WarehouseFactory;
import shop.vo.Product;
/*
 * JdbcWarehouse Ŭ���� �ۼ��ϸ�
 * �ϳ��� �޼ҵ带 ���鶧���� �� �޼ҵ带 ���� �׽�Ʈ�� �����ϵ���
 * �׽�Ʈ ���̽��� ����� Junit �׽�Ʈ Ŭ����
 * 
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JdbcWarehouseJunitTest {
	
	
	//�׽�Ʈ�� ����� Product ��ü ���� ������ ����
	private Product adidas; 
	private Product reebok; 
	private Product nike;
	private Product crocs; 
	private Product birkenstock; 
	
	//�׽�Ʈ��
	GeneralWarehouse warehouse;
	
	//�׽�Ʈ Ŭ���� ������ �� ���� �ѹ��� ����Ǵ� �޼ҵ�
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	//jdbc�� ��� ����̹� �ε� �۾��� �� �ѹ��� 
	//�����ϸ� �Ǵ� �۾��� ���⼭ ����
	}

	//�׽�Ʈ Ŭ���� ���� ���� �� �ѹ� ����Ǵ� �޼ҵ�
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	//������ @Test�޼ҵ� ���� �� �׻� 1���� ����
	@Before
	public void setUp() throws Exception {
		adidas = 
				new Product("S001", "���۽�Ÿ", 87200, 5);
		reebok = 
				new Product("S002", "���� �ξ� ��ũť Ƽ", 42000, 20);
		nike = 
				new Product("S003", "����Ű ź�� ����", 41300, 30);
		crocs = 
				new Product("S004", "����Ʈ���̵� ���� ���", 40200, 7);
		birkenstock = 
				new Product("S005", "���� ����", 29000, 15);
	
		warehouse = WarehouseFactory.getWarehouse("jdbc");
	}
	
	//������ @Test�޼ҵ� ���� �� �׻� 1���� ����
	@After
	public void tearDown() throws Exception {
	
	}
	
	//1.������ �Է�
	@Test
	public void testAddProduct()throws DuplicateException, NotFoundException {
		//(1)�Ƶ�ٽ� ��ǰ �Է�
		warehouse.add(adidas);
		
		//(2)�Էµ� �Ƶ�ٽ� ��ǰ ��ȸ
		Product send = new Product("S001");
		Product searched = warehouse.get(send);
		
		//(3)�Է¿� ���� adidas����� ��ȸ�� ��� searched�� 
		//   ������ ������ �����ϰ�  assert�� ���
		
		//��ȸ ��ü�� �Է°�ü �ڵ尪 ��
		//���� ���� ���� ���� ������ next. �� ����Ǹ� �޼ҵ� ����. �����ͺ��̽� Ȯ���غ��� �� ���ִ� �� Ȯ��
		assertThat("�׽�Ʈ ����(ProdCode)",searched.getProdCode(),is(adidas.getProdCode()) );
		assertThat("�׽�Ʈ ����(ProdName)",searched.getProdName(),is(adidas.getProdName()) );
		assertThat("�׽�Ʈ ����(Price)",searched.getPrice(),is(adidas.getPrice()) );
		assertThat("�׽�Ʈ ����(Quantity)",searched.getQuantity(),is(adidas.getQuantity()) );
	}

		//1.2���� ��ǰ�� 1���� �Է� �õ�
	/*@Test(expected=DuplicateException.class)
	public void test2AddProduct()throws DuplicateException{
		warehouse.add(adidas);
	}*/
	//2.��ü��� ��ȸ
	@Test	
	public void test3GetAllProduct()throws DuplicateException {
		//������ ��ǰ �Է�
		warehouse.add(birkenstock);	
		warehouse.add(crocs);	
		warehouse.add(nike);	
		warehouse.add(reebok);	
		
		//��ü��ȸ
		List<Product> products = warehouse.getAllProducts();
		
		//������� 1 : ������ ������ �����ϴ� 5���� �´°�?
		assertThat("����-������ �Ǽ��� ��������", products.size(), is(5));
	}
	//3.1�� ����
	public void test4SetProduct()throws NotFoundException {
		Product adidas2 = new Product("S001","���۽�Ÿ",75000,5);
		
		int setCnt = warehouse.set(adidas2);
		
		//���� �� ���� ���� ������ 1�� ������ ����
		assertThat("���� ���� ������ 1�� �ƴ�", setCnt, is(1));
	
		//���� �� �����͸� ��ȸ ���� Ȯ��
		Product send = new Product("S001");
		Product searched = warehouse.get(send);
		//S001�� ��ȸ�� ������ �� �ʵ尡 adidas2 �� ��ġ�� ���� ����
		assertThat("������ ����ġ(prodCode)", searched.getProdCode(), is(adidas2.getProdCode()));
		assertThat("������ ����ġ(prodName)", searched.getProdName(), is(adidas2.getProdName()));
		assertThat("������ ����ġ(prodprice)", searched.getPrice(), is(adidas2.getPrice()));
		assertThat("������ ����ġ(Quantity)", searched.getQuantity(), is(adidas2.getQuantity()));
				
	}
	//4.���������� 1�� Ȯ��
	
	//5.1�� ����
	public void test5RemoteProduct()throws NotFoundException {
		//rmCnt�� 1���� �߻����� ���� ����
		Product rmProd = new Product("S001");
		
		int rmCnt = warehouse.remove(rmProd);
		//���� ����
		assertThat("���� ���� �Ǽ��� 1�� �ƴ�", rmCnt, is(1));
		
	}
	
	//6.���� ������ ����
	@Test
	public void test6SetProduct()throws NotFoundException {
		//���� �ڵ� ��ǰ ���� ����
		Product p007 = new Product("p007");
		
		//�����õ�
		warehouse.set(p007);
				
	}
	//7.���� �ڵ� ��ǰ ��ȸ
	@Test(expected = NotFoundException.class)
	public void test7GetProduct()throws NotFoundException {
		Product p007 = new Product("p007");
		
		//�����õ�
		warehouse.get(p007);
				
	}
	//8.���� �ڵ� ��ǰ ����
	@Test(expected = NotFoundException.class)
	public void test8GetProduct()throws NotFoundException {
		Product p007 = new Product("p007");
		
		//�����õ�
		warehouse.remove(p007);
	}
	//9.���� ������ ���λ���
	@Test
	public void testRomoveProduct()throws NotFoundException {
		int rmCnt = 0;
		
		rmCnt = warehouse.remove(birkenstock);
		assertThat("���� : ���� �Ǽ��� 1�� �ƴ�", rmCnt, is(1));
		
		rmCnt = warehouse.remove(crocs);
		assertThat("���� : ���� �Ǽ��� 1�� �ƴ�", rmCnt, is(1));
		
		rmCnt = warehouse.remove(nike);
		assertThat("���� : ���� �Ǽ��� 1�� �ƴ�", rmCnt, is(1));
		
		rmCnt = warehouse.remove(reebok);
		assertThat("���� : ���� �Ǽ��� 1�� �ƴ�", rmCnt, is(1));
		
		
	}
}
