package swap;

public class vowelstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hll gys nd 8909jgesaoiusrqwdqrwrrwhhkj";
		int j=s.length();
		int count=0,countofe=0;
		for(int i=0;i<j;i++) {
			char c=s.charAt(i);
			
			switch(c) {
			case 'a': count++; break;
			case 'e': count++; break;
			case 'i': count++; break;
			case 'o': count++; break;
			case 'u': count++; break;
			}
		}
		
	if(count==0) {
			System.out.println("no vowel");}
				
				else {
					System.out.println(count+"vowels present in string");
				}
					
				
	}
}
				