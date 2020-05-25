package com.google.kickstart.practice;

import java.util.ArrayList;

class X{
	int age;

	public X() {
		
	}
	
	public X(int age) {
		super();
		this.age = age;
	}
	
	
}

public class StaticInitTest {
	int age; 
	
	public StaticInitTest() {
		super();
		System.out.println("inside default constructor");

	}
	
	public StaticInitTest(int age) {
		super();
		this.age = age;
		System.out.println("inside parameterised constructor");

	}

	static {
		int counter =0 ;
		counter++;
		System.out.println("inside static block "+counter);
	}
	{
		int age = 10; 
		System.out.println("inside init block "+age);

	}
	
	public static void main(String[] args) {
		
		final ArrayList<String> l = new ArrayList();
		
		System.out.println("inside main method ");
		StaticInitTest x1 = new StaticInitTest();
		
		l.add("test");
		l.add("HELllo");
		System.out.println("l "+ l);
		
		l.remove("test");
		
		System.out.println("l "+ l);
		System.out.println(l.get(0).intern());
		
		String a = new String("MyTest");
		
		System.out.println(a.substring(0, 3));
		String b = "MyTest";
		String c = "MyTest";

		System.out.println(a.equals(b));

		
	}

}
