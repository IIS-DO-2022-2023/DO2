package abstractFactory;

import methodFactory.Bill;

public class KindergartenBill implements Bill {

	@Override
	public void pay() {
		System.out.println("Kindergaren bill payed.");
		
	}

	@Override
	public void calculateTotal() {
		System.out.println("Kindergarten bill calculated.");
		
	}


}
