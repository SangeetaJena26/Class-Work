/* 
Acquiring properties from one class to another class is called as Inheritance.The class from which properties are inherited is called \
as base class and The class in which properties are inherited are called as derived class.

Types of Inheritance: 1)Single Inheritance (one single base class and single derived class)
2)Multilevel Inheritance
 */
package com.oopexample;

import java.util.Scanner;

class AddDemo1
{
	int a,b,sum;
	Scanner sc=new Scanner(System.in);
	public void inputNum()
	{
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	
}
class Result extends AddDemo1
{
	public void display()
	{
		sum=a+b;
		System.out.println("The sum is"+sum);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result obj=new Result();
		obj.inputNum();
		obj.display();
		}

}
