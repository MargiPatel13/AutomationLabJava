package SuperPackage;

public class Car {

	public String name = "BMW";
	private int price = 50;
	protected String color = "Red";
	String model = "x1";

	public void m1() {
		System.out.println("public method");
	}
	
	private void m2() {
		System.out.println("private method");

	}
	
	protected void m3() {
		System.out.println("protected method");

	}
	
	void m4() {
		System.out.println("default method");

	}

	public static void main(String[] args) {

		Car c1 = new Car();
		System.out.println(c1.name);
		System.out.println(c1.price);
		System.out.println(c1.color);
		System.out.println(c1.model);
		
		String test = "Red";
		
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();

	}

}