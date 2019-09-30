package bankTechTest;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.Format;
import java.util.Date;


public class StatementPrinter {
	
	public String printBalance(BankAccount bankAccount) {
		String result = "Date || Credit || Debit || Balance ";
		
		for (int i = bankAccount.transactions.size() - 1; i >= 0; i--) {
			System.out.println(i);
			result += bankAccount.transactions.get(i);
			
		}
		System.out.println(result);
		return result;
		
	}

}
