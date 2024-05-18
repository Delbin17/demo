package enc;

public abstract class car {
	private String name;
	private int num;
	


	
	  abstract void  model(String a);
	  
	  
	  
	  abstract void carnum(int n);
	  
	  
	  
	 public   String   getname() {
		  return name;
	  }
	  
	  void setname(String  a) {
		  
	
		  a=name;
	  }
	  
	  public int getnum() {
		  return num;
	  }
	  void setnum(int n) {
		  n=num;
	  }
}


