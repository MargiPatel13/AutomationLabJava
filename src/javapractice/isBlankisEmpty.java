package javapractice;

public class isBlankisEmpty {

	public static void main(String[] args) {
		String m = "margi";
		String n = " ";
		String o = "";
		System.out.println("Contain text".isBlank());
		System.out.println("Contain text".isEmpty());
		
		System.out.println("-------------------------");
		
		System.out.println(" ".isBlank());
		System.out.println("".isBlank());
	
		System.out.println("-------------------------");

		System.out.println("".isEmpty());
		System.out.println(" ".isEmpty());
		
//		String isBlank() Method:
//			This method returns true if the given string is empty or contains only white space code points, otherwise false.
//
//			For ex:
//			System.out.println( "  ".isBlank() );           //true
//			 
//			System.out.println( "".isBlank() );             //true
	}

}
