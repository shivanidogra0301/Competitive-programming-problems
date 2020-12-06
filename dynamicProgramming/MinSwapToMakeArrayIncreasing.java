package dynamicProgramming;
//We have two integer sequences A and B of the same non-zero length.
//We are allowed to swap elements A[i] and B[i].  
//Note that both elements are in the same index position in their respective sequences.

//At the end of some number of swaps, A and B are both strictly increasing.  
//(A sequence is strictly increasing if and only if A[0] < A[1] < A[2] < ... < A[A.length - 1].)

//Given A and B, return the minimum number of swaps to make both sequences strictly increasing.  
//It is guaranteed that the given input always makes it possible.

public class MinSwapToMakeArrayIncreasing {
    public static void main(String[] args) {
		
		int[] A= {2,3,5,4};
		int[]B= {1,2,3,7};
		System.out.println("Minimum Number of swaps "+ minSwap(A,B));
		
	}
	public static int minSwap(int[] A, int[] B) {
        int n1=0,s1=1;
        for(int i=1;i<A.length;i++){
            int n2=Integer.MAX_VALUE,s2 =Integer.MAX_VALUE;
            if(A[i]>A[i-1]&& B[i]>B[i-1]){
                n2=n1;
                s2=s1+1;
            }
            if(A[i]>B[i-1]&&B[i]>A[i-1]){
                n2=Math.min(n2,s1);
                s2=Math.min(s2,n1+1);
            }
            n1=n2;
            s1=s2;
        }
        return Math.min(n1,s1);
    }
}
