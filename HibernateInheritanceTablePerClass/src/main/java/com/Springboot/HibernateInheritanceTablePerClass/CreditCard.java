package com.Springboot.HibernateInheritanceTablePerClass;

import javax.persistence.Entity;

@Entity
public class CreditCard extends Payment{
	
	private String CreditCardNumber;

	public String getCreditCardNumber() {
		return CreditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		CreditCardNumber = creditCardNumber;
	}
	

}
