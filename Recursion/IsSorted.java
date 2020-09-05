package Recursion;

public class IsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,300,8,8,9};
		System.out.println(isSorted(arr,4));
		generateBS(3,"");
	}
	public static boolean isSorted(int[] arr,int n) {
		if(n == 0) {
			return true;
		}
		if(arr[n]>=arr[n-1]) {
			return isSorted(arr, n-1);
		}
			return false;
		
	}
	public static void generateBS(int n , String psf) {
		if(n == 0) {
			System.out.println(psf);
			return;
		}
		generateBS(n-1,psf+0);
		generateBS(n-1,psf+1);
	}
}
