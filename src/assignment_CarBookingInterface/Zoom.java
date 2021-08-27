package assignment_CarBookingInterface;

public class Zoom implements CarBooking{

	@Override
	public void pickUpPoint() {
		System.out.println("Zoom - - pickUpPoint");		
	}

	@Override
	public void typesOfCabs() {
		System.out.println("Zoom - - typesOfCabs");		
	}

	@Override
	public void colorOfCar() {
		System.out.println("Zoom - - colorOfCar");		
	}

	@Override
	public void tripDetail() {
		System.out.println("Zoom - - tripDetail");		
	}

	@Override
	public void otp() {
		System.out.println("Zoom - - OTP");		
	}

	@Override
	public void DropOffPoint() {
		System.out.println("Zoom - - DropOffPoint");				
	}

	@Override
	public void rideNow() {
		System.out.println("Zoom - - rideNow");				
		
	}
	
	public void rentACar() {
		System.out.println("Zoom - - rentACar");				
	}
	public void rentATruck() {
		System.out.println("Zoom - - rentATruck");				
	}
}
