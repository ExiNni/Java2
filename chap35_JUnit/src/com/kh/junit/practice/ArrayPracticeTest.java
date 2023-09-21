package com.kh.junit.practice;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ArrayPracticeTest extends ArrayPractice{

	@Test
	public void testPractice1() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		int[] actual = {0,1,2,3,4,5,6,7,8,9};
		assertNotEquals(expected, actual);
	}
	
	@Test
	public void testPractice2() {
		int a = 10;
		int b = 10;
		int result = 20;
		assertEquals((a + b), result);
		
	}
	
	@Test
	public void testPractice3() {
		int[] expected = {1, 2, 3};
		int[] actual = new int[3];
		for(int i = 0; i < actual.length; i++) {
			actual[i] = (i + 1);
		}
		assertEquals(actual, expected);
		
	}
	@Test
	public void testPractice4() {
		int[] expected = {0,1,2,3,4,5,6,7,8,9};
		int[] actual = practice1(10);
		assertEquals(actual, expected);
	}
	
}
