//In this example, we have a Parent class with a show() method, 
//and a Child class that extends the Parent class and overrides the show() method. 
//When we create an instance of Child and call the show() method,
//the overridden method in the Child class is executed,not the one in the Parent class.
package com.oopexample;

class Parent
{
	public void show()
	{
	System.out.println("It is parent class show");
	}
}
class Child extends Parent
{
	@Override
	public void show()
	{
		System.out.println("It is child class show");
	}
}

public class MethodOverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.show();
		Parent obj1=new Parent();
		obj1.show();
	}

}`
