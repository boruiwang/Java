public class hw1 {

	// exercise 1
	public static void DrawTriangle(int N) {
		int row = 1;

		while(row <= N) {
			int col = 0;
			while(col < row) {
				System.out.print("*");
				col += 1;
			}
			row += 1;
			System.out.println();
		}
	}

	// exercise 2 find max()
	public static int max(int[] m) {
		int max = m[0];
		for(int i = 1; i < m.length; i = i + 1) {
			if (max < m[i]) max = m[i];
		}
		return max;
	}

	public static void main(String[] args) {
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
		int maxNumber = max(numbers);
		System.out.println(maxNumber);
	/*	
		int SIZE = Integer.parseInt(args[0]);
		DrawTriangle(SIZE);
	*/
	}
}