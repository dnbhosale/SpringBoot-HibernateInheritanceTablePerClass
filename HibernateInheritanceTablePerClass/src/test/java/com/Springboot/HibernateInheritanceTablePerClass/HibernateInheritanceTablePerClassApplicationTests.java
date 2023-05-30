package com.Springboot.HibernateInheritanceTablePerClass;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateInheritanceTablePerClassApplicationTests {

	@Autowired
	private PaymentRepository pr;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void createPayment() {
		
		CreditCard cc=new CreditCard();
		cc.setAmount(213);
		cc.setCreditCardNumber("4546657545646");
		cc.setId(2323);
		pr.save(cc);
		
	}
	
	@Test
	public void createPayment2() {
		
		Check cc=new Check();
		cc.setAmount(2143);
		cc.setCheckNumber("454623257545646");
		cc.setId(23233);
		pr.save(cc);
		
	}

}
