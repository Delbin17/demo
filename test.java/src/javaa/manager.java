package javaa;

public class manager extends employee {
	 public String department;
	
	manager( String name,double salary,String department){
		super(name,salary);
		this.department=department;
		
	}
	public void displayDetails() {
	  System.out.println("name is="+name+"salary is ="+salary+"department is="+department);
	  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
