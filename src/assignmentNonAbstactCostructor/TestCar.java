package assignmentNonAbstactCostructor;

public class TestCar {

	public static void main(String[] args) {
		//With non abstract class:  Create one car class having one default constructor or any parameterize const, and bmw class also having one constructor and you create the object of bmw and check that is it really calling the parent class const or bmw car const 
		
		BMW b = new BMW();
		BMW b1 = new BMW("SUV");
		Car c = new Car("SUV");
	}

}
