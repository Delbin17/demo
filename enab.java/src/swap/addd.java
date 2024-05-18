package swap;

public class addd {
	
	
	static void addition()throws ArithmeticException {
		int a=11;
		int b=65;
		int c=a+b;
		if(c>20) {
			throw new ArithmeticException("the number should be smaller than 20");
		}
			
			else {
				System.out.print(c);
				
			}
	}

		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addd s1=new addd();
		s1.addition();

	}

}
