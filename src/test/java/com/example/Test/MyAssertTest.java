package com.example.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.Test;


class MyAssertTest {

	List<String> todos= Arrays.asList("AWS","AZURE","DEVOPS");
	@Test
	void test() {
		boolean test=todos.contains("AWS");
		assertEquals(true, test);
		assertEquals(3, todos.size());
		assertTrue(test);
		boolean test2=todos.contains("GCP");
		assertFalse(test2);
		assertArrayEquals(new int[] {1,2}, new int[] {1,2});
		assertEquals(10, 10);
		
		
	}

}
