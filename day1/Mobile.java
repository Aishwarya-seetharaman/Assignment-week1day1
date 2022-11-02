package week1.day1;

public class Mobile {

	public void makeCall() {
		String mobileModel = "SamsungA21s";
		float mobileWeight = 10.6f;
		System.out.println("Dial the number");
		
	}
	public void sendMessage() {
		boolean fullyCharged = false;
		int mobileCost = 25000;
		System.out.println("Send Text Message");
	}
	
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.sendMessage();
		obj.makeCall();
		System.out.println("This is my mobile");
	}
}