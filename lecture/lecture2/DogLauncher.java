public class DogLauncher {
	public static void main(String [] args) {
		Dog maya = new Dog(100); //Declaration, instantiation and assignment
		Dog yapster = new Dog(5);
		maya.makeNoise(); // Invocation
		Dog.maxDog(maya, yapster).makeNoise();
	}
}