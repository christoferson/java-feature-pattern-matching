package demo;

public class TryFeaturePatternMatching {

	public static void main(String[] args) {
		
		tryPatternMatchingOnInstanceOf();
		
	}
	
	private static void tryPatternMatchingOnInstanceOf() {
		
		Animal animal = new Lion();
		
		if (animal instanceof Parrot parrot) {
			parrot.chirp();
		} else if (animal instanceof Goldfish goldfish) {
			goldfish.swim();
		} else if (animal instanceof Lion lion) {
			lion.roar();
		} else {
			System.out.println(animal);
		}
		

	}
	
}
