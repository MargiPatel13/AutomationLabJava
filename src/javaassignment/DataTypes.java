package javaassignment;

public class DataTypes {

	public static void main(String[] args) {
		
		// 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		String s = "Hello";
		System.out.println(s);
		System.out.println("Margi P");
		
		System.out.println("------------");		
		//2. Write a Java program to print the sum of two numbers. 
		int a = 74;
		int b = 36;
		System.out.println(a + b);
		
		System.out.println("------------");		
		//3. Write a Java program to divide two numbers and print on the screen. 
		int i=50;
		int j =3;
		System.out.println(i/j);
		
		System.out.println("------------");	
	
		//4. Write a Java program to print the result of the following operations. Change your test data accordingly.	
		//a -5 + 8 * 6
		int c = -5;	
		int d = 8;	
		int e = 6;
		System.out.println(c+d*e);
		
		//b (55+9) % 9 
		int f = 55;	
		int g = 9;
		System.out.println((f+g)%g);
		
		//c 20 + -3*5 / 8 
		int h = 20;	
		int k = 5;
		System.out.println(h + -j*k / d);
		
		//d 5 + 15 / 3 * 2 - 8 % 3
		int l = 15;
		int m = 2;
		System.out.println(k+l / j * m - d % j);
		
		System.out.println("-----------------");	
		//5. Write a Java program to compute the specified expressions and print the output. Go to the editor
		//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
		double a1 = 25.5;
		double b1 = 3.5;	
		double c1 = 40.5;	
		double d1 = 4.5;
		System.out.println((a1 * b1 - b1 * b1) / (c1 - d1));
		
		System.out.println("-----------------");
		//6. Try to concat "Hello Selenium" with a character 't'.
		String s1= "Hello Selenium";
		char s2 = 't';
		System.out.println(s1 + s2);
		
		System.out.println("-----------------");
		//7.  Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : "Your Total amount is. 3700".
		int e1 = 100;
		int f1 = 200;
		int g1 = 3400;
		System.out.println("Your Total amount is. " + (e1 + f1 + g1));
		
		System.out.println("-----------------");	
		//8. What should be the output for :
		byte b3 = 065;
		System.out.println(b3);
	}

}
