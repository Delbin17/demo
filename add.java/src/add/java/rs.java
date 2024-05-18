package add.java;

public class rs {

			public static void main (String[] args) {

				String s="hello";
				int j=s.length();
						
				String rev = "";

		for(int i =j - 1; i >= 0; i--)
		{
		rev = rev + s.charAt(i);
		}

		System.out.println(rev);
				
			}
		
			


	}


