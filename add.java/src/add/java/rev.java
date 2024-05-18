package add.java;


import java.util.Arrays;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {10,3,4,2,5};
		int i=0,j=a1.length,temp;
		while(i<j) {
			temp=a1[i];
			a1[i]=a1[j];
			a1[j]=temp;
			i++;
			j--;
		}
			System.out.println(Arrays.toString(a1));
		}
	}


