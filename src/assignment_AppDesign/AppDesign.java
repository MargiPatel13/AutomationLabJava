package assignment_AppDesign;

public abstract class AppDesign {
	
	public void logo() {
		System.out.println("Logo");
	}
	
	public void title() {
		System.out.println("title");
	}

	public void navBar() {
		System.out.println("navBar");
	}
	
	public abstract void url();
	
	public abstract void header();
	
	public abstract void body();
		
	public abstract void footer();
	
}
