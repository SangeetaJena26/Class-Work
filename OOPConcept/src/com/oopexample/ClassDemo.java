/*class is user defined data type which contains data member and methos.It is a blue print 
to represent an object .
Object is runtime entity.It is also called as instance of a class.
 */
package com.oopexample;

import java.util.Scanner;

class Person
{
	//Data Members
	int age;
	String name;
	double height;
	String Quali;
	Scanner sc=new Scanner(System.in);
	//methods
	public void acceptInfo()  //methods are written in camelCase
	{
	System.out.println("Enter your name");
	name=sc.nextLine();
    System.out.println("Enter your age");
    age=sc.nextInt();
    System.out.println("Enter your height");
    height=sc.nextDouble();
    sc.nextLine();
    System.out.println("Enter your Qualification");
    Quali=sc.nextLine();
	}
	public void display()
	{
	 System.out.println("your name is: "+name+"\n"+"your age is: "+age+"\n"+"your Qualification is"+Quali);
		
	}	
}

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Person obj=new Person();
    obj.acceptInfo();
    obj.display();
	}

}
