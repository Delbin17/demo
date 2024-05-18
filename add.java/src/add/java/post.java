package add.java;

public class post {
	public int n;
	int arr[]= {23,56,4,3};

	
	public void didit( int n) throws ArithmeticException{
		 if(n<0) {
			//throw new ArithmeticException("please enter the positive number");
		}
		else {
			System.out.println("this is positive number");
			
		}
		 
		 
		 try {
			 System.out.println(arr[1]);
		//arr[5]=0;
	}
	catch(Exception e) {
		System.out.println("no space located already");
	}
	finally {
		System.out.println("hi guys");
	}
	
	}
}