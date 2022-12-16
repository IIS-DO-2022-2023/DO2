package observer3;

import observer3.CryptoCurrencyPrice;
import observer3.CryptoCurrencySMS;

public class TestObserver3 {

	public static void main(String[] args) {
		CryptoCurrencyPrice ccp = new CryptoCurrencyPrice();
		CryptoCurrencySMS ccsms = new CryptoCurrencySMS();
		
		ccp.addPropertyChangeListener(ccsms);
		
		ccp.setBitcoinPrice(200000);
		ccp.setEtherPrice(2000);
	}

}
