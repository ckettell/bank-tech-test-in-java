package bankTechTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;
import org.hamcrest.Matcher;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.*;



import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Calendar;  


import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void userDepositsInTheirAccount() {
		BankAccount account = new BankAccount();
		account.deposit(10);
		
		assertTrue(account.balance == 10);
	}
	
	@Test
	void userCanWithdrawMoneyFromTheirAccount() {
		BankAccount accountTwo = new BankAccount();
		accountTwo.deposit(25);
		accountTwo.withdraw(20);
		
		assertTrue(accountTwo.balance == 5);
	}
	
	@Test
	void recordsTimeWhenUserMakersADeposit() {
		BankAccount account = new BankAccount();
		account.deposit(10);
		Date date = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");  
		String strDate = dateFormat.format(date);  
		assertThat(account.printBalance(), containsString(strDate));
								
	}

}
