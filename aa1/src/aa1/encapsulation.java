package aa1;

public class encapsulation {
	private int age;
	private String name;
	


public int  getage() {
	 return age;
	
	
	
}

public void setage(int age) {
	if (age !=0 ) { 
	
		this.age=age;
		//System.out.println( " the age of theperson is"+" "+getage());
	}
		else {
			System.out.println("age is invaid");
		
		
	
	
		}
}
	

	public String getname() {
		return name;
	}
	public void setname(String name) {
		if(name.isEmpty() ) {

		
			this.name=name;
			//System.out.println("the name of the person is"+" "+getname());
			
		}
		
		else {
			System.out.println("the name is invalid");
			
			
		}
	}
		
		void display() {
			
			System.out.println("the name of the person is"+getname()+"the age of him is"+getage());
			
		}
	

}

