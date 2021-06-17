package demo;

public class TryFeaturePatternMatching {

	public static void main(String[] args) {
		
		tryTraditionalInstanceOf();
		
		tryInstanceOfWithPatternMatching();
		
		tryInstanceOfWithPatternMatchingInline();
		
		tryPatternMatchingOnInstanceOf();
		
	}
	
	private static void tryTraditionalInstanceOf() {
		
		Object obj = "foo";
		
		if (obj instanceof String) {
		    String str = (String) obj;
		    System.out.println(str.toUpperCase()); // Use str
		} else {
			System.out.println("Unknown Type");
		}

	}
	
	private static void tryInstanceOfWithPatternMatching() {
		
		Object obj = "foo";
		
		if (obj instanceof String str) {
			//str = "bar"; // Compile Error : str is final
			System.out.println(str.toUpperCase()); // Use str
		} else {
			System.out.println("Unknown Type");
		}

	}
	
	// str is final
	private static void tryInstanceOfWithPatternMatchingInline() {
		
		Object obj = "foo";
		
		if (obj instanceof String str && str.startsWith("foo")) {
			System.out.println(str.toUpperCase()); // Use str
		} else {
			System.out.println("Unknown Type");
		}

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
