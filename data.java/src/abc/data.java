//package abc;


public class data{
	int rollno;
	int marks;
data(int r,int m){
	
	rollno=r;
	marks=m;
}


 public void setTable (int r,int m) {
	
this.rollno=r;
this.marks=m;
}

	
public class classData{
	
public static void main (String[]args) {
	data add=new data(23,89);

	//add.setTable(45,56);
	System.out.println("the num and roll num of s1"+add.rollno);
	
	
}

}
}