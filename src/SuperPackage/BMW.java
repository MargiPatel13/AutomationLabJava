package SuperPackage;

public class BMW extends Car {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.name);
		//System.out.println(c1.price); //private - not access
		System.out.println(c1.color);
		System.out.println(c1.model);
		
		c1.m1();
		//c1.m2();
		c1.m3();
		c1.m4();
				
	}

}
