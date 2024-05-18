package aa1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankaccount S1=new  SavingAcccount(1343,"del",600);
		S1.deposit(600);
		S1.withdraw(1300);
		S1.displayDetails();
	}

}
