package com.test.pgm;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class HelloWorld {
	
	public static void main (String [] args) {
		System.out.println("Hello World");
		
		List<String> list = Arrays.asList("Programming","in","java","kava","savan","AAA");
		//list.stream().map(String :: toUpperCase ).forEach(System.out :: println);
		
		list.stream().filter(s->s.startsWith("P")).map(String :: toLowerCase ).forEach(System.out :: println);
	
		Predicate<String> p = (String s) -> s.contains("ava"); 
		
		list.stream().filter(p).forEach(System.out :: println);
		
		List<List<String>> flatMapList = new ArrayList<List<String>>();
		
		List<String> list2 = new ArrayList<String>();
		
		list2.add("AAA");
		list2.add("BBB");
		
		List<String> list3 = new ArrayList<String>();
		
		list3.add("ABC");
		list3.add("DEF");
		list3.add("AAA");

		
List<String> list4 = new ArrayList<String>();
		
		list3.add("ABCD");
		list3.add("DEFR");
		
		flatMapList.add(list2);
		flatMapList.add(list3);
		flatMapList.add(list4);
		
		System.out.println("Flat Map Example : \n");

		flatMapList.stream().flatMap(lis -> lis.stream()).forEach(System.out :: println);
		
		System.out.println("\nMap Example : \n");

		flatMapList.stream().map(lis -> lis.stream()).forEach(System.out :: println);

					
		//IntStream.range(1, 101).forEach(System.out :: println);
		
		System.out.println(list.containsAll(list2));
		
		list3.retainAll(list2);
		System.out.println(list3);
		
		
		
		
//		
		
		
	}

}
