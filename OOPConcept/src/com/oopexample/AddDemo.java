package com.oopexample;
import java.util.Scanner;

class Add
{
	double a,b,sum;
	Scanner sc=new Scanner(System.in);
	public void inputData()
	{
		System.out.println("Enter two numbers");
		a=sc.nextDouble();
		b=sc.nextDouble();
	}
	public void add()
	{
		sum=a+b;
		System.out.println("The addition is"+sum);
		
	}
}
public class AddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Add oj=new Add();
	oj.inputData();
	oj.add();

	}

}
