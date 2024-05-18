package aa1;

  abstract class bankaccount {
	   int accountnumber;
	  String accountHolderName;
	  double Balance;
 
	 
	 bankaccount(int accountnumber,String accountHolderName,double balance){
		 this.accountnumber=accountnumber;
		 this.accountHolderName=accountHolderName;
		 this.Balance=balance;
	 }
		 
	 

	 
	 abstract  void deposit(double amount);
	 
	 abstract void withdraw(double amount);
	 
	 
 
 void displayDetails() {
	 System.out.println("accountnumber is="+accountnumber);
	 System.out.println("accountholder name is="+accountHolderName);
	 System.out.println("the account balance is="+Balance);
 }
 
 }
 