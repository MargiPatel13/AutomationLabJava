package javapractice;

public class Fibonacci {

	public static void main(String[] args) {
		//0,1,1,2,4,8
		
		int a=0;
		int b=1;
		int no,i;
		System.out.println(a);
		System.out.println(b);
		
		for(i=0; i<=10; ++i) {
			no=a+b;
			System.out.println(no);
			a=b;
			b=no;
		}
	}

}
