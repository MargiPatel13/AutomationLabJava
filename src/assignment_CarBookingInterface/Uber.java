package assignment_CarBookingInterface;

public class Uber implements CarBooking {
	
	@Override
	public void pickUpPoint() {
		System.out.println("Uber - - pickUpPoint");		
	}
	
	@Override
	public void typesOfCabs() {
		System.out.println("Uber - - typesOfCabs");		
	}

	@Override
	public void colorOfCar() {
		System.out.println("Uber - - colorOfCar");		
	}

	@Override
	public void tripDetail() {
		System.out.println("Uber - - tripDetail");		
	}

	@Override
	public void otp() {
		System.out.println("Uber - - OTP");		
	}

	@Override
	public void DropOffPoint() {
		System.out.println("Uber - - DropOffPoint");				
	}
	@Override
	public void rideNow() {
		System.out.println("Uber - - rideNow");				
	}
	
	public void navigateVoiceOverMenu() {
		System.out.println("Uber - - navigateVoiceOverMenu");				
	}
	
}
