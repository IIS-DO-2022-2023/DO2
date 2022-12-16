package observer2;

public class TestObserver2 {

	public static void main(String[] args) {
		CryptoCurrencyPrice ccp = new CryptoCurrencyPrice();
		CryptoCurrencySMS ccsms = new CryptoCurrencySMS();
		
		ccp.addObserver(ccsms);
		
		ccp.setBitcoinPrice(200000);
		ccp.setEtherPrice(2000);

	}

}
