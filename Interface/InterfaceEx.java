package Interface;

interface Animal { // interface class
	// interface methods (no concrete code)
	void animalNoise();
	void sleep();
}

class Pig implements Animal { // implement the interface class
	// define interface methods
	public void animalNoise() {
		System.out.println("Oink Oink");
	}
	
	public void sleep() {
		System.out.println("Pig sleeping");
	}
}

class Cow implements Animal { // implement the interface class
	// define interface methods
	public void animalNoise() {
		System.out.println("Moooo");
	}
	
	public void sleep() {
		System.out.println("Cow sleeping");
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pig myPig = new Pig();
		myPig.animalNoise();
		myPig.sleep();
		
		Cow myCow = new Cow();
		myCow.animalNoise();
		myCow.sleep();
	}

}
