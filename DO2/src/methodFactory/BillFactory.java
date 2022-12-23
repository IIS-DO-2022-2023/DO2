package methodFactory;

public class BillFactory {
	
		public Bill generateBill(String type) {
			if (type.equals("electricity"))
				return new ElectricityBill();
			else if (type.equals("gas"))
				return new GasBill();
			else
				return new UtilityBill();
		}
	}

