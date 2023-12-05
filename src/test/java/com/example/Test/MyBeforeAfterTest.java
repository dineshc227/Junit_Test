package com.example.Test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyBeforeAfterTest {
	@BeforeAll
	static void beforeAll() {
		System.out.println("beforeAll");
	}
	@Before(value = "before")
	void before() {
		System.out.println("before");
	}
	@BeforeEach
	void beforeEach() {
		System.out.println("beforeEach");
	}
	
	@Test
	void test1() {
		System.out.println("test1");
	}
	@Test
	void test2() {
		System.out.println("test2");
	}
	@Test
	void test3() {
		System.out.println("test3");
	}
	
	@After(value="after")
	void after() {
		System.out.println("after1");
	}
	@AfterEach
	void afterEach() {
		System.out.println("afterEach");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("afterAll");
	}
	

}
