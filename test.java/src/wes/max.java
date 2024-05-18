package wes;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num[]= {5,4,8,9,2,7,9};
    int max=num[0];
    
    for(int i=1;i<num.length;i++) {
    	if(num[i]>max) {
    		max=num[i];
    	
    }
    
	}
    System.out.println(max);

}
}
