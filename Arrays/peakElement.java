package Arrays;

public class peakElement {

	public static void main(String[] args) {
		int[] arr= {1,2,3,1};
		System.out.println("Peak Element index  is "+findPeakElement(arr));
	}
	
	public static int findPeakElement(int[] nums) {
        int l=0,r=nums.length-1;
        int mid;
        while(l<r){
            mid=(l+r)/2;
            if(nums[mid]>nums[mid+1])
                r=mid;
            else{
                l=mid+1;
            }
        }
        return l;
    }

}
