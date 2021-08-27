package javaassignment;

import java.util.Scanner;

public class ConditonalOperators {

	public static void main(String[] args) {
		
//		1. Take three numbers from the user and print the greatest number. 
		//(1)using Pre-define numbers
		int num = 25; int num1 = 78; int num2 = 87;
		if(num > num1 && num > num2) {
			System.out.println("The greatest: " +num);
		}else if(num1 > num2) {
			System.out.println("The greatest: " +num1);
		}else {
			System.out.println("The greatest: " +num2);
		}
		System.out.println("---------------------");
	
		//(2)getting number from the user
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Input the 1st number: ");
		int n = scan.nextInt(); 
		System.out.print("Input the 2nd number: ");
		int n1 = scan.nextInt(); 
		System.out.print("Input the 3rd number: ");
		int n2 = scan.nextInt(); 
				
		if(n > n1 && n > n2) {
			System.out.println("The greatest number is: "+n);
		}else if(n1 > n2) {
			System.out.println("The greatest number is: "+n1);
		}else {
			System.out.println("The greatest number is: "+n2);
		}		
		System.out.println("-----------------------");

//		2. Write a Java program to test a number is positive or negative.		
		for(int i=0; i<2; i++) {
			System.out.print("Input number:");
			int no = scan.nextInt();
			if(no > 0) {
				System.out.println("positive number");
			}else if(no < 0){
				System.out.println("negative number");
			}else {
				System.out.println("the number is:"+no);
			}
		}
	}

}
