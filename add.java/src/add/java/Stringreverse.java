package add.java;
import java.util.Arrays;

public class Stringreverse {

	 public static void main(String[] args) {
      String s="hellod";
      int j=s.length();
      String rev="";
      
      for(int i = j - 1; i >= 0; i--) {
  
    	  rev+= s.charAt(i);
    	  
      }
      System.out.println(rev);
      
      
	 }
}
      



