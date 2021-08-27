package javapractice;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		//using Pre-define numbers
				int num = 25; int num1 = 78; int num2 = 87;
				if(num > num1 && num > num2) {
					System.out.println("The greatest: " +num);
				}else if(num1 > num2) {
					System.out.println("The greatest: " +num1);
				}else {
					System.out.println("The greatest: " +num2);
				}
				
				//getting number from the user
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
				
	}

}
