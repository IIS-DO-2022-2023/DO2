package strategy;

import java.util.Date;

public class CreditCardPayment implements Payment {
	private String lastName;
	private String firstName;
	private String creditCardNumber;
	private Date expirationDate;
	private String cvvNumber;

	public CreditCardPayment(String lastName, String firstName, String creditCardNumber, Date expirationDate,
			String cvvNumber) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.creditCardNumber = creditCardNumber;
		this.expirationDate = expirationDate;
		this.cvvNumber = cvvNumber;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Paid " + amount + " by credit card.");

	}

}
