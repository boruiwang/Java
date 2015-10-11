public class hw1 {
	
	public static void main(String[] args) {
		int SIZE = 5;
		int row = 1;

		while(row <= SIZE) {
			int col = 0;
			while(col < row) {
				System.out.print("*");
				col += 1;
			}
			row += 1;
			System.out.println();
		}
	}
}