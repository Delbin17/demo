package table.java;

class parent{
	int  salary=40000;
}
 class child extends parent{
	int salary1=1000;
}

public class employee {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	child s1=new child();
	//parent s2=new parent();
	System.out.println("the salary is"+s1.salary);
	System.out.println("the salary is"+s1.salary1);
	
	}

}
