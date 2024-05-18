package bank;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bankaccount a1=new bankaccount(363872752, "delbin", 600.0) ;

		a1.deposit(500);
		a1.withdraw(300);
		a1.displayDetails();
		
		Savingaccount a2=new Savingaccount(869789, "delb", 300, 2);
		a2.deposit(300);
		a2.withdraw(200);
		   a2.displayDetails();

}
}