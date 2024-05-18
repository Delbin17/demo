package add.java;

import java.util.Arrays;

public class dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {3,2,4,3,1,6,6,7,8,9,7,1};
		int j=a1.length;
		int b[]=new int[j];
		
		System.out.println(Arrays.toString(a1));
		for(int i=0;i<a1.length;i++) {
			b[j-1]=a1[i];
			j--;
		}
		System.out.println(Arrays.toString(b));
	
	
		

	}

}
		
	

		