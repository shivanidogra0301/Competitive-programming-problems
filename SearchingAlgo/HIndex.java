package SearchingAlgo;
// H index is the atleast h-papers cited for atleast h days. here think that index+1 is that
// particular day so what we want that the value(number of papers) should be equal or greater than
// that day

public class HIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// always use sorted array of decscending order
		int[] arr = {5,4,3,1,1};
		// as it is sorted we can use binary search.
		int lo = 0, hi = arr.length -1 ;
		int hindex = 0;
		while(lo <= hi) {
			int mid = lo+(hi-lo)/2;
			// mid is index and mid+1 is day no
			if(arr[mid] >= (mid+1)) {
				hindex = mid+1; // update hi
				lo = mid+1; // check for right half because if mid is satisfying the condition
				// all the element at left also will be;
			}else {
				//exclude mid and element after it because none of them will be true
				hi = mid -1;
			}
		}
		System.out.println(hindex);

	}

}
