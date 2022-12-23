package methodFactory;

public class GasBill implements Bill {

	@Override
	public void pay() {
		System.out.println("Gas bill is payed...");

	}

	@Override
	public void calculateTotal() {
		System.out.println("Gas total calculated...");

	}

}
