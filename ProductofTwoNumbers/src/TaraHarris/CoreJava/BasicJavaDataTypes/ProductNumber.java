package TaraHarris.CoreJava.BasicJavaDataTypes;

import java.util.Scanner;

public class ProductNumber {

	public static void main(String[] args) {
	
		/*
		 * 2. Write a Java program that takes two numbers as input and display the
		 * product of two numbers.
		 * 
		 * Example: Input first number: 25 Input second number: 5 Expected Output: 25 x
		 * 5 = 125
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input the first number");
		int num1 = input.nextInt();
		System.out.println("Input second number");
		int num2 = input.nextInt();
		System.out.println("The product of the numbers is: " + num1 * num2);
		
		//close input
		input.close();
		
		
	}//main

} //class
