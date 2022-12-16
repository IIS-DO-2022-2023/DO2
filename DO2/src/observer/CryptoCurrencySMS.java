package observer;

public class CryptoCurrencySMS implements Observer {
	private double bitcoinPrice;
	private double etherPrice;

	@Override
	public void update(double bitcoinPrice, double etherPrice) {
		this.bitcoinPrice = bitcoinPrice;
		this.etherPrice = etherPrice;
		
		sendSMS();
		
	}
	
	public void sendSMS() {
		System.out.println("New price of Bitcoin is:" + bitcoinPrice);
		System.out.println("New price of Ether is:" + etherPrice);
	}
}
