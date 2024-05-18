package swap;

import java.util.Scanner;

public class Fibo {
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the number:");
		int n=sc.nextInt();
		
		int a=1,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}
}

