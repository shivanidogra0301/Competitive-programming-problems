package SearchingAlgo;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {10,23,45,78,90}; //sorted array
		int lo = 0, hi = arr.length-1;
		int data = 78;
		while(lo <= hi) {
			int mid = lo+(hi-lo)/2;
			if(arr[mid] == data) {
				System.out.println("Element found at "+ mid+" index");
				break;
			}
			else if(arr[mid] > data) {
				hi = mid - 1;
			}
			else {
				lo = mid + 1;
			}
		}
		if(lo > hi) {
			System.out.println("Not found");
		}
	}

}
