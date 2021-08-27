package javaassignment;

public class LoopsAssignment {

	public static void main(String[] args) {
			
		String str = "I am Batman";
		//1 w.a.p to print following output
		for(int i = 1; i<=5; i++) {
			System.out.println(str);
		}
		System.out.println("--------------------");
		
		//2 w.a.p to print following output
		for(int i = 1; i<10; i++) {
			System.out.println(str+" "+i);
		}
		System.out.println("--------------------");

		//3 w.a.p to print 10 to 1 using for, while, and do-while loop
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		int j=10;
		while(j>=1) {
			System.out.println(j);
			j--;
		}
		
		int m=10;
		do{  
			System.out.println(m);  
			m--;  
		}while(m>=1); 	
		System.out.println("--------------------");
		
		
		//4 w.a.p in java to print "Hello World" 10 times using while loop
		String s = "Hello World";
		int i = 1;                 
		while(i<=10) {             
			System.out.println(s);
			i++;                
		}
		System.out.println("--------------------");
		
		//5 w.a.p to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		int a=1;
		while(a<=10) {
			if(a % 7 == 0) {
				System.out.println("Quit loop");
				break;
			}
			System.out.println(a);
			a++;
		}
		
		System.out.println("--------------------");
		// print even number(2,4,6,8,10)
		System.out.print("Even number is:");
		for(int b=0; b<=10; b++) {
			if(b % 2 == 0){
			System.out.print(" "+b);
			}
		}
		System.out.println();
		// print odd number(1,3,5,7,9)
		System.out.print("Odd number is: ");
		for(int c=0; c<=10; c++) {
			if(c % 2 != 0){
			System.out.print(" "+c);
			}
		}
System.out.println();
System.out.println("-------------");
	
	}
}
