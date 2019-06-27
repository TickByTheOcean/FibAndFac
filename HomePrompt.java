package com.revature.prompt;

import java.util.Scanner;

public class HomePrompt implements Prompt {
	private Scanner scan = new Scanner(System.in);
	
	public Prompt run() {
		while (true) {
			System.out.print("Enter 1 for Factorial or 2 for Fib: ");
			int choice = scan.nextInt();
			
			switch (choice) {
			
			case 1: 
			System.out.print("Enter a number to be factored: ");
			int choice2 = scan.nextInt();
			System.out.println(factorial(choice2));
			break;
			
			case 2: 
			System.out.println("Enter the number of places you want to see"
					+ " in the Fib: ");
			int choice3 = scan.nextInt();
			System.out.println(fib(choice3));	
			break;
			
			default:
			System.out.println(choice + " is not a valid response."
					+ " Please try again: ");
			break;
			}
		}
	}
	
	public static int factorial (int n) {
		 if (n == 0) {
			 return 1;
		 }
		 else {
			 return n*factorial(n-1);
		 }
	}
	
	public static int fib (int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	
}
