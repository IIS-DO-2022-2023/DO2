package methodFactory;

public class TestMethodFactory {

	public static void main(String[] args) {
		BillFactory billFactory = new BillFactory();
		BillManager billManager = new BillManager(billFactory);
		
		billManager.generateBill("gas");

	}

}
