package add.java;

public class greatestandsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,6,7,8,9,4};
		int s=arr[0];
		int s1=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(s>arr[i]) 
				s=arr[i];
			}
			
			for(int i1=0;i1<arr.length;i1++) {
				if(s1<arr[i1]) 
					s1=arr[i1];
				}
			
			System.out.println(s);
			
			
		
		System.out.println(s1);

	}

}
