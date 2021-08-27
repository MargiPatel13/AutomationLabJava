package Assignment_Inheritance;

public class Sheridan extends College {
	
	
	@Override
	public void engineering() { 
		System.out.println("Sheridan - - Engineering");
	}
	
	@Override
	public void laws() {
		System.out.println("Sheridan - - Laws");
	}
	
	public void mechanicalEngineering () {
		System.out.println("Sheridan - - Mechanical Engineering");
	}
	
	public void fireProtectionEngineering() {
		System.out.println("Sheridan - - Fire Protection Engineering");
	}

	public static void businessInformationTechnology() {
		System.out.println("Sheridan - - Business Information Technology");
	}
}
