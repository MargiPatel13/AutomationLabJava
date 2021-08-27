package javasessions;

public class ConstructorCarBookingTest {

	public static void main(String[] args) {
		CarBooking c2 = new CarBooking("Brampton","Toronto");
		CarBooking c3 = new CarBooking("zeep","Brampton","Toronto");
		CarBooking c4 = new CarBooking("altima", "Brampton", "Toronto", 123232);

		c2.booking();
		c3.booking();
		c4.bookingwithcode();
	}

}
