package com.google.kickstart.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		for(int i = 0 ; i < 100 ; i++) {
			list.add(i+"");
		}
		
		System.out.println(findEvenNumber(list));
	}

	private static List<Integer> findEvenNumber(List<String> list) {
		//return list.parallelStream().mapToInt(num -> Integer.parseInt(num)).filter(num -> num%2 == 0).collect(ArrayList :: new, ArrayList :: add, ArrayList :: addAll);
		return list.parallelStream().mapToInt(num -> Integer.parseInt(num)).filter(num -> num%2 == 0).boxed().collect(Collectors.toList());

	}

}
