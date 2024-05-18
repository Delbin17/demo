package javaa;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee[] a1=new employee[4];
		a1[0]=new developer("delbin",30000,"java");
		a1[1]=new manager("ney",40000,"it");
		a1[2]=new developer("carl",50000,"node");
		a1[3]=new manager("leo",60000,"me");
		for(employee emp:a1) {
	
		emp.displayDetails();
		

}
	}
}