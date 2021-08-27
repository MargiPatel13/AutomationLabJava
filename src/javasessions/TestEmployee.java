package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class TestEmployee {

	public static void main(String[] args) {
     
	 EmployeeInfo e1 = new EmployeeInfo("Tom",20);
     System.out.println(e1.devicelist);
     
     ArrayList<String> devList = new ArrayList<String>();
     devList.add("iPhoneXs");
     devList.add("iMac");
     devList.add("MSI GL65");
     
     EmployeeInfo e2 = new EmployeeInfo("Tom",20,devList);
     System.out.println(e2.name + " " + e2.age + " " + e2.devicelist);
     
     String[] kits = new String[4];
     kits[0]= "Water Bottle";
     kits[1]= "Pens";
     kits[2]= "Bag";
     kits[3]= "Notes";
     
     System.out.println(kits.length);
    
     EmployeeInfo e3 = new EmployeeInfo("margi", kits);
    	System.out.print(e3.name);
    	System.out.print("[");
    	//for(int i=0; i<=e3.officeKit.length; i++) {}
    	 for(String e : e3.officeKit) {
        	 System.out.print(" " +e+ " ");
         }
    	 System.out.println("]");
    	 
    	 
	}

}
