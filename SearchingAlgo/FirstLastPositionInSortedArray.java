package SearchingAlgo;

public class FirstLastPositionInSortedArray {
	 public static int[] searchRange(int[] nums, int target) {
	      int lo = 0, hi = nums.length - 1;
	      int[] ans = {-1,-1};
	      int found = 0;
	      // for first occurance
	      while(lo <= hi){
	          int mid = lo + (hi-lo)/2;
	          if(nums[mid] == target){
	              ans[0] = mid;
	              hi = mid - 1;
	              found = 1;
	              
	          }
	          else if(nums[mid] > target){
	              hi = mid - 1;
	          }
	          else{
	              lo = mid + 1;
	          }
	      }
	      if(found == 0){
	          return ans;
	      }
	      // for last occurence
	       lo = 0;
	       hi = nums.length - 1;
	        while(lo <= hi){
	          int mid = lo + (hi-lo)/2;
	          if(nums[mid] == target){
	              ans[1] = mid;
	              lo = mid + 1;
	          }
	          else if(nums[mid] > target){
	              hi = mid - 1;
	          }
	          else{
	              lo = mid + 1;
	          }
	      }
	       return ans;
	   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,7,7,8,8,10};
		int target = 8;
		int[] ans = searchRange(arr,target);
		System.out.println(ans[0]+","+ans[1]);
		

	}

}
