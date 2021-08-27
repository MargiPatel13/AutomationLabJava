package javasessions;

public class CarBooking {
	String  carType;
	String from;
	String to;
	int code;
	//we should never write business logic in constructor
	//constructor : template of the class: used to initialize the class vars
	public void booking() { //function-method
		System.out.println("Car is booked with:" +carType + " " + from +" "+ to);
	}
	public void bookingwithcode() { //function-method
		System.out.println("Car is booked with:" +carType + " " + from +" "+ to +" "+code);
	}
	public CarBooking(String from, String to) { 
		this.from = from;
		this.to = to;
	}
	public CarBooking(String carType, String from, String to) {
		this.carType = carType;
		this.from = from;
		this.to = to;
	}
	public CarBooking(String carType, String from, String to, int code) {
		this.carType = carType;
		this.from = from;
		this.to = to;
		this.code = code;
	}
	
	
	
}
