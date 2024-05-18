package add.java;

public class thro {
	
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int data=100/0;
			readFile("example.txt");
		}
		catch(IOException e) {
			System.out.println("invalid file");
		}
		catch (ArithmeticException e) {
			System.out.println("0 cant divide by any number");
		}
	}

		
		public void  addition(int data) {
			data=100/8;
			System.out.println(data);
			
		}
		



	public static  void readFile(String filename) throws IOException,ArithmeticException {
		

		throw new ArithmeticException();
	
		
	
		}
		
		// TODO Auto-generated method stub
		
	}


