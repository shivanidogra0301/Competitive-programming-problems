package dynamicProgramming;

public class NonAdjacentSubsetMaxSum {
	public static void main(String[] args) {
		int[] arr= {5,10,10,100,5,6};
		int oldinc=arr[0];
		int oldexc=0;
		int newinc=0,newexc=0;
		for(int i=1;i<arr.length;i++) {
			newinc=arr[i]+oldexc;
			newexc=Math.max(oldinc,oldexc);
			oldinc=newinc;
			oldexc=newexc;
		}
		System.out.println(Math.max(newinc, newexc));
	}
}
