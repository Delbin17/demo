package table.java;

public class decimal {
	public  float  show(float n,float m) {
		float add;
		add=n+m;
		return add;
		
	}
	public  void  display(int n,int m) {
		int add;
		add=n+m;
System.out.println(add);
		//return add;
		
	}
	public  double play(double n,double m) {
	      double add;
		  add=n+m;
		  return add;
	}
		
		
	public static void main( String args[]) {
		decimal r=new decimal()	;
		System.out.println(r.show(0.4f, 5.6f));
		 r.display(8, 6);
	System.out.println(	r.play(0.8, 9.7));

}
}