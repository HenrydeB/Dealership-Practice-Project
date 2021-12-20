package car_dealership;
// Later on the data here will be changed to be able to take in data from the console and spit it out
public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer("Tom", "123 Some Street", 25000, 750);
		
		Vehicle vehicle = new Vehicle("BMW", "M3", 20000);
		
		Employee emp = new Employee();
		
		Vehicle car = new Vehicle("BMW", "M3", 20000);
		
		cust1.purchaseCar(vehicle, emp, false);
		
		boolean value = car.equals(vehicle);
		System.out.println(value);
		

	}

}
//Need to create a method
	// handleCustomer( Customer cust, boolean finance, Vehicle vehicle)
	// if(finance==true)
	//    runCreditHistory(Customer cust, double doubleAmount) if he is financing,it is the difference of the total and the cashOneHand
	// else if (vehicle.getPrice() <= cust.getcashOnHand) 
	//    processTransaction( Customer cust, Vehicle vehicle)
	// else
	// customer has to bring more money i guess