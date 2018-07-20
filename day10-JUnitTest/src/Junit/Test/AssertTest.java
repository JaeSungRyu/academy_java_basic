package Junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class AssertTest {

	/**
	 * ------------------------------------------------
	 * @Test �ֳ����̼��� ���� �޼ҵ带 �ڵ� �����Ͽ� �׽�Ʈ�� ����
	 * ��� �׽�Ʈ �޼ҵ�� ����Ÿ���� void�� �����Ǿ�� �Ѵ�.
	 * ��� �׽�Ʈ �޼ҵ�� �Ű������� ����� �Ѵ�.
	 * ------------------------------------------------
	 */
//	@Test
	void testAssertEqauls() {
		assertEquals( "�ȳ��ϼ���","JUnitTest");
	}
//	@Test
	void testAssertEqauls2() {
		//�� �Է°��� ���ؼ� ���� ���� ���� �����Ͽ�
		//���� ���̸� �׽�Ʈ�� success��� �Ǵ�.
			assertEquals( "�ȳ��ϼ���","�ȳ��ϼ���");

	}
	@Test
	public void testAssertBoolean() {
		//�Է������� false�� ���� �����Ͽ�
		//false�� ��������, �׽�Ʈ�� success��� �Ǵ�
		assertFalse("����-������flase�� �ƴ�", false);
	}
	@Test
	public void testNull() {
		//�Է°��� null�ΰ�� success
		assertNull(null);
	}
	@Test
	public void testNull2() {
//		�Է°��� null�� �ƴѰ�� fail
		assertNull(new Object());
	}
	
	public void testAssertNotSame() {
		assertNotSame("���ϰ�ü�� �ƴϿ��� ��", new Object(),new Object());
	}
	@Test
	public void testAssertThatHasItems() {
		assertThat(Arrays.asList("1st","2nd","3rd")
				,CoreMatchers.hasItems("1st","2nd"));
	}
		@Test
	
	
	public void testAssertArrayEquals() {
		int[] numbers = new int[10];
		int[] copied = numbers;
		assertArrayEquals("�� �迭�� ������ ������", numbers,copied);
	}
	public void testAssertByteArrayEquals() {
		byte[] expecteds = "�׽�Ʈ".getBytes();
		byte[] actuals = "�մϴ�".getBytes();
		assertArrayEquals(expecteds, actuals);
	}
}
	

