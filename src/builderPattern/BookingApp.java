package builderPattern;

public class BookingApp {

	public BookingApp login(String username, String password) {
		System.out.println("Logged in with " + " " + username + " " + password);
		return this;
	}

	public BookingApp tripStartDes() {
		System.out.println("Trip Start Destination");
		return this;

	}

	public BookingApp tripStartDes(String start) {
		System.out.println("Trip Start Destination");
		return this;
	}

	public BookingApp tripEndDes() {
		System.out.println("Trip End Destination");
		return this;
	}

	public BookingApp tripStartTime() {
		System.out.println("Trip Started");
		return this;
	}

	public BookingApp tripEndTime() {
		System.out.println("Trip Ended");
		return this;
	}

	public static void main(String[] args) {
		

		BookingApp b= new BookingApp();
		b.login("abc@gmail.com", "anc12");
		b.tripStartDes();
		b.tripEndDes();
		b.tripEndTime();
		 
		b.login("xyz@gmail.com", "xyz987");
		
		
		
		
		

}
