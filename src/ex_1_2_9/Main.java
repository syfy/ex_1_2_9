package ex_1_2_9;

public class Main {
	public static int rank(int key, int[] a, Counter counter) { // Array must be
																// sorted.
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) { // Key is in a[lo..hi] or not present.
			counter.incrementTotalCount();
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]){
				hi = mid - 1;
			
			}
			else if (key > a[mid]){
				lo = mid + 1;
				//counter.incrementTotalCount();
			}
			else{
				//counter.incrementTotalCount();

				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
			int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
			Counter counter = new Counter();
			
			System.out.println(rank(11,arr,counter)+" Counter Value " +counter);
			
	}
}
