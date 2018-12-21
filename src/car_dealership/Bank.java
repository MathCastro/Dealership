package car_dealership;

public class Bank {
	
	public static boolean acceptTransaction(double value, int parcels) {
		if (parcels > 60) {
			return false;
		}else {
			double quantPerParcel = value/parcels;
			if (quantPerParcel < 500) {
				return true;
			}else {
				return false;
			}
		}
	}
}
