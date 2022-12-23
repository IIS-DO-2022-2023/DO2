package methodFactory;

public class UtilityBill implements Bill {

	@Override
	public void pay() {
		System.out.println("Utility bill is payed...");

	}

	@Override
	public void calculateTotal() {
		System.out.println("Utility total calculated...");

	}

}
