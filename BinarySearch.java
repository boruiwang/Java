public class BinarySearch {

	public static int binarySearch(int key, int[] a, int lo, int hi) {
		if(lo > hi)
			return -1;

		int mid = lo + (hi - lo) / 2;
		System.out.println(a[mid]);
		if(key < a[mid])
			return binarySearch(key, a, lo, mid - 1);
		else if(key > a[mid])
			return binarySearch(key, a, mid + 1, hi);
		else
			return mid;
	}

	public static void main(String args[]) {
		int[] list = {1, 4, 5, 7, 10, 12, 15};
		int key = 5;
		int result = binarySearch(key, list, 0, list.length - 1);
		if(result == -1)
			System.out.println("No such key");
		else
			System.out.println("the key is at " + result + " index");
	}

}