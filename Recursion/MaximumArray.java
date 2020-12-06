package Recursion;

public class MaximumArray {

	public static void main(String[] args) {
		int[] arr= {8,8,6,1,8};
//		System.out.println(Max(arr,0));
//		System.out.println(firstindex(arr,0,8));
//		System.out.println(lastindex(arr,0,8));
		
		int[] ans=allindexes(arr,0,8,0);
		for (int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}
	public static int Max(int[]arr,int idx) {
		if(idx==arr.length) {
			return 0;
		}
		int recans=Max(arr,idx+1);
		return Math.max(arr[idx], recans);
		
	}
	public static int firstindex(int[]arr,int idx,int data) {
		if(idx==arr.length) {
			return -1;
		}
		if(arr[idx]==data) {
			return idx;
		}
		int recans=firstindex(arr,idx+1,data);
		return recans;
	}
	public static int lastindex(int[]arr,int idx,int data) {
		if(idx==arr.length) {
			return -1;
		}
		int recans=lastindex(arr,idx+1,data);
		if(recans==-1) {
			if(arr[idx]==data) {
				return idx;
			}
			else {
				return -1;
			}
		}else {
			return recans;
		}
	}
	public static int[] allindexes(int[]arr,int idx,int data,int fsf) {
		if(idx==arr.length) {
			return new int[fsf];
		}
		if(arr[idx]==data) {
			fsf++;
		}
		int[] ans=allindexes(arr,idx+1,data,fsf);
		if(arr[idx]==data)
		ans[fsf-1]=idx;
		return ans;
		
	}
}
