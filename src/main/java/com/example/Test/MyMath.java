package com.example.Test;

public class MyMath {
	public int MathSum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

}
