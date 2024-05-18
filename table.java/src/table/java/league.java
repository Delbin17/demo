package table.java;

 class league1 {
	void england() {
		System.out.println("epl");
		
	}
	void france() {
		System.out.println("l1");
		
	}
 }
	
	 class champions extends league1{
		
		void spain() {
			System.out.println("ll");
			
		}
	}
	class league{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		champions s1=new champions();
		s1.spain();
		s1.england();

	}
	}
 