package Recursion;

public class printArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2,4,5};
//		displayArr(arr,0);
		ReverseDisplay(arr,0);
	}
	public static void displayArr(int[] arr,int idx) {
		if(idx==arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		displayArr(arr,idx+1);
	}
	public static void ReverseDisplay(int[] arr,int idx) {
		if(idx==arr.length) {
			return;
		}
		ReverseDisplay(arr,idx+1);
		System.out.println(arr[idx]);
	}

}
