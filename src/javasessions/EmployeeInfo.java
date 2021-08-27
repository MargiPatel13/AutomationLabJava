package javasessions;

import java.util.ArrayList;

public class EmployeeInfo {
	String name;
	int age;
	ArrayList<String> devicelist;
	String officeKit[];
	
	public EmployeeInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public EmployeeInfo(String name, int age, ArrayList<String> devicelist) {
		this.name = name;
		this.age = age;
		this.devicelist = devicelist;
	}
	public EmployeeInfo(String name, ArrayList<String> devicelist) {
		this.name = name;
		this.devicelist = devicelist;
	}
	public EmployeeInfo(String name, String[] officeKit) {
		this.name = name;
		this.officeKit = officeKit;
	}
	
	
	
}
