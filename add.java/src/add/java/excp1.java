package add.java;

public class excp1 {
	
	
	void excep2()throws ArithmeticException{
		throw new ArithmeticException("not valid id");
	}
	
	void ex3() throws ArithmeticException {
		excep2();
		
	}
	
	void a1() {
		try {
			int i=10/0;
		}
		
		catch(ArithmeticException e){
			System.out.println("0 cannot divided by any numbers ");
			
		}
finally {
	System.out.println("hi");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		excp1 z1=new excp1();
		z1.excep2();

	}
}
	


