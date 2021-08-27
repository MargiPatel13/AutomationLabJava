package javasessions;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "Hi this is my java code and i am so happy";
		
		System.out.println(s.length());
		
		int l = s.length();//41
		int hi = l-1;//40
		int li = 0;
		
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(40));
		//System.out.println(s.charAt(41));//StringIndexOutOfBoundsException
		//System.out.println(s.charAt(-1));//StringIndexOutOfBoundsException
		System.out.println("-----");
		System.out.println(s.indexOf('i'));//1st occurrence of i
		System.out.println(s.indexOf('i', s.indexOf('i')+1));//2nd occurrence of i
		
		System.out.println(s.indexOf('H'));
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("naveen"));//-1
		
		String mesg = "welcome null";
		if(mesg.indexOf("admin")>0) {
			System.out.println("admin user logged in");
		}
		else {
			System.out.println("user is null...");
		}
		
		System.out.println("---Assignment---");

		//Assignment
		//Can you calculate 3rd and 4th occurrences with the formula without the hardcoded values? 
		// use For, while or simple formula simple write the 2nd, 3rd and 4th occ. without loop if want to use loop use it. 
		String a = "selenium -java automation testing is fun";

		System.out.println(a.indexOf('i'));//1st occurrence of i
		System.out.println(a.indexOf('i', a.indexOf('i')+1));//2nd occurrence of i
		System.out.println(a.indexOf('i' ,a.indexOf('i',a.indexOf('i')+1)+1));//3rd occurrence of i
		System.out.println(a.indexOf('i' ,a.indexOf('i',a.indexOf('i',a.indexOf('i')+1)+1)+1));//4th occurrence of i
		System.out.println(a.indexOf('i' ,a.indexOf('i',a.indexOf('i',a.indexOf('i', a.indexOf('i')+1)+1)+1)+1));//5th occurrence of i


	}

}