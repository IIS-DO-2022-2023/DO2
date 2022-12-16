package observer2;

import java.util.Observable;
import java.util.Observer;

public class CryptoCurrencySMS implements Observer {
	private double bitcoinPrice;
	private double etherPrice;

	@Override
	public void update(Observable o, Object arg) {
		CryptoCurrencyPrice ccp = (CryptoCurrencyPrice) o;
		bitcoinPrice = ccp.getBitcoinPrice();
		etherPrice = ccp.getEtherPrice();
		
		sendSMS();
		
	}
	
	public void sendSMS() {
		System.out.println("New price of Bitcoin is:" + bitcoinPrice);
		System.out.println("New price of Ether is:" + etherPrice);
	}

}
