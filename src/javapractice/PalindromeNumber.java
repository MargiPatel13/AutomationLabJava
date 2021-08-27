package javapractice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		String o;
		String rev= "";   
	      Scanner s = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      o = s.nextLine();   
	      int length = o.length();   
	      for ( int i = length - 1; i >= 0; i-- ) 
	         rev = rev + o.charAt(i);  
	      if (o.equals(rev))  {
	         System.out.println("Entered string/number is a palindrome.");  
	      } else { 
	         System.out.println("Entered string/number isn't a palindrome.");   
	        
	   }  
	}


}

