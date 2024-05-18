package table.java;

public class student {
	int rollno;
	float grade;
	String name;

	student(int rollno,String name,float grade){
		this.rollno =rollno;
		
		this.name=name;
		this.grade=grade;
	}
	student(int r){
		rollno=r;
		
	}
	student(int r,float g){
		rollno =r;
		grade=g;
		
	}
	
	void call() {
		System.out.println(rollno+" "+grade+" "+ name);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student(222,"delbin",32.4f);
		student s2=new student(222);
		student s3=new student(2,9.8f);
		
		s1.call();
		s2.call();
		s3.call();
	
	}

}
