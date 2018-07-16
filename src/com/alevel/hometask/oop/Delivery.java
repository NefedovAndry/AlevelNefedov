
public class Delivery {

	private Baggage baggage;
	private Transport transport;
	private City checkOut;
	private City checkIn;

	Delivery(Baggage baggage, Transport transport, City checkOut, City checkIn) {
		this.baggage = baggage;
		this.transport = transport;
		this.checkOut = checkOut;
		this.checkIn = checkIn;
	}

	public double price() {
		return baggage.getVolume()*baggage.getMass()*transport.getTransIndex();
	}

	public void info() {
		System.out.println("Baggage name: " + baggage.getName());
		System.out.println("Baggage volume: " + baggage.getVolume());
		System.out.println("Baggage mass: " + baggage.getMass());
		System.out.println("Transport: " + transport.toString());
		System.out.println("Check-out: " + checkOut.toString());
		System.out.println("Check-in: " + checkIn.toString());
		System.out.println("Delivery price: " + price());
	}
}