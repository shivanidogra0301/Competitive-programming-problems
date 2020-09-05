package dynamicProgramming;

public class SmallSubsetwithMaxBitwiseOr {
	public static void main(String[] args) {
		int[] arr= {5,1,4,3,2};
		int target=0;
		for(int i=0;i<arr.length;i++) {
			target=target|arr[i];
		}
		System.out.println(target);
	}
}
