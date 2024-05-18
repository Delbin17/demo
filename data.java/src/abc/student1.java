package abc;

/*public class  student1 {
	String s;
	int rollno;
	int m1;
	int m2;
	int m3;


	public  int  marksTotal() {
		return m1+m2+m3;
				}
	

	public static void main(String[] args) {
		student1 s1 =new student1();
		s1.rollno=232;
	       s1.m1=6;
	       s1.m2=98;
	       s1.m3=90;
	       System.out.println(s1.rollno+" "+s1.marksTotal()); 
	       
	      // student
	      student1 s2=new student1();
	      s2.rollno=234;
	      s2.m1=79;
	      s2.m2=80;
	      s2.m3=90;
	      System.out.println(s2.rollno+" "+s2.marksTotal());

	public class student1{
		int rollno;
		int marks;
	}
	class construct
		// TODO Auto-generated method stub

	}

}*/




public class student1{
	int rollno;
	int marks;
student1(int r,int m){
	
	rollno=r;
	marks=m;
}


 public void setTable (int r,int m) {
	
this.rollno=r;
this.marks=m;
}

	
public class classData{
	
public static void main (String[]args) {
	student1 add=new student1(23,89);

	//add.setTable(45,56);
	System.out.println("the num and roll num of s1"+add.rollno);
	
	
}

}
}
