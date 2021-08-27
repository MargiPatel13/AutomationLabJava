package javapractice;

import java.util.Scanner;

public class ScannerInputFromConsole {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Even/Odd
		for(int i=0; i<3; i++) {
		System.out.print("Enter a number: ");
		int n = s.nextInt();  

					if(n%2==0){  
				        System.out.println("The number "+n +" is even number");  
				    }else{  
				        System.out.println("The number "+n +" is odd number");  
				    } 
		System.out.println();
		}
		System.out.println("End of odd/even program");
					
		//greatest number	
		System.out.print("Input the 1st number: ");
		int num = s.nextInt(); 
		System.out.print("Input the 2nd number: ");
		int num1 = s.nextInt(); 
		System.out.print("Input the 3rd number: ");
		int num2 = s.nextInt(); 
		
				if(num > num1 && num > num2) {
					System.out.println("The greatest number is: "+num);
				}else if(num1 > num2) {
					System.out.println("The greatest number is: "+num1);
				}else {
					System.out.println("The greatest number is: "+num2);
				}
		
	}

}
