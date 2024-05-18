package add.java;

public class sumaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,6,8};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		int average=sum/a.length;

		System.out.println(sum);
		System.out.println(average);


}
}
