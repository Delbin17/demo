package bank;

public class Savingaccount  extends bankaccount{
	 double interestRate;
	
	Savingaccount(int accountNumber,String accountHolderName, double balance ,double interestRate){
		
		super(accountNumber,accountHolderName,balance);
		this.interestRate=interestRate;
		
	}
	
	public void  withdraw(double amount) {
		
    
		
		if(amount<=balance) {
			balance-=amount;
		
		}
		else {
			System.err.println("transcation cancel due to insufficient funds");
		
		
	
		}
	
	
	
	
	
	}
}


