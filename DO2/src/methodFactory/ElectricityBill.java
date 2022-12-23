package methodFactory;

public class ElectricityBill implements Bill {

	@Override
	public void pay() {
		System.out.println("Electricity bill is payed...");

	}

	@Override
	public void calculateTotal() {
		System.out.println("Electricity total calculated...");

	}

}
