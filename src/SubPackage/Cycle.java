package SubPackage;

import SuperPackage.Car;

public class Cycle {

	public static void main(String[] args) {

		Car c1 = new Car();
		System.out.println(c1.name);
		c1.m1();
//		c1.m2();
//		c1.m3();
//		c1.m4();
		
		Cycle c2 = new Cycle();
		
	}

}