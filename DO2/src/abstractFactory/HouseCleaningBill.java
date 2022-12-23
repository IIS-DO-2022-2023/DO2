package abstractFactory;

import methodFactory.Bill;

public class HouseCleaningBill implements Bill {

	@Override
	public void pay() {
		System.out.println("House bill payed.");
		
	}

	@Override
	public void calculateTotal() {
		System.out.println("House bill calculated.");
		
	}

	

}
