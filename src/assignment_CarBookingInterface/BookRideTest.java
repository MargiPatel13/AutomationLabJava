package assignment_CarBookingInterface;

public class BookRideTest {

	public static void main(String[] args) {
	
		Ola ola = new Ola();
		ola.pickUpPoint();
		ola.typesOfCabs();
		ola.colorOfCar();
		ola.rideNow();
		ola.otp();
		ola.DropOffPoint();
		ola.tripDetail();
		ola.rateCard();
		ola.ReferEarn();
		ola.olaMoney();

		Uber uber = new Uber();
		uber.pickUpPoint();
		uber.typesOfCabs();
		uber.colorOfCar();
		uber.rideNow();
		uber.otp();
		uber.DropOffPoint();
		uber.tripDetail();
		uber.navigateVoiceOverMenu();
		
		Zoom zoom = new Zoom();
		zoom.pickUpPoint();
		zoom.typesOfCabs();
		zoom.colorOfCar();
		zoom.rideNow();
		zoom.otp();
		zoom.DropOffPoint();
		zoom.tripDetail();
		zoom.rentACar();
		zoom.rentATruck();
		
		CarBooking car = new Uber(); 
		car.pickUpPoint();
		car.typesOfCabs();
		car.colorOfCar();
		car.rideNow();
		car.otp();
		car.DropOffPoint();
		car.tripDetail();
		
		//Uber car1 = new CarBooking(); 

	}

}
