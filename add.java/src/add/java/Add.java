package add.java;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int a=100;
		int b=10;
		int c=a*b;
		
		
		try {
			int arr []=  {23,4,2,};
			System.out.println(arr[10]);		}
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println(r);
		}
		try {	
			int m=100/2;
			System.out.println(m);}
					catch(ArithmeticException o) {
			System.out.println(o);
			
			
		}	
		
		System.out.println("hello");
		System.out.println(c);
		//System.out.println(r);

	}


}
