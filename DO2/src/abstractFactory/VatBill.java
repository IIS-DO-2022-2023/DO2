package abstractFactory;

import methodFactory.Bill;

public class VatBill implements Bill {

	@Override
	public void pay() {
		System.out.println("Vat bill payed.");
		
	}

	@Override
	public void calculateTotal() {
		System.out.println("Vat bill payed.");
		
	}

	

}
