package UnitTesting;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class test {
	
	@Test
	public void addtestSuccess() {
		unitTesting u = new unitTesting();
		long x = 2;
		long y = 2;
		long added = u.addInts(x, y);
		long expected = 4;
		assertEquals(expected, added);
	}
	@Test
	public void addtestFail() {
		unitTesting u = new unitTesting();
		long x = 1;
		long y = 2;
		long expected = 4;
		long added = u.addInts(x, y);
		assertFalse(added == expected);
	}
	@Test
	public void addtestNegative() {
		unitTesting u = new unitTesting();
		long x = -1;
		long y = -2;
		long added = u.addInts(x, y);
		long expected = -3;
		assertEquals(expected, added);
	}
	@Test
	public void addtestOverflow() {
		unitTesting u = new unitTesting();
		long x = 2000000000;
		long y = 2000000000;
		long added = u.addInts(x, y);
		long expected = 4000000000l;
		assertEquals(expected, added);
	}
	
	
	
	@Test
	public void StringsTest() {
		unitTesting u = new unitTesting();
		String x = "Hello";
		String y = "World";
		String StringAdd = u.addStrings(x, y);
		String expected = "HelloWorld";
		assertEquals(expected, StringAdd);
	}
	@Test
	public void StringsTestFail() {
		unitTesting u = new unitTesting();
		String x = "Hell";
		String y = "World";
		String StringAdd = u.addStrings(x, y);
		String expected = "HelloWorld";
		assertFalse(StringAdd == expected);
	}
	@Test
	public void StringsLenTest() {
		unitTesting u = new unitTesting();
		String x = "Hello";
		String y = "World";
		int nx = x.length();
		int ny = x.length();
		int StringAdd = (u.addStrings(x, y)).length();
		int expected = nx + ny;
		assertEquals(expected, StringAdd);
	}
	
	
	
	
	
	@Test
	public void LenTest() {
		unitTesting u = new unitTesting();
		String s = "Hello";
		int length = u.findLen(s);
		int expected = 5;
		assertEquals(expected, length);
	}
	@Test
	public void LenTestFail() {
		unitTesting u = new unitTesting();
		String s = "Hello";
		int length = u.findLen(s);
		int expected = 4;
		assertFalse(length == expected);
	}
	@Test
	public void LenTestEmpty() {
		unitTesting u = new unitTesting();
		String s = "";
		int length = u.findLen(s);
		int expected = 0;
		assertEquals(expected, length);
	}
	
	
	
	
	@Test
	public void DivTestEquals() {
		unitTesting u = new unitTesting();
		int x = 4;
		int y = 2;
		Object divided = u.divXbyY(x, y);
		int expected = 2;
		assertEquals(expected, divided);
	}
	@Test
	public void DivTestEqualsFail() {
		unitTesting u = new unitTesting();
		int x = 3;
		int y = 2;
		Object divided = u.divXbyY(x, y);
		Object expected = 2;
		assertFalse(divided == expected);
	}
	@Test
	public void DivTestNull() {
		unitTesting u = new unitTesting();
		int x = 0;
		int y = 1;
		Object divided = u.divXbyY(x, y);
		Object expected = null;
		assertEquals(expected, divided);
	}
	/*@Test
	public void DivTest4() {
		unitTesting u = new unitTesting();
		int x = 0;
		int y = 1;
		Object divided = u.divXbyY(x, y);
		Object expected = null;
		assertEquals(expected, divided);
	}*/
	
	
	
	@Test
	public void Arraytest() {
		unitTesting u = new unitTesting();
		int IntArray[] = {0,2,4,5};
		Object reversed = u.reverseIntArray(IntArray);
		int[] expected = {5,4,2,0};
		assertEquals(expected, reversed);
	}
	
	@Test
	public void ArraytestFail() {
		unitTesting u = new unitTesting();
		int[] IntArray = {0,2,4,5};
		Object reversed = u.reverseIntArray(IntArray);
		int[] expected = {0,4,2,0};
		assertFalse(reversed == expected);
	}
	@Test
	public void ArraytestPalendrome() {
		unitTesting u = new unitTesting();
		int IntArray[] = {0,0,0};
		Object reversed = u.reverseIntArray(IntArray);
		int[] expected = {0,0,0};
		assertTrue(reversed == expected);
	}
	
	
	
	
	@Test
	public void RangeTest() {
		unitTesting u = new unitTesting();
		int x = 1;
		int y = 1;
		int z = 1;
		int r = 6;
		Object reversed = u.range(x, y, z, r);
		int[] expected = {7, 7, 7};
		assertEquals(expected, reversed);
	}
	
	@Test
	public void RangeTestFail() {
		unitTesting u = new unitTesting();
		int x = 1;
		int y = 1;
		int z = 1;
		int r = 6;
		Object reversed = u.range(x, y, z, r);
		int[] expected = {0, 0, 0};
		assertFalse(reversed == expected);
	}
}
