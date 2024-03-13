package com.assignments;

import java.util.Scanner;

public class PsTwo {
	public static int calculateSum(int number1, int number2) {
		return number1+number2;
	}
	
	public static void main(String[] args) {
		//scanner inside try will automatically call close()
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter first Number");
			int number1 = scanner.nextInt();
			
			System.out.println("Enter second Number");
			int number2 = scanner.nextInt();
			
			System.out.println("sum is "+calculateSum(number1, number2));
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		
	}
}
