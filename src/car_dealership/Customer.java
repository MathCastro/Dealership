package car_dealership;

public class Customer {

	public Customer(String name, String address, double cashOnHand) {
		super();
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
	}

	private String name;
	private String address;
	private double cashOnHand;
	
	public void purchaseCar(Vehicle vehicle, Employer employer, int parcels, Bank bank) {
		if(employer.sellCar(vehicle, this, parcels, bank)) {
			System.out.println("Comprei o carro a " + parcels + " de " + ((vehicle.getValue() - this.cashOnHand)/parcels) + " mais entrada de " + this.cashOnHand);
		}else {
			System.out.println("Deu não!");
		}
			
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
}
