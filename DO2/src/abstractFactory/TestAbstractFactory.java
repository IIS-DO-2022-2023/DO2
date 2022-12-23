package abstractFactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		WorkBill workBill = new WorkBill();
		BillManager billManager = new BillManager(workBill);
		
		billManager.processBill("tax");

	}

}
