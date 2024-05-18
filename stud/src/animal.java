public class animal {
	String  sound;
	public void makeSound() {
	
		System.out.println(sound);
	
}
	class dog extends animal{
		public void makesound(String sound) {
			System.out.println(sound);
			
			
			
		}
	}
		
	class animal2{
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	animal s1 =new animal();
	s1.sound="woof";

	}
	