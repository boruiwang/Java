public class Dog {

	/* Instance variable */
	/* static is universial */
	public int size;
	
	/* Constructor */
	public Dog(int startSize) {
		size = startSize;
	}

	/* Non-static method */
	public void makeNoise() {
		if (size < 10) {
			System.out.println("horrific.");
		} else if (size < 30) {
			System.out.println("bark.");
		} else {
			System.out.println("woof woof!");
		}
	}

	/* No dogs should judge other dogs */
	public static Dog maxDog(Dog d1, Dog d2) {
		if (d1.size > d2.size)
			return d1;
		return d2;
	}
}