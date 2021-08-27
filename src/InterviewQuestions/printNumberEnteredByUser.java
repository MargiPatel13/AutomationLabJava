package InterviewQuestions;

import java.util.Scanner;

public class printNumberEnteredByUser {

	public static void main(String[] args) {
		//1. print an integer(entered by user)
		Scanner reader = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		
		int a = reader.nextInt();

		System.out.println("the number is: "+a);
		
		
	}

}
