package com.test.pgm;

import java.util.stream.IntStream;

public class multipleof3or5 {

	public static void main(String[] args) {
		
		IntStream.range(1, 100).forEach(i -> {
			if(i%15 == 0 ) {
				 System.out.println(i+ " : BUZZ FEED");
				
					} else if(i%3==0) {
						System.out.println(i + " : BUZZ");
											}
					else if(i%5==0) {
						System.out.println(i + " : FEED");
					}
					
		});
		
	}
	
}
