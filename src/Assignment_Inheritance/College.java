package Assignment_Inheritance;

public class College extends University {
	
	@Override
	public void engineering() { 
		System.out.println("Colleges - - Engineering");
	}
	
	public void machineLearning() {
		System.out.println("Colleges - - Machine Learning");
	}
	
	public final void aviation() {
		System.out.println("Colleges - - Aviation");
	}
	
	public static void businessInformationTechnology() {
		System.out.println("Colleges - - Business Information Technology");
	}
	
	private void arts() {
		System.out.println("Colleges - - Arts");
	}
	
}
