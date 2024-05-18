package add.java;

public class number {
	static void num(int n) 
	{
	
		if	(n%2!=0) {
				throw new ArithmeticException("Please enter an even number");
		}
				else {
					System.out.println("the num  is even");
}
	}
		public static void main(String[] args) {
		
		num(50);
		System.out.println("hello");

	}

}
