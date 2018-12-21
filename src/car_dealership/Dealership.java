package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("Matheus", "Logo ali", 5000);
		Employer employer = new Employer("João");
		Vehicle vehicle = new Vehicle("Clio", 30000);
		Bank bank = new Bank();
		
		customer.purchaseCar(vehicle, employer, 60, bank);
	}

}