package com.test.pgm;

import java.util.stream.IntStream;

public class FindSum {
	
	
	public static void findNumbers(int num,int [] a) {
		int j = 0;	
		for(int i = 0 ; i < a.length ; i++) {
			if((a[i]+a[j]) == num) {
					System.out.println(a[i]+" + "+a[j] + " = "+num );
					i=-1;
					j++;
				}
			}
	}
		
	public static void main(String[] args) {
	int a[] = {1,2,3,4,5,6,7};
		findNumbers(7,a);
	}

}
