package point.java;

//import table.java.decimal;

public class oper{
	public  void book(int n,int m) {
		int add;
		add=n+m;
		System.out.println(" total num of books is"+add);
		//return add;
		
	}
	public  void  user(int a) {
		int age;
	 age=a;
			
System.out.println(" your age is"+age);
		//return add;
		
	}
	public  void play(int n,int m) {
	      int science;
		  science=n;
		  int maths;
		  maths=m;
		  System.out.println("total num of books is "+n+m);
		  //return science;
		  //return maths;
		  
	}
		
		
	public static void main( String args[]) {
		oper r=new oper()	;
		r.book(4,5);
		 r.user(21);
	     r.play(3,6);

}
}
		
