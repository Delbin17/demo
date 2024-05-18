package inherit.java;

class vehicle1{

	public void drive(int a) {
		System.out.println(a);
		
	}
}
class car extends vehicle1{
	public void drive(int a,int b) {
		System.out.println(a*b);
		
	}
}

class superCar extends car{
	public void drive(int a,int b,int c) {
		System.out.println(a+b+c);
		}
}



public class vehicle  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       vehicle1 a1=new vehicle1();
      a1.drive(2);
       //a1.start();
       
       car a2=new car();
      //a2.update="car started";
       a2.drive(8, 9);
      // a2.drive();
       
       superCar a3=new superCar();
       //a3.update="then";
       a3.drive(3, 9,4);
       //a3.drive();
       
	}

}
