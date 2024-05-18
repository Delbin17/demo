package wes;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {6,9,8,23,2} ;
		int temp=0;
		
		System.out.println("array before asccending order");
		for(int i=0;i<num.length;i++) {
		
		
			System.out.print(num[i]+" ");
			
			//for(int i=0;i<num.length;i++) {
			 for(int j=i+1;j<num.length;j++) {
			if(num[i]>num[j]) {
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			
				System.out.println("the array allienegd in asscending order");
			}
				
			}
		    //for(i=0;i<num.length;i++) {
		    	//for(int j=i+1;j<num.length;j++) {
		    	 System.out.print(temp+" ");
		     }
		
	}

		
		  
}


