package Assignment_Inheritance;

public class Conestoga extends College {
	
	@Override
	public void engineering() { 
		System.out.println("Conestoga - - Engineering");
	}
	
	@Override
	public void physics() {
		System.out.println("Conestoga - - Chemistry");
	}
	
	public void cyberSecurity() {
		System.out.println("Conestoga - - Cyber Security");	
	}
	
	public void financialTechnology() {
		System.out.println("Conestoga - - Financial Technology");
	}

	public void humanResourcesManagement() {
		System.out.println("Conestoga - - Human Resources Management");
	}
}
