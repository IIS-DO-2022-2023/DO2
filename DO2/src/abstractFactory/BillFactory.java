package abstractFactory;

import methodFactory.Bill;

public abstract class BillFactory {
	public abstract Bill generateBill(String type);

}
