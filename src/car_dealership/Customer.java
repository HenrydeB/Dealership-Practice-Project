package car_dealership;

public class Customer {
	
	private String name;
	private String address;
	private double cashOnHand;
	private int creditScore;
	
	
	public Customer(String name, String address, double cashOnHand, int creditScore) {
		super();
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
		this.creditScore = creditScore;
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
		address += "Dealership City";
		this.address = address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		cashOnHand += 500;
		this.cashOnHand = cashOnHand;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		emp.handleCustomer(this, finance, vehicle);
		
		
		
	}
}