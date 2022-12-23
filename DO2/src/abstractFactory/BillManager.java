package abstractFactory;

import methodFactory.Bill;

public class BillManager {
	Bill bill;
	BillFactory billFactory;
	
	public BillManager(BillFactory billFactory) {
		super();
		this.billFactory = billFactory;
	}
	
	public void processBill(String type) {
		bill = billFactory.generateBill(type);
		
		bill.calculateTotal();
		bill.pay();
	}
	
	

}
