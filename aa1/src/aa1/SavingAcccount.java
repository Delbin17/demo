package aa1;


class SavingAcccount extends bankaccount {

	SavingAcccount(int accountnumber, String accountHolderName, double balance) {
		super(accountnumber, accountHolderName, balance);
		
		// TODO Auto-generated constructor stub
	}
   void deposit(double amount) {
	   Balance +=amount;
   }

   
   void withdraw(double amount) {
	   if(amount<Balance) {
		   Balance-=amount;
		   
	   }
		   else
			   System.out.println("insufficient funds");
		   
   }
}
   
