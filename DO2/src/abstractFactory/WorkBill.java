package abstractFactory;

import methodFactory.Bill;

public class WorkBill extends BillFactory {

	@Override
	public Bill generateBill(String type) {
		if(type.equals("vat")) {
			return new VatBill();
		} else {
			return new TaxBill();
		}
	}

}
