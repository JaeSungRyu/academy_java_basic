package Junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class AssertTest {

	/**
	 * ------------------------------------------------
	 * @Test 애너테이션이 붙은 메소드를 자동 실행하여 테스트를 진행
	 * 모든 테스트 메소드는 리턴타입이 void로 지정되어야 한다.
	 * 모든 테스트 메소드는 매개변수가 없어야 한다.
	 * ------------------------------------------------
	 */
//	@Test
	void testAssertEqauls() {
		assertEquals( "안녕하세요","JUnitTest");
	}
//	@Test
	void testAssertEqauls2() {
		//두 입력값에 대해서 동일 값일 겻을 가정하여
		//같은 값이면 테스트가 success라고 판단.
			assertEquals( "안녕하세요","안녕하세요");

	}
	@Test
	public void testAssertBoolean() {
		//입력조건이 false일 것을 가정하여
		//false가 들어왔을때, 테스트가 success라고 판단
		assertFalse("실패-조건이flase가 아님", false);
	}
	@Test
	public void testNull() {
		//입력값이 null인경우 success
		assertNull(null);
	}
	@Test
	public void testNull2() {
//		입력값이 null이 아닌경우 fail
		assertNull(new Object());
	}
	
	public void testAssertNotSame() {
		assertNotSame("동일객체가 아니여야 함", new Object(),new Object());
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
		assertArrayEquals("두 배열의 내용이 동일함", numbers,copied);
	}
	public void testAssertByteArrayEquals() {
		byte[] expecteds = "테스트".getBytes();
		byte[] actuals = "합니다".getBytes();
		assertArrayEquals(expecteds, actuals);
	}
}
	

