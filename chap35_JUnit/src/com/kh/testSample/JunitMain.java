package com.kh.testSample;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class JunitMain {

	@Test
	public void testStringEquals() {
		String expected = "Hello, World";
		String actual = "Hello, World";
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testStringInequals() {
		String expected = "Hello, Java";
		String actual = "Hello, World";
		assertNotEquals(expected, actual);
	}
	
	@Test
	public void testArrayEquals() {
		int[] expected = {1,2,3};
		int[] actual = {1,2,3};
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	public void testArrayInEqual() {
		int[] expected = {1,2,3};
		int[] actual = {3,2,1};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testDoubleEqual() {
		double expected = 0.1 + 0.2;
		double actual = 0.3;
		assertEquals(expected, actual, 0.001); // 부동 소수점 비교 (오차 범위 지정)
	}
	
	@Test
	public void testDoubleInEqual() {
		double expected = 0.1 + 0.2;
		double actual = 0.31;
		assertNotEquals(expected, actual, 0.001);
	}
}
