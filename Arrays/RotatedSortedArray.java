package Arrays;
//Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
//Find the minimum element.
public class RotatedSortedArray {
	
	public static void main(String[] args) {
		int[] arr= {4,5,6,7,1,2,3};
		System.out.println("Minimum array element is "+ findMin(arr));
	}
	 public static int findMin(int[] nums) {
	        int n=nums.length;
	        if(nums[0]<nums[n-1]){
	            return nums[0];
	        }
	        if(n==0){
	            return 0;
	        }
	        if(n==1){
	            return nums[0];
	        }
	        if(n==2){
	            return Math.min(nums[0],nums[1]);
	        }
	        int beg=0,end=n-1;
	        int mid;
	        while(beg<=end){
	            mid=beg+(end-beg)/2;
	            if(nums[mid]>nums[mid+1]){
	                return nums[mid+1];
	            }
	            if(nums[mid]<nums[mid-1]){
	                return nums[mid];
	            }
	             if(nums[mid]>nums[0])
	                beg=mid+1;
	            else 
	                end=mid-1;
	        
	            
	        }
	            return -1;

	    }
}
