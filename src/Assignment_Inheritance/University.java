package Assignment_Inheritance;

public class University extends CMEC{

	public void phd() {
		System.out.println("University -- PhD");
	}
	
	public void laws() {
		System.out.println("University - - Laws");
	}
	
	public void engineering() {
		System.out.println("University - - Engineering");
	}
	
	public void mbbs() {
		System.out.println("University - - MBBS");
	}
	
	public static void pharmacy() {
		System.out.println("University - - Pharmacy");
	}
	@Override
	public void bioMedical() {
		System.out.println("University - - Bio-Medical");
	}
}
