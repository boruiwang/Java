public class WhileLoopDemo {
	public static void main (String[] args) {
		int x = 1;
		System.out.println("Before the loop");
		while (x < 3) {
			System.out.println("In the loop");
			System.out.println("Value of x is " + x);
			x += 1;
		}
		System.out.println("After the loop");
	}
}