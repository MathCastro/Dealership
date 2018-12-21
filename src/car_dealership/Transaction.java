package car_dealership;

public class Transaction {

	public Transaction(Customer customer, Employer employer, Vehicle vehicle) {
		super();
		this.customer = customer;
		this.employer = employer;
		this.vehicle = vehicle;
	}
	
	private Customer customer;
	private Employer employer;
	private Vehicle vehicle;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
