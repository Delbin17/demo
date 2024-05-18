package add.java;

import java.util.Arrays;

public class merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int c[] =new int[a.length+b.length];
		int temp=0;
		for(int i=0;i<a.length;i++) {
			c[temp]=a[i];
			temp++;
		}
		for(int i=0;i<b.length;i++) {
			c[temp]=b[i];
			temp++;
		}
		for(int m:c)
		{
	System.out.println(m);
}

	
		System.out.println(Arrays.toString(c));
	}
}
