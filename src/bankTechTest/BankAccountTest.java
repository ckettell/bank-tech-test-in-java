package bankTechTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void userDepositsInTheirAccount() {
		BankAccount account = new BankAccount();
		assertEquals(account.balance = 10, account.deposit(10));
	}

}
