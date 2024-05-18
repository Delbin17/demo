package add.java;

public class exception{
	
		 static int a=10;
		 static int b=0;
		 
		 public static void main(String []args) {   
				
		 int arr[]=new int[10];
		try {
			//int c=a/b;
		System.out.println(arr[12]);
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("the b1 never gona be zero"+e);
	}
		
		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(arr[11]);
			
			System.out.println("its out of space on memory you have provided"+e);
			
		
			
			
		}
		catch (Exception e){
			
			
			System.out.println("whats"+e);
			
		
		}finally {
			System.out.println("hi everyone");
		}
		
		
			System.out.println("hello");
			
		
		 
		
		
			
	 }

}


