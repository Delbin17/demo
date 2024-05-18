package swap;

public class reverseastring {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello guyzz";
		int j=s.length();
		String b="";
		for(int i=j-1;i>=0;i--) {
			b+=s.charAt(i);
		
		}
		System.out.println(b);

	}

}
