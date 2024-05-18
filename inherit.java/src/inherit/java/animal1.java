package inherit.java;



 class animal{
	String  sound;
	public void makeSound(String sound) {
	
		System.out.println(sound);
	
}
 }
	class dog extends animal{
		public void makesound(String sound2) {
			System.out.println(sound2);
			
			
			
		}
	}
		
	
class cat extends dog{
	public static void legs(int a) {
		System.out.println(a);
	}
}
	
	
public class animal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal s1=new animal();
		s1.makeSound("bow");
		
		
		cat a1=new cat();
        a1.makeSound("woof");
        a1.legs(4);
        
        
        
		

	}

}
 
