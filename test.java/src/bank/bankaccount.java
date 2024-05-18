package bank;

public class bankaccount {
	 int accountNumber;
	 String accountHolderName;
        Double balance;
	
	

    bankaccount(int accountNumber,String accountHolderName, Double balance ){
	 this.accountNumber=accountNumber;
	 this.accountHolderName=accountHolderName;
	 this.balance=balance;
 }
 public void deposit(double amount) {
	 balance =balance +amount;
	 
	 
 }
 public  void withdraw(double amount) {
	 if(amount<=balance) {
	 balance=balance-amount;
	 
	 
 }

	
	else {
		System.err.println("transcation cancel due to insufficient funds");
	
	

	}
	 
 }
 
	 
	 public void  displayDetails() {
		 System.out.println("the account number is== "+accountNumber);
		 System.out.println("the account holder name== "+accountHolderName);
		 System.out.println("the account balance is== "+balance);
	 
	 
	 
 }
}
