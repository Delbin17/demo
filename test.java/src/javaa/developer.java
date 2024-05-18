package javaa;

public class developer extends employee {
	public String programinglanguage;
	
	developer(String name,double salary,String programinglanguage){
		super(name,salary);
		this.programinglanguage=programinglanguage;
		
	}
	 public void displayDetails() {
		System.out.println("name is ="+name+"salary is ="+salary+"programming language is="+programinglanguage);
	}

}
