package enc;

public class train {
	private int num;
	private String name;
	
	
	
	
   public int getnum(int num) {
		return num;
	}
   public void setnum(int num) {
	   if(num>=0) {
	   this.num=num;
	   }
	   
	   else 
		   System.out.println("the num is invalid");
   
	  
	   
	  
   }
   public String getname(String name) {
	   
	   return name;
	}
  public void setname(String name) {
	    
	   this.name=name;
	   }
	   
	   	   
	  
  
   
   
   
   void Display() {
	   System.out.println("the name of the trai is="+num+name);
   }
   
	

}   
