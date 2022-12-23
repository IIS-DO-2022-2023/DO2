package abstractFactory;

import methodFactory.Bill;

public class TaxBill implements Bill {

	@Override
	public void pay() {
		System.out.println("tax bill payed");
		
	}

	@Override
	public void calculateTotal() {
		System.out.println("tax bill calculated");
		
	}

	

}
