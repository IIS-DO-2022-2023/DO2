package observer3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CryptoCurrencySMS implements PropertyChangeListener {
	private double bitcoinPrice;
	private double etherPrice;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getPropertyName().equals("bitcoin")) {
			bitcoinPrice = (double) evt.getNewValue();
		}
		if(evt.getPropertyName().equals("ether")) {
			etherPrice = (double) evt.getNewValue();
		}	
		
		sendSMS();
	}
	
	public void sendSMS() {
		System.out.println("New price of Bitcoin is:" + bitcoinPrice);
		System.out.println("New price of Ether is:" + etherPrice);
	}

}
