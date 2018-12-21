package car_dealership;

public class Employer {
	
	public Employer(String name) {
		super();
		this.name = name;
	}

	String name;
	
	public boolean sellCar(Vehicle vehicle, Customer customer, int parcels, Bank bank) {
		return bank.acceptTransaction(vehicle.getValue() - customer.getCashOnHand(), parcels);
	}
}
