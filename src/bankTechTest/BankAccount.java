package bankTechTest;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.Format;
import java.util.Date;


public class BankAccount {
	
	public ArrayList transactions = new ArrayList<>();
	
	public int balance = 0; 
	
	BankAccount(){
		
	}

	public void deposit(int amount) {
		Date date = new Date(); 
		Format formatDate = new SimpleDateFormat("yyyy.MM.dd");
		String strDate = formatDate.format(date);
		this.balance += amount;
		transactions.add("\n" + strDate + " || " + String.valueOf(amount) + " || " + "0" + " || " + String.valueOf(this.balance));	
		
	}
	
	public int withdraw(int amount) {
		return this.balance -= amount; 
		
	}
	
	public String printBalance() {
		String result = "Date || Credit || Debit || Balance ";
		
		for (int i = this.transactions.size() - 1; i >= 0; i--) {
			System.out.println(i);
			result += this.transactions.get(i);
			
		}
		System.out.println(result);
		return result;
	}
	
	  public static void main(){
		  BankAccount bank = new BankAccount();
		  bank.deposit(10);
		  bank.printBalance();
		    
	  }

}
