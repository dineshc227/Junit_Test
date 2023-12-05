package com.example.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

	MyMath math = new MyMath();

	@Test
	void contextLoads() {
	}

	@Test
	void CalculateSum_ThreeMemberArray() {
		assertEquals(6,math.MathSum(new int[] { 1, 2, 3 }));
	}

	@Test
	void MyMathTest1() {
		
		assertEquals(0,math.MathSum(new int[] {  }));
	}
}
