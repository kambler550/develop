package com.google.kickstart.practice;

import java.util.Scanner;

public class JudgingSystem {
	public static Scanner scanner = new Scanner(System.in);

	public static void main (String []args) {

	int t = scanner.nextInt();
for (int tc = 0 ; tc < t ; tc++) {
	int a = scanner.nextInt();

	int b = scanner.nextInt();

   
	    solveProblem(scanner,a,b);
}
	}

	private static void solveProblem(Scanner scanner, int a, int b) {

		  int m = (a + b) / 2;
		    System.out.println(m);
		    String s = scanner.next();
		    if (s.equals("CORRECT")) {
		      return;
		    } else if (s.equals("TOO_SMALL")) {
		    	solveProblem(scanner, m + 1, b);
		    } else {
		    	solveProblem(scanner, a, m - 1);
		    }
		
	}
}
