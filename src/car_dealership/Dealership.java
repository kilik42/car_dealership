package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 anything st");
		cust1.setCashOnHand(12000);
		Vehicle vehicle = new Vehicle();
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		
		
	}

}
