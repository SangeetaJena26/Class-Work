package com.oopexample;

public class Calculator {
		
	// Method to add two integers
	public int add(int a, int b)
	{
	return a + b;
	}
	// Overloaded method to add three integers
	public int add(int a, int b, int c)
	{
	return a + b + c; }
	// Overloaded method to add two doubles
	public double add(double a, double b)
	{
	return a + b;
	}
	// Overloaded method to add three doubles
	public double add(double a, double b, double c)
	{
	return a + b + c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		// Adding two integers
		int sum1 = calculator.add(5, 10);
		System.out.println(sum1); // Output: 15
		// Adding three integers
		int sum2 = calculator.add(5, 10, 15);
		System.out.println(sum2); // Output: 30
		// Adding two doubles
		double sum3 = calculator.add(5.5, 10.5);
		System.out.println(sum3); // Output: 16.0
		// Adding three doubles
		double sum4 = calculator.add(5.5, 10.5, 15.5);
		System.out.println(sum4); // Output: 31.5

	}

}