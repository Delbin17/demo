package swap;
import java.util.Scanner;

public class primenot {
	 static void coint()throws countException {

		 
	 }
	 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num"+":");
		int  n =sc.nextInt();
		throw countException;
	  
	  int count=0;
	  for(int i=1;i<=n;i++) {
		  
		  try {
		  if(n/i==0) {
			  count++;
		  }  
		  }
		  catch (countException e) {
			  System.out.println("the value is invalid");
		  }
			  
		  }
	  
	
	  if(count==2) {
		  System.out.println("the number is prime");
		  
	  }
	  else {
		  System.out.println("the num is not aprim number");
	  }
	
	System.out.println(count);
}
}