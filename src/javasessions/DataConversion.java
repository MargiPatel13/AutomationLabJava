package javasessions;

public class DataConversion {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+22);
		
		int i = Integer.parseInt(x);
		System.out.println(i+22);
		

		//reading some string from prop/excel file
		//timeout = 20
		//"20" + 5 = "205"
		//from web page: data is always coming in the form of text (string)
		
		//String to double:
		String y = "12.33";
		System.out.println(y+20);
		double d1 = Double.parseDouble(y);
		System.out.println(d1+20);
		
		
//		String a = "100A";
//		int b = Integer.parseInt(a); //NumberFormatException
//		System.out.println(b+20);
		
		//Assignment -- use substring and solve above issue.
		String a = "100A";
	    String e= a.substring(0,3);
		int b = Integer.parseInt(e); 
		System.out.println(b+20);
		
		//String to boolean
		String headless = "true";
		if (Boolean.parseBoolean(headless)) {
			System.out.println("String to boolean = " + Boolean.parseBoolean(headless));
		}
		
		//String alphabet to int
		//String d = "T";
		//int d2= Integer.parseInt(d); //NumberFormatException
		//System.out.println(d2+100);
	
		//int to string
		int t1 =100;
		System.out.println(t1+""+20); //10020
		
		String t2= String.valueOf(t1);
		System.out.println(t2+20);// 10020
		
	}

}
