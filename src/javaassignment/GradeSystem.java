package javaassignment;

public class GradeSystem {

	public static void main(String[] args) {
		
		//>=90 -- Grade A, 
		//71 - 90 ---> grade B
		//50 to 70--> grade C
		//less 50 -- Fail
		
		
		int m = 100;
		if (m==100 && m>=90) {
			System.out.println("Grade A");
		}else if(m>=89 && m>=71)
		{
			System.out.println("Grade B");
		}else if(m>=70 && m>=50)
		{
			System.out.println("Grade C");
		}else {
			System.out.println("Failed");
		}
		
		
		
	}	
	
			
}


	


