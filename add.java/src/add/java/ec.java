package add.java;

public class ec{
	public void divide(int a,int b) {
		try {
			
		
		int c=a/b;
		}
		catch(ArithmeticException e) {
			
			
		
			
			System.err.println("o"+e);	
			}
	}
		
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ec z1=new ec();
		z1.divide(60, 0);
		
		

		
		
	
	
}
}
