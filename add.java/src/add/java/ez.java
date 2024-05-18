package add.java;

import java.util.Arrays;

public class ez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40};
		int j=arr.length;
		int b[]=new int [j];
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			b[j-1]=arr[i];
			j--;
		}
		System.out.println(Arrays.toString(b));

	}

}
