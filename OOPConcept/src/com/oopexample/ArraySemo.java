//Array is linear data structure which stores elements of same kind.
//Elements of array gets stored in contiguous way.
//array indexing starts with zero
//syntax:
//  int a[]=new int[5];
//array element is recognized by its index number.



//WAP to accept two array values(5 elements of each) and add them.

package com.oopexample;
import java.util.Scanner;

public class ArraySemo {

	public static void main(String[] args) {
		//dynamic declaration of an element
		int a[]= new int[5];
		int b[]=new int[5];
		int c[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter five numbers for array1");
				
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
	
		System.out.println("Enter five numbers for array 2");
		
		for(i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("The sum of two arrays are:");
		for(i=0;i<5;i++)
		{	
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
		
	} 
}
