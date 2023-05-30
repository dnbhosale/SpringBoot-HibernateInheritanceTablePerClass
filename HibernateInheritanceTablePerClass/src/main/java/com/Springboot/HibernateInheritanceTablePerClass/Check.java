package com.Springboot.HibernateInheritanceTablePerClass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="bcheck")
public class Check extends Payment {
	
	private String checkNumber;

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	

}
