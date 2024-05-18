package swap;

import java.util.Scanner;

public class twomethod {
	//Scanner sc=new Scanner(System.in);
	//System.out.print("enter the string:");
	   String n= "hello";
	String s="hello";
	void m1()throws StringException  {
		throw new StringException();
	}
		
	
	void m2()  {
		try {
			if(s!=n) {
				System.out.println("not match");
			}
		}
			catch (Exception e) {
				System.out.println("strings doesnot match");
			}
			
		
		
	}
	
	
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twomethod a1=new twomethod();
		a1.m2();
		
		
		

	}

}
