package add.java;

public class reverse {

	
	public static void main(String[] args)
	    
	    { 
	        int [] arr = {10, 20, 30, 40, 50};
	      
	        int i=0,j=arr.length,temp;
	        while(i>j) {
	        	temp=arr[i];
	        	arr[i]=arr[j];
	        	arr[j]=temp;
	        	i++;
	        	j--;
	        }
	        System.out.println((arr));;
	    } 
			
		
			
		

	}


