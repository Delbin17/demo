package swap;

public class fiborec {
	
	static boolean fibo(int n) {
		int a=1,b=1,fibo;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=n;i++) {
			fibo=a+b;
			
			System.out.print(fibo(n));
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
