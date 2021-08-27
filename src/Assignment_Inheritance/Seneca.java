package Assignment_Inheritance;

public class Seneca extends College{
	
	@Override
	public void engineering() { 
		System.out.println("Seneca - - Engineering");
	}
	
	public void computerScienceEngineering() {
		System.out.println("Seneca - - Computer Science and Engineering");
	}
	
	public void dataScienceAnalytics() {
		System.out.println("Seneca - - Data Science and Analytics");
	}
}
