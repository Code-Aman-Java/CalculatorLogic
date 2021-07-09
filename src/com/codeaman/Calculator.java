package com.codeaman;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		/*Scanner k = new Scanner(System.in);
		 * A simple text scanner which can parse primitive types and strings using regular expressions. 
		 * */
		
		Scanner k = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		
		// nextDouble() scanner reads the next double from the keyboard
		
		double first = k.nextDouble();
		double second = k.nextDouble();
		
		System.out.print("Enter an operator (+, -, *, /): ");

		// next().charAt(0) used for read the operation character		
		char operator = k.next().charAt(0);
		double result;

		//switch case for each operation for calculator 
		
		switch (operator) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;

		default:
			System.out.print("Error! Incorrect Operator");
			return;
		}

		//printing the result of the operation on console
		
		/*
		 * PrintStream java.io.PrintStream.printf(String format, Object... args) A
		 * convenience method to write a formatted string to this output stream using
		 * the specified format string and arguments.
		 */
		System.out.printf("%.2f %c %.2f = %.2f", first, operator, second, result);
	}
}