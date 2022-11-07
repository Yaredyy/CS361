package Lessons;

import java.util.Scanner;
public class FactFib {
	
	public static int fact (int n) {
		if(n<0||n>12) {
			throw new IllegalArgumentException("n must be between 0 and 12");
		}
		if(n==0) {
			return 1;
		}
		else {
			return n * fact(n-1);
		}
	}
	
	public static int fib(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
	}
	
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++)
		try{
			System.out.println("For: "+ i+"\nFib= " + fib(i)+ ", fact= " + fact(i));
		}
		catch(StackOverflowError e) {
			System.out.println("Too big! Retry!");
		}
	}
}
