package wes;

public class minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {34,87,98,3,56,21,0};
		int min=num[0];
		
		for(int i=1;i<num.length;i++) {
		if(num[i]<min) {
			min=num[i];
		}
		}
		System.out.println(min);

	}

	}
 