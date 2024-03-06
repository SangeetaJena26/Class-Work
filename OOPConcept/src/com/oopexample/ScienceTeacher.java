package com.oopexample;

import java.util.Scanner;

class Teacher
{
	int tid;
	String tname;
	double salary;
	Scanner sc=new Scanner(System.in);
	public void accept() {
		
		System.out.println("Enter your tid:");
		tid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name:");
		tname=sc.nextLine();
		System.out.println("Enter your salary:");
		salary=sc.nextDouble();		
	}
	
}

class HRA extends Teacher
{
	double salHra=0;
	public void calculate()
	{
		salHra=salary+0.12*(salary);
		System.out.println("Your HRA added salary is:"+salHra);
		
	}
}

public class ScienceTeacher extends HRA {
       int bonus=5000;
       double totalSal;
       public void finalSal()
       {
    	   totalSal=salHra+bonus;
    	   System.out.println("The final salary given to you is"+totalSal);
    	   
       }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScienceTeacher obj=new ScienceTeacher();
		obj.accept();
		obj.calculate();
		obj.finalSal();
		

	}

}
