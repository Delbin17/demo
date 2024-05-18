package aa1;

public class buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("javaexcerise");
		
		s1.replace(3,4,"l");
		s1.delete(0,3);
		s1.insert(0, "o");
		s1.reverse();
		System.gc();
	
		
		
		
		System.out.println(s1);

	}

}
