package add.java;

public class top {
	
	
 String a1= ("hi how are you");
 String vowel=("aeiou");

 
 
 void display()throws StringIndexOutOfBoundsException{
	 System.out.println("invalid String");
	 
 }
 
 
 void check () throws StringIndexOutOfBoundsException   {
	 try {
		/*if(a1.contains(vowel)) {
		System.out.println("hi");
	 
		}
		else
		{
			System.out.println("invalid string");
		}
		*/
		int c=10/0;
		
	 }
	 catch (StringIndexOutOfBoundsException e) {
		 System.out.println("conatain vowels"+e);
	 }
	 
 }
 
		 
	 public static void main(String[] args) {
		 top z1=new top();
		 z1.check();
		 
	 
	
 }

	}

