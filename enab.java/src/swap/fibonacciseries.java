package swap;

import java.util.Scanner;

public class fibonacciseries {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		int a=1,b=1,t;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=3;i<=n;i++) {
			t=a+b;
			System.out.println(t);
			a=b;
			b=t;
			
			
		}
	
		
		

	}

}
