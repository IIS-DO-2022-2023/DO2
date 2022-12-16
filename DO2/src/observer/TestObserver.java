package observer;

public class TestObserver {

	public static void main(String[] args) {
		CryptoCurrencyPrice ccp = new CryptoCurrencyPrice();//observable
		CryptoCurrencySMS ccsms = new CryptoCurrencySMS();//observer
		
		ccp.addObserver(ccsms);
		
		ccp.setBitcoinPrice(200000);
		ccp.setEtherPrice(2000);	

	}

}
