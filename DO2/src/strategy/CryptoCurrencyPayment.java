package strategy;

public class CryptoCurrencyPayment implements Payment {
	private String address;

	@Override
	public void pay(int amount) {
		System.out.println("Paid " + amount + " by crypto currency.");

	}

}
