package com.google.kickstart.practice;

import java.math.BigInteger;
import java.nio.file.attribute.AclEntry.Builder;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
	
	
	static List<String> buzzFizzAlgo() {
		return IntStream.rangeClosed(1, 100).mapToObj(num -> (num%15==0) ?  "Buzz Fizz" : (num%5 ==0) ?  "Buzz" : (num%3 == 0) ?  "Fizz" : String.valueOf(num)).collect(Collectors.toList());
	}

	static int factorial(int fact) {
		return IntStream.rangeClosed(1, fact).reduce(1, ( num1, num2) -> (num1*num2));
	}

	private static String findFibocci(int i) {
		return IntStream.rangeClosed(0, i ).map(num -> fibo(num)).mapToObj(res -> String.valueOf(res)).collect(Collectors.joining(" , "));
	}
		
	private static int fibo(int i) {
		return (i <= 1)  ?  1: fibo(i-1) + fibo(i-2);
	}
	
	private static void printRightAngleTriangle(int i) {
		IntStream.rangeClosed(1, i).forEach(num -> {
			IntStream.range(1, num).forEach(k->System.out.print("* "));
			System.out.println("");
		});
	}

	private static void sortList(String[] list) {
		Arrays.asList(list).stream().sorted().forEach(System.out :: println);		
	}

	private static void reverseSortList(String[] list1) {
		Arrays.asList(list1).stream().sorted(Collections.reverseOrder()).forEach(System.out :: println);
		
	}

	private static String findMaxElement(String[] list1) {
		return Arrays.asList(list1).stream().max(String :: compareTo).get();		
	}
	
	private static Optional<Integer> findMinElement(Integer[] intList) {
		return Stream.of(intList).mapToInt(k->k).boxed().min(Integer :: compare);
	}


	
	public static void main(String[] args) {
		System.out.println(" BUZZ FIZZ ALGO ");
		buzzFizzAlgo().stream().forEach(System.out::println);
		
		System.out.println(" Factorial Result ");
		System.out.println(factorial(3));
		
		System.out.println(" Fibonacci Series ");
		System.out.println(findFibocci(5));
		
		System.out.println(" Print Star Pater");
		printRightAngleTriangle(5);
		
		System.out.println(" Sort List in Ascending order");
		String [] list = {"Z","G", "R","A","S","L","B"};
		sortList(list);
		
		System.out.println(" Sort List in descending order");
		reverseSortList(list);
		
		System.out.println(" Find maximum Element in list ");
		System.out.println(findMaxElement(list));
		
		System.out.println(" Find minimum Element in list ");
		Integer [] intList = {12,3,1,3,67,31,5,78,23};
		Optional<Integer> var = findMinElement(intList);
		int num = var.isPresent() ?  var.get():  0;
		System.out.print("Min : "+num);
	}

	
	
	
	
	

	
	

}
