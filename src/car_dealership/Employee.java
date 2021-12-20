package car_dealership;

public class Employee {
	
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
		} else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust, vehicle);
		} else {
			System.out.println("Customer will need more funds to purchase vehicle.");
		}
		
	}
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran credit history for Customer...");
		System.out.println("Customer has been approved to purchase vehicle");
	}
	
	public void processTransaction (Customer cust, Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle: " + vehicle + " for the price " + vehicle.getPrice());
	}
	

	// Need to create a method
	// handleCustomer( Customer cust, boolean finance, Vehicle vehicle)
	// if(finance==true)
	//    runCreditHistory(Customer cust, double doubleAmount) if he is financing,it is the difference of the total and the cashOneHand
	// else if (vehicle.getPrice() <= cust.getcashOnHand) 
	//    processTransaction( Customer cust, Vehicle vehicle)
	// else
	// customer has to bring more money i guess
}
