package Arrays;

///duplicates are included
public class RotatedSortedArray2 {
	public static void  main(String[] args) {
		int[] arr= {2,2,2,0,1};
		System.out.println(("Minimum element is "+findMin(arr)));
	}
	public static int findMin(int[] nums) {
        int l = 0, r = nums.length-1;
	 while (l < r) {
		 int mid = (l + r) / 2;
		 if (nums[mid] < nums[r]) {
			 r = mid;
		 } else if (nums[mid] > nums[r]){
			 l = mid + 1;
		 } else {  
			 r--;  //nums[mid]=nums[r] no idea, but we can eliminate nums[r];
		 }
	 }
	 return nums[l];
    }
}
